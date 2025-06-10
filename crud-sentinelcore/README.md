# CRUD da Classe CameraInteligente – SentinelCore

## Descrição
Este projeto simula operações CRUD (Create, Retrieve, Update, Delete) para uma câmera inteligente da SentinelCore.

## Operações implementadas

- `adicionar(camera)` - Cadastra uma nova câmera
- `buscar(id)` - Retorna os dados da câmera pelo ID
- `atualizar(id, novoLocal)` - Atualiza o local da câmera
- `deletar(id)` - Remove uma câmera
- `listarTodas()` - Lista todas as câmeras registradas

## Prints de execução

### 📸 Adição e Listagem
![Adição](prints/adicao.png)

### 🛠️ Atualização
![Atualização](prints/atualizacao.png)

### ❌ Remoção
![Remoção](prints/remocao.png)

## Como executar

```bash
javac Main.java CameraInteligente.java CameraService.java
java Main
```
