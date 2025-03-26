# Banco Digital - Conta Terminal

## Descrição
Este é um projeto simples em Java que simula a criação de uma conta bancária digital diretamente pelo terminal. O usuário insere suas informações e recebe uma mensagem de confirmação com os detalhes da conta criada.

## Funcionalidades
- Solicita e captura dados do usuário via terminal.
- Permite que o usuário insira seu nome, sobrenome, número da agência, número da conta e saldo inicial.
- Exibe uma mensagem de confirmação com os dados cadastrados.

## Tecnologias Utilizadas
- Linguagem: Java
- Ferramenta de Entrada: Scanner

## Como Executar o Projeto
1. Certifique-se de ter o **Java 8 ou superior** instalado em sua máquina.
2. Clone este repositório ou baixe os arquivos.
3. Abra o terminal na pasta do projeto e compile o arquivo:
   ```sh
   javac ContaTerminal.java
   ```
4. Execute o programa:
   ```sh
   java ContaTerminal
   ```
5. Siga as instruções exibidas no terminal para criar sua conta.

## Exemplo de Uso
```
BEM VINDO AO BANCO DIGITAL
---------------------------------
Crie sua conta de forma rápida e fácil:

Digite seu nome:
> Tiago
Digite seu sobrenome:
> da Silva Santos
Digite o número da sua agência: (xxx-x)
> 123-4
Digite o número da sua conta: (xxxx)
> 5678
Insira o valor que deseja depositar em sua conta:
> 1500.00

Olá Tiago da Silva Santos, obrigado por criar uma conta em nosso banco, sua agência é 123-4, conta 5678 e seu saldo de 1500.0 já está disponível para saque.
```

## Melhorias Futuras
- Implementar validação de entrada para evitar erros no preenchimento dos dados.
- Criar uma interface gráfica para tornar a experiência do usuário mais amigável.
- Armazenar os dados do usuário em um banco de dados.
