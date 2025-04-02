# Desafio de Controle de Fluxo - Java

Este repositório contém a solução do desafio de controle de fluxo proposto pelo Bootcamp Java Native Cloud Bradesco, onde implementamos a lógica de contagem com tratamento de exceções personalizadas.

## 📌 Descrição do Desafio
O programa deve receber dois números inteiros como entrada e realizar uma contagem incremental com base nesses valores. Caso o primeiro número seja **maior** que o segundo, uma exceção personalizada deve ser lançada.

### 🎯 Requisitos:
1. O programa deve solicitar ao usuário dois números inteiros.
2. Se o primeiro número for **maior** que o segundo, deve-se lançar uma exceção personalizada `ParametrosInvalidosException`.
3. Se os valores forem válidos, o programa deve exibir no console a contagem do primeiro até o segundo número.

---

## 🛠 Tecnologias Utilizadas
- Java 8+
- Scanner para entrada de dados
- Exceções personalizadas
- Estruturas de controle de fluxo (if, for)

---

## 📜 Estrutura do Projeto
O projeto possui as seguintes classes:

### **1️⃣ Classe `Contador.java`**
Esta classe contém o método `main`, responsável por:
- Capturar os valores de entrada do usuário.
- Chamar o método `contar()`.
- Tratar a exceção `ParametrosInvalidosException`.

### **2️⃣ Classe `ParametrosInvalidosException.java`**
Esta classe representa uma exceção personalizada, sendo lançada quando o primeiro número é maior que o segundo.

---

## 🔧 Como Executar o Projeto
1. **Compilar os arquivos:**
   ```sh
   javac Contador.java ParametrosInvalidosException.java
   ```
2. **Executar o programa:**
   ```sh
   java Contador
   ```
3. **Interagir com o programa:**
   - Informe dois números inteiros.
   - Se o primeiro número for menor, o programa imprimirá a contagem.
   - Se o primeiro for maior, o erro "O segundo parâmetro deve ser maior que o primeiro" será exibido.

---

## 📌 Exemplo de Entrada e Saída
### ✅ Entrada Válida:
```
Digite o primeiro parâmetro:
3
Digite o segundo parâmetro:
7
```
**Saída:**
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
```

### ❌ Entrada Inválida:
```
Digite o primeiro parâmetro:
10
Digite o segundo parâmetro:
5
```
**Saída:**
```
O segundo parâmetro deve ser maior que o primeiro
```
