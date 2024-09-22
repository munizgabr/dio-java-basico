# BankAccount

O projeto **BankAccount** é uma aplicação simples desenvolvida em Java que simula a criação de uma conta bancária. O usuário insere seus dados via terminal, como número da conta, agência, nome completo, saldo inicial e apelido, e o sistema exibe uma mensagem personalizada de sucesso ao criar a conta.

## Funcionalidades

- Solicita ao usuário informações como número da conta, agência, nome completo, saldo inicial e apelido.
- Exibe uma mensagem personalizada contendo os dados inseridos.
- Formata a saída do saldo com duas casas decimais.

## Tecnologias Utilizadas

- **Java SE**: Linguagem principal para desenvolver a aplicação.
- **Scanner**: Para capturar a entrada de dados via terminal.
- **Locale**: Para definir o formato de entrada de números decimais com ponto.
- **System.out.printf()**: Para exibir as mensagens com formatação de saída.

## Como Executar o Projeto

### Pré-requisitos

1. **Java 8 ou superior**: Certifique-se de que o Java está instalado na sua máquina.
   - Para verificar, execute o seguinte comando no terminal:
     ```bash
     java -version
     ```

2. **IDE**: Você pode usar uma IDE como IntelliJ IDEA, Eclipse ou até mesmo rodar o código via linha de comando.

### Executando o Projeto

1. **Clone ou baixe o projeto** para sua máquina.

2. Abra o projeto em sua IDE preferida.

3. Execute a classe `BankAccount`.

4. Insira os dados solicitados no terminal.

### Exemplo de Execução

```bash
Olá, seja muito bem-vindo ao Banco Muniz. Vamos abrir sua conta? Inicie digitando como gostaria de ser chamado(a):
Usuário: Joãozinho
Certo, Joãozinho, agora digite o número da conta:
Usuário: 1234
Agência:
Usuário: 001
Agora preciso do seu nome completo, como no seu documento de identificação:
Usuário: João Pedro da Silva
Qual o saldo inicial?
Usuário: 250.75

Saída Final:
Olá João Pedro da Silva, ou melhor, Joãozinho, obrigado por criar uma conta em nosso banco, sua agência é 001, conta 1234 e seu saldo 250.75 já está disponível para saque.
