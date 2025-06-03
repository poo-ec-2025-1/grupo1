# grupo1
Repositório do grupo 1

## Membros
* Diogo - @DiFreire2402 - Backend
* Arthur - @ArtTech-cloud - Frontend

  # SentinelCore - Documento Técnico Inicial (Entrega da etapa 1 do projeto)

# Grupo 1 - Projeto de Câmera de Segurança Simulada (Java)

Repositório do Grupo 1 - Foco em Aprendizado de Java e Ferramentas de Desenvolvimento

## Membros
*   Diogo Freire (@DiFreire2402) - Foco em Lógica de Negócios e Simulação (Backend simulado)
*   Arthur Sousa (@ArtTech-cloud) - Foco em Interface (Console/GUI Simples) e Modelagem (Frontend simulado)

# SentinelCore Simulado - Documento Técnico Inicial (Projeto Acadêmico - Java)

## Seção 1 - Introdução

### Justificativa
Este projeto acadêmico visa aplicar e aprofundar conhecimentos em desenvolvimento de software utilizando a linguagem Java e ferramentas essenciais do ciclo de vida de desenvolvimento. A simulação de um sistema de câmera de segurança oferece um cenário prático para explorar conceitos de orientação a objetos, modelagem UML, controle de versão com Git/GitHub e documentação em Markdown. O foco principal reside no aprendizado e na aplicação correta dessas tecnologias, mais do que na criação de um produto comercialmente viável.

### Descrição do Problema (Acadêmico)
No contexto acadêmico, estudantes frequentemente necessitam de projetos que permitam aplicar conceitos teóricos de programação e engenharia de software de forma integrada. A simulação de um sistema de segurança permite abordar a criação de classes, métodos, interações entre objetos, gerenciamento de eventos e interfaces de usuário (mesmo que simples, como console ou GUI básica com Swing/JavaFX), proporcionando uma experiência de desenvolvimento controlada e focada nos objetivos de aprendizado.

### Motivação
A motivação central é consolidar o domínio das ferramentas e técnicas fundamentais para o desenvolvimento de software moderno em Java. Através da criação do SentinelCore Simulado, busca-se:
*   Ganhar proficiência na linguagem Java e seus paradigmas.
*   Dominar o uso de Git e GitHub para controle de versão e colaboração.
*   Aplicar técnicas de modelagem UML (Casos de Uso, Classes, Sequência) para planejar e documentar a arquitetura.
*   Praticar a criação de documentação clara e organizada utilizando Markdown.
*   Utilizar IDEs como VS Code e/ou BlueJ de forma eficaz no desenvolvimento.

## Seção 2 - Plano

### Objetivo Geral
Desenvolver uma simulação de sistema de câmera de segurança em Java, aplicando conceitos de orientação a objetos, modelagem UML, controle de versão com Git/GitHub e documentação em Markdown, visando atingir os objetivos de aprendizado definidos para a disciplina.

### Objetivos Específicos (Foco em Aprendizado)

*   **Domínio do Ambiente e Ferramentas:**
    *   Configurar e utilizar repositórios Git e GitHub para versionamento do código.
    *   Utilizar eficientemente IDEs como VS Code e/ou BlueJ para codificação, depuração e testes unitários básicos.
    *   Gerenciar o projeto utilizando recursos do GitHub (Issues, Kanban/Projects, Milestones).
*   **Domínio da Linguagem Java:**
    *   Criar classes Java coesas e métodos bem definidos que representem os componentes da simulação (Câmera Simulada, Evento, Processador de Eventos, Interface).
    *   Aplicar corretamente princípios de encapsulamento, herança e polimorfismo onde aplicável.
    *   Implementar a lógica de simulação de eventos (ex: detecção de movimento simulada) e o processamento correspondente.
*   **Domínio da Modelagem:**
    *   Elaborar diagramas UML básicos (Diagrama de Classes, Diagrama de Sequência para cenários chave, Diagrama de Casos de Uso) que modelem a estrutura e o comportamento da simulação.
    *   Garantir que a implementação Java esteja alinhada com a modelagem UML criada.
*   **Domínio da Documentação:**
    *   Utilizar Markdown para criar e manter a documentação do projeto (README.md, este documento técnico, comentários no código).
    *   Documentar as decisões de design e a funcionalidade das classes e métodos.

