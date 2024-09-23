
# Sistema de Academia

Este é um sistema de academia simples desenvolvido em Java. Ele permite o gerenciamento de alunos e treinos cadastrados por professores. O sistema pode cadastrar novos alunos, associar treinos específicos para dias da semana, e exibir os treinos do dia cadastrados de cada aluno.

## Funcionalidades

- **Cadastro de Alunos:** Permite que novos alunos sejam cadastrados no sistema com nome, CPF, idade e matrícula.
- **Cadastro de Treinos:** Professores podem cadastrar treinos para alunos, especificando o dia da semana e o nome do treino.
- **Visualização de Treinos:** O sistema permite a visualização dos treinos cadastrados para cada aluno, filtrados por dia da semana.

## Estrutura de Classes

### 1. `Pessoa`
Classe base para representar pessoas no sistema (Aluno, Professor, Recepcionista).
- **Atributos:**
  - `nome`: Nome da pessoa.
  - `cpf`: CPF da pessoa.
  - `idade`: Idade da pessoa.

### 2. `Aluno` (extends `Pessoa`)
Representa um aluno da academia.
- **Atributos:**
  - `matricula`: Matrícula do aluno.
  - `treinos`: Mapa que associa dias da semana a uma lista de treinos.
  
- **Métodos:**
  - `adicionarTreino(String dia, String treino)`: Adiciona um treino para o dia especificado.
  - `exibirTreinosPorDia(String dia)`: Exibe os treinos cadastrados para o dia da semana especificado.

### 3. `Professor` (extends `Pessoa`)
Representa um professor da academia.
- **Atributos:**
  - `especialidade`: Especialidade do professor.
  
- **Métodos:**
  - `cadastrarTreinoParaDia(Aluno aluno, String dia, String treino)`: Cadastra um treino para um aluno específico em um determinado dia da semana.

### 4. `Recepcionista` (extends `Pessoa`)
Representa uma recepcionista que pode cadastrar novos alunos.
- **Métodos:**
  - `cadastrarAluno(String nome, String cpf, int idade, int matricula)`: Cadastra um novo aluno no sistema.

### 5. `AlunoRepository`
Armazena os alunos cadastrados em uma lista e oferece métodos para manipulá-los.
- **Métodos:**
  - `adicionarAluno(Aluno aluno)`: Adiciona um aluno ao repositório.
  - `buscarPorMatricula(int matricula)`: Retorna o aluno com a matrícula fornecida.

### 6. `SistemaAcade`
Classe principal que contém o método `main()`, onde a interação com o sistema ocorre. No código básico, as entradas são coletadas via console usando a classe `Scanner`, e o sistema realiza o cadastro de alunos e treinos.

## Como Usar o Sistema

1. **Cadastrar um Aluno:**
   - O usuário pode inserir os dados do aluno, como nome, CPF, idade e matrícula, e a recepcionista irá cadastrar o aluno no sistema.

2. **Cadastrar Treinos:**
   - O professor pode cadastrar treinos para alunos específicos, especificando o nome do treino e o dia da semana.

3. **Visualizar Treinos:**
   - É possível visualizar os treinos cadastrados para cada aluno, filtrando pelo dia da semana e matricula.

