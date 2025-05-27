# grupo1
Repositório do grupo 1

## Membros
* Diogo - @DiFreire2402 - Backend
* Arthur - @ArtTech-cloud - Frontend

  # SentinelCore - Documento Técnico Inicial (Entrega da etapa 1 do projeto)

## Seção 1 - Introdução

### Justificativa
A crescente demanda por soluções de segurança mais inteligentes e proativas evidencia a limitação dos sistemas tradicionais de monitoramento. Alarmes passivos e câmeras convencionais não são suficientes para impedir ou reagir de forma eficaz a ameaças reais. Diante disso, é urgente o desenvolvimento de tecnologias que associem vigilância com inteligência artificial, automação e resposta imediata.

### Descrição do Problema
Atualmente, a maioria das câmeras de segurança apenas grava ou envia notificações genéricas. Isso resulta em atrasos na resposta a invasões, vandalismos e outras ocorrências críticas. Além disso, não há integração prática entre sistemas de monitoramento e serviços de emergência, e usuários não possuem controle em tempo real eficiente.

### Motivação
A SentinelCore surge da necessidade de criar uma solução de segurança autônoma, inteligente e conectada. Um sistema que não apenas detecte, mas compreenda e reaja a situações de risco, garantindo proteção preventiva, conforto e agilidade para usuários residenciais e corporativos.



## Seção 2 - Plano

### Objetivo Geral
Desenvolver uma câmera de segurança inteligente integrada a um sistema de IA capaz de identificar ameaças em tempo real, acionar automaticamente os serviços de emergência e permitir controle total via dispositivo móvel.

### Objetivos Específicos
- Projetar uma câmera com sensores e hardware compatíveis com processamento embarcado.  
- Criar uma IA com algoritmos de visão computacional para detecção de invasão, reconhecimento facial e análise de comportamento.  
- Desenvolver um aplicativo móvel para controle remoto, notificações e feedback em tempo real.  
- Integrar o sistema com APIs de emergência (polícia, bombeiros, segurança privada).  
- Garantir que o sistema funcione com baixo consumo de energia e alta disponibilidade.

  # Documentação de Diagramas do Sistema de Câmeras

Este documento apresenta os principais diagramas UML que descrevem a estrutura e o comportamento do sistema de câmeras inteligentes.

---

## 1. Diagrama de Caso de Uso

Este diagrama ilustra as interações entre o *Usuário* (ator principal) e as funcionalidades (casos de uso) do *Sistema de Câmeras*. Ele mostra o que o sistema faz do ponto de vista do usuário, sem entrar em detalhes de como essas ações são realizadas.

No seu diagrama, o Usuário pode:
* *Assistir Câmeras ao vivo*: Acompanhar as imagens em tempo real.
* *Assistir replay das câmeras*: Rever gravações anteriores.
* *Histórico de Visitantes*: Consultar registros de pessoas identificadas como visitantes.
* *Histórico de Intrusos*: Acessar um log de detecções de intrusos.

```plantuml
@startuml
left to right direction

actor Usuário

rectangle "Sistema de Câmeras" {
  usecase "Assistir Câmeras ao vivo" as UC1
  usecase "Assistir replay das cameras" as UC2
  usecase "Histórico de Visitantes" as UC3
  usecase "Histórico de Intrusos" as UC4
}

Usuário --> UC1
Usuário --> UC2
Usuário --> UC3
Usuário --> UC4
@enduml

Para visualizar este diagrama: Você pode copiar o código PlantUML acima e colá-lo em um editor online como PlantUML Online Server ou usar um plugin de PlantUML em sua IDE.
2. Diagrama de Sequência (Detecção de Invasão)
Este diagrama detalha a ordem das interações e mensagens trocadas entre os diferentes componentes do sistema durante um cenário específico: a detecção de uma invasão. Ele é lido de cima para baixo, mostrando o fluxo temporal dos eventos.
A sequência de eventos é a seguinte:
 * O Usuário ativa a Câmera Smart.
 * A Câmera Smart captura uma imagem e a envia para o Servidor.
 * O Servidor encaminha a imagem para o Módulo de IA para processamento e análise.
 * O Módulo de IA retorna o resultado (ameaça detectada) para o Servidor.
 * O Servidor envia um alerta para a API Emergência.
 * O Servidor notifica o Usuário através do aplicativo.
<!-- end list -->
@startuml
!theme plain

actor Usuário
participant Câmera as "Câmera Smart"
participant Servidor
participant IA as "Módulo de IA"
participant APIEmergencia as "API Emergência"

Usuário -> Câmera: Ativação
Câmera -> Servidor: Imagem capturada
Servidor -> IA: Processamento e Análise
IA --> Servidor: Resultado (ameaça detectada)
Servidor -> APIEmergencia: Envio de alerta
Servidor --> Usuário: Notificação via App
@enduml

Para visualizar este diagrama: Você pode copiar o código PlantUML acima e colá-lo em um editor online como PlantUML Online Server ou usar um plugin de PlantUML em sua IDE.
3. Diagrama de Classes
O diagrama de classes apresenta a estrutura estática do sistema, mostrando as classes, seus atributos (dados que armazenam) e métodos (ações que podem realizar), além dos relacionamentos entre elas.
As classes principais são:
 * CâmeraSmart: Representa o dispositivo de câmera, com atributos como id, status e localização, e métodos para detectarEvento(), enviarImagem() e acionarAlerta().
 * Usuario: Representa o usuário do sistema, com nome, telefone e id_autenticacao, e métodos para visualizarFeed(), configurarAlerta() e consultarLogs().
 * Servidor: O componente central que gerencia o sistema, possuindo um bancoDados e uma listaAlertas, com métodos para processarImagem(), reconhecerRosto() e interagirAPI().
As setas indicam as associações e a direção das dependências/interações, por exemplo, a CâmeraSmart envia imagens para o Servidor, e o Servidor notifica ou gerencia alertas para o Usuário.
@startuml
!theme plain

class CâmeraSmart {
  - id: String
  - status: String
  - localização: String
  + detectarEvento(): void
  + enviarImagem(): void
  + acionarAlerta(): void
}

class Usuario {
  - nome: String
  - telefone: String
  - id_autenticacao: String
  + visualizarFeed(): void
  + configurarAlerta(): void
  + consultarLogs(): void
}

class Servidor {
  - bancoDados: DatabaseConnection
  - listaAlertas: List<Alerta>
  + processarImagem(): void
  + reconhecerRosto(): void
  + interagirAPI(): void
}

CâmeraSmart "1..*" -- "1" Servidor : envia imagens para >
Servidor "1" -- "0..*" Usuario : notifica / gerencia alertas >
@enduml