---



## Seção 3 - Divisão de Tarefas (Foco Acadêmico - Java)

A execução deste projeto acadêmico será organizada em tarefas focadas nos objetivos de aprendizado, distribuídas entre os membros da equipe para praticar colaboração e gerenciamento de projetos.

### Tarefas Iniciais (Issues no GitHub) e Atribuições

1.  **Issue #01: Configuração Inicial do Projeto e Repositório Git/GitHub**
    *   **Descrição:** Criar o repositório no GitHub, definir a estrutura inicial de pastas do projeto Java (usando VS Code/BlueJ), configurar o `.gitignore` básico para Java e realizar os commits iniciais. Praticar comandos básicos do Git (`clone`, `add`, `commit`, `push`).
    *   **Responsáveis:** Arthur Sousa e Diogo Freire (Tarefa colaborativa inicial)
    *   **Prazo:** 06 de Junho de 2025
    *   **Entregável:** Repositório GitHub configurado com estrutura básica do projeto.
    *   **Objetivo de Aprendizado:** Domínio básico de Git e GitHub, configuração de ambiente.

2.  **Issue #02: Modelagem UML Inicial (Diagrama de Classes e Casos de Uso)**
    *   **Descrição:** Elaborar o Diagrama de Classes inicial, identificando as principais classes Java da simulação (ex: `SimulatedCamera`, `Event`, `EventHandler`, `ConsoleUI`). Criar o Diagrama de Casos de Uso simplificado para as interações básicas do usuário simulado.
    *   **Responsável:** Arthur Sousa (@ArtTech-cloud)
    *   **Prazo:** 10 de Junho de 2025
    *   **Entregável:** Arquivos de imagem ou documento Markdown com os diagramas UML.
    *   **Objetivo de Aprendizado:** Domínio da Modelagem UML (Classes, Casos de Uso).

3.  **Issue #03: Implementação das Classes Base da Simulação em Java**
    *   **Descrição:** Codificar as classes Java definidas no Diagrama de Classes inicial (Issue #02), incluindo atributos e métodos básicos (construtores, getters/setters). Focar na estrutura e organização do código Java.
    *   **Responsável:** Diogo Freire (@DiFreire2402)
    *   **Prazo:** 15 de Junho de 2025
    *   **Entregável:** Código-fonte das classes base no repositório Git.
    *   **Objetivo de Aprendizado:** Domínio da Linguagem Java (criação de classes e métodos).

4.  **Issue #04: Implementação da Lógica de Simulação de Eventos**
    *   **Descrição:** Implementar a lógica que simula a ocorrência de eventos (ex: um método em `SimulatedCamera` que gera um `Event` de 'movimento detectado' periodicamente ou aleatoriamente). Implementar a classe `EventHandler` para processar esses eventos (ex: imprimir uma mensagem no console).
    *   **Responsável:** Diogo Freire (@DiFreire2402)
    *   **Prazo:** 20 de Junho de 2025
    *   **Entregável:** Código-fonte com a lógica de simulação e tratamento de eventos.
    *   **Objetivo de Aprendizado:** Domínio da Linguagem Java (lógica de programação, interação entre objetos).

5.  **Issue #05: Desenvolvimento da Interface de Usuário Simples (Console)**
    *   **Descrição:** Criar uma interface de usuário baseada em console que permita ao usuário interagir minimamente com a simulação (ex: iniciar/parar a simulação, visualizar logs de eventos). Conectar a interface com as classes de lógica (`EventHandler`).
    *   **Responsável:** Arthur Sousa (@ArtTech-cloud)
    *   **Prazo:** 25 de Junho de 2025
    *   **Entregável:** Código-fonte da interface de console funcional.
    *   **Objetivo de Aprendizado:** Domínio da Linguagem Java (entrada/saída, interação básica), Conexão Frontend/Backend simulados.

6.  **Issue #06: Documentação e Modelagem de Sequência**
    *   **Descrição:** Documentar o código implementado usando comentários Javadoc. Criar Diagramas de Sequência para os cenários principais (ex: 'Simular Detecção de Evento', 'Usuário Inicia Simulação'). Atualizar o README.md do projeto e este documento técnico.
    *   **Responsáveis:** Arthur Sousa (Diagramas de Sequência, README) e Diogo Freire (Javadoc, Documento Técnico)
    *   **Prazo:** 30 de Junho de 2025
    *   **Entregável:** Código documentado, diagramas de sequência, documentação Markdown atualizada.
    *   **Objetivo de Aprendizado:** Domínio da Documentação (Markdown, Javadoc), Modelagem UML (Sequência), Gerenciamento de Projetos (GitHub Issues/Kanban).

### Responsabilidades Gerais e Ferramentas

*   **Diogo Freire:** Foco na lógica de negócios da simulação, implementação das classes principais e do fluxo de eventos (simulação de backend). Utilizará VS Code/BlueJ e Git.
*   **Arthur Sousa:** Foco na modelagem UML, implementação da interface de usuário (simulação de frontend) e documentação inicial/README. Utilizará VS Code/BlueJ e Git.

Ambos são responsáveis por manter a documentação atualizada, utilizar o GitHub Issues para rastrear o progresso das tarefas e colaborar através do Git, praticando branches e merges conforme necessário. Reuniões curtas e frequentes são recomendadas para sincronização.

## Seção 4 - Modelagem Inicial (Simplificada - Java)

A modelagem UML para este projeto acadêmico será simplificada para focar nos conceitos essenciais e guiar a implementação em Java.

### Diagrama de Casos de Uso (Simplificado)

*   **Atores:** Usuário (interagindo via console/GUI simples).
*   **Casos de Uso:**
    *   `Iniciar Simulação`: Usuário inicia a geração de eventos simulados.
    *   `Parar Simulação`: Usuário interrompe a geração de eventos.
    *   `Visualizar Log de Eventos`: Usuário vê os eventos que foram detectados/processados.
    *   `(Sistema) Simular Detecção de Evento`: A câmera simulada gera um evento.
    *   `(Sistema) Processar Evento`: O sistema trata o evento gerado (ex: loga no console).
*   **Responsável pela Elaboração/Refinamento:** Diogo Freire (@DiFreire2402)

*(Nota: O diagrama visual será criado usando uma ferramenta apropriada e adicionado ao repositório ou documentação.)*

### Diagrama de Classes (Foco Java)

*   **Classes Principais:**
    *   `SimulatedCamera`: Simula a câmera (ID, status). Possui método para `detectEvent()` que retorna um `Event`.
    *   `Event`: Representa um evento simulado (timestamp, type: String, description: String).
    *   `EventHandler`: Processa `Event` recebidos (ex: método `handle(Event e)` que imprime no console).
    *   `ConsoleUI` (ou `SimpleGUI`): Classe responsável pela interação com o usuário via console (ou GUI básica). Contém o método `main` e interage com `EventHandler` e `SimulatedCamera`.
    *   `SimulationManager`: (Opcional) Classe para controlar o loop principal da simulação, iniciando/parando a `SimulatedCamera`.
*   **Relacionamentos Principais:** `ConsoleUI` *usa* `EventHandler` e `SimulatedCamera` (ou `SimulationManager`). `SimulatedCamera` *cria* `Event`. `EventHandler` *processa* `Event`.
*   **Responsável pela Elaboração/Refinamento:** Arthur Sousa (@ArtTech-cloud)

*(Nota: O diagrama visual será criado usando uma ferramenta apropriada e adicionado ao repositório ou documentação.)*

### Diagramas de Sequência (Exemplos Chave)

1.  **Cenário: Simular e Processar Evento**
    *   `SimulationManager` (ou loop em `ConsoleUI`) chama `detectEvent()` em `SimulatedCamera` -> `SimulatedCamera` cria e retorna `Event` -> `SimulationManager` passa `Event` para `handle(Event e)` de `EventHandler` -> `EventHandler` imprime detalhes do evento no console.
    *   **Responsável pela Elaboração:** Arthur Sousa (@ArtTech-cloud)

2.  **Cenário: Usuário Inicia Simulação via Console**
    *   `Usuário` digita comando 'iniciar' no `ConsoleUI` -> `ConsoleUI` chama método `startSimulation()` em `SimulationManager` (ou diretamente na `SimulatedCamera`) -> `SimulationManager` inicia o loop de chamada a `detectEvent()`.
    *   **Responsável pela Elaboração:** Diogo Freire (@DiFreire2402)

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
