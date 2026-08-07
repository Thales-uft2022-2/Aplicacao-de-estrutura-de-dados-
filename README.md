# 📚 Aplicação de Estrutura de Dados

Repositório destinado às atividades práticas da disciplina de **Estrutura de Dados**, utilizando a linguagem de programação **Java**.

O objetivo deste projeto é praticar conceitos fundamentais de programação, estruturas de dados, manipulação de arquivos, orientação a objetos e o **Java Collections Framework**.

---

## 🎓 Informações Acadêmicas

- **Curso:** Sistemas para Internet
- **Instituição:** Instituto Federal do Tocantins - IFTO
- **Disciplina:** Estrutura de Dados
- **Linguagem:** Java
- **IDE:** Visual Studio Code

---

## 📂 Estrutura do Projeto

```text
Aplicacao-de-estrutura-de-dados/
│
├── Atividade1.java
├── Atividade2.java
├── Atividade3.java
├── prog1.java
├── Prog2.java
├── dados.txt
└── README.md
```

---

# 💻 Atividades Desenvolvidas

## 🔹 Prog1 - Vetores e ArrayList

Programa introdutório utilizado para demonstrar a diferença entre um **vetor tradicional (Array)** e um **ArrayList** em Java.

### Vetor tradicional

Um vetor possui tamanho definido no momento de sua criação.

Exemplo:

```java
int[] v = new int[3];

v[0] = 1;
v[1] = 10;
v[2] = 40;
```

Resultado:

```text
Vetor:
1
10
40
```

### ArrayList

O `ArrayList` possui tamanho dinâmico e permite adicionar novos elementos durante a execução do programa.

Exemplo:

```java
ArrayList<Integer> v2 = new ArrayList<>();

v2.add(1);
v2.add(10);
v2.add(40);
```

Resultado:

```text
ArrayList:
1
10
40
```

### Conceitos utilizados

- Arrays;
- ArrayList;
- Estruturas de repetição;
- Inserção de elementos;
- Acesso aos elementos;
- Collections Framework.

---

## 🔹 Prog2 - Leitura de Arquivos

Programa desenvolvido para realizar a leitura de um arquivo de texto utilizando a classe `FileReader`.

O programa abre o arquivo:

```text
dados.txt
```

e realiza a leitura de cada caractere até encontrar o final do arquivo.

### Exemplo

```java
FileReader fr = new FileReader("dados.txt");

int c;

while ((c = fr.read()) != -1) {
    System.out.print((char) c);
}
```

O valor:

```text
-1
```

indica que o programa chegou ao final do arquivo.

### Conceitos utilizados

- FileReader;
- IOException;
- Manipulação de arquivos;
- Estrutura `while`;
- Conversão de `int` para `char`;
- Entrada e saída de dados.

---

# 🔹 Atividade 1 - Tipos Primitivos e Tipos de Referência

A atividade demonstra a diferença entre **tipos primitivos** e **tipos de referência** em Java.

## Tipos Primitivos

Exemplo:

```java
int a = 10;
int b = a;

a = 20;
```

Resultado:

```text
=== TIPOS PRIMITIVOS ===
Valor de a: 20
Valor de b: 10
```

Nesse caso, a variável `b` recebe uma cópia do valor armazenado em `a`.

Por isso, quando o valor de `a` é alterado para `20`, o valor de `b` continua sendo `10`.

---

## Tipos de Referência

No exemplo de tipos de referência é utilizada uma classe chamada `Aluno`.

```java
Aluno aluno1 = new Aluno();

aluno1.nota = 10;

Aluno aluno2 = aluno1;

aluno2.nota = 8;
```

Resultado:

```text
=== TIPOS DE REFERÊNCIA ===
Nota do aluno1: 8
Nota do aluno2: 8
```

Nesse caso, `aluno1` e `aluno2` fazem referência ao mesmo objeto.

Portanto, uma alteração realizada através de `aluno2` também pode ser observada através de `aluno1`.

### Conceitos utilizados

- Tipos primitivos;
- Tipos de referência;
- Objetos;
- Referências de memória;
- Stack;
- Heap;
- Classes.

---

# 🔹 Atividade 2 - Abstração de uma Entidade do Mundo Real

Nesta atividade foi criada uma classe `Livro` para representar a abstração de um livro dentro de um sistema de biblioteca.

A classe possui os seguintes atributos:

```java
String titulo;
String autor;
int paginas;
boolean disponivel;
```

## Métodos

Foram implementados métodos para controlar a disponibilidade do livro.

### Emprestar livro

```java
void emprestar()
```

O método verifica se o livro está disponível.

Caso esteja disponível, o status é alterado para emprestado.

### Devolver livro

```java
void devolver()
```

O método realiza a devolução do livro e altera novamente seu status para disponível.

### Exibir dados

```java
void exibirDados()
```

Exibe informações como:

- Título;
- Autor;
- Quantidade de páginas;
- Status de disponibilidade.

### Exemplo de execução

```text
--- DADOS DO LIVRO ---
Título: Java: Como Programar
Autor: Deitel
Páginas: 800
Status: Disponível

Livro emprestado com sucesso!
O livro já está emprestado!
Livro devolvido com sucesso!

--- DADOS DO LIVRO ---
Título: Java: Como Programar
Autor: Deitel
Páginas: 800
Status: Disponível
```

### Conceitos utilizados

- Programação Orientada a Objetos;
- Classes;
- Objetos;
- Atributos;
- Métodos;
- Construtores;
- Abstração;
- Boolean;
- Estruturas condicionais.

---

# 🔹 Atividade 3 - Uso do Collections Framework

Nesta atividade foi utilizado o **Collections Framework do Java** para desenvolver um pequeno sistema de controle de notas.

Foi utilizada a estrutura:

```java
List<Double> notas = new ArrayList<>();
```

O programa solicita ao usuário a entrada de **5 notas**.

As notas são adicionadas dinamicamente ao `ArrayList`.

Exemplo:

```java
for (int i = 1; i <= 5; i++) {

    System.out.print("Digite a nota " + i + ": ");

    double nota = scanner.nextDouble();

    notas.add(nota);
}
```

---

## 📊 Cálculo da Média

O programa percorre todas as notas cadastradas e realiza a soma.

```java
double soma = 0;

for (double nota : notas) {
    soma += nota;
}

double media = soma / notas.size();
```

Depois, a média é exibida para o usuário.

---

## ❌ Remoção das Notas Menores que 6

As notas menores que `6.0` são removidas da coleção utilizando:

```java
notas.removeIf(nota -> nota < 6.0);
```

Dessa forma, permanecem na lista somente as notas consideradas aprovadas.

---

## 📋 Exemplo de Execução

```text
=== CONTROLE DE NOTAS ===

Digite a nota 1: 8.5
Digite a nota 2: 5.5
Digite a nota 3: 7.0
Digite a nota 4: 9.5
Digite a nota 5: 6.0

Notas cadastradas:
[8.5, 5.5, 7.0, 9.5, 6.0]

Média das notas: 7.30

=== LISTA FINAL DE APROVADOS ===

[8.5, 7.0, 9.5, 6.0]
```

A nota `5.5` foi removida porque é menor que `6.0`.

### Conceitos utilizados

- Collections Framework;
- List;
- ArrayList;
- Scanner;
- Double;
- Estrutura `for`;
- Enhanced For;
- Expressões Lambda;
- `removeIf()`;
- Entrada de dados;
- Cálculo de média.

---

# 🛠️ Tecnologias Utilizadas

O projeto utiliza:

- ☕ Java
- 📦 Java Collections Framework
- 📋 ArrayList
- ⌨️ Scanner
- 📁 FileReader
- 🔄 Estruturas de repetição
- 🔀 Estruturas condicionais
- 🧩 Programação Orientada a Objetos
- 💻 Visual Studio Code
- 🌐 Git
- 🐙 GitHub

---

# ⚙️ Pré-requisitos

Para executar os programas é necessário possuir o **Java Development Kit (JDK)** instalado.

Para verificar a instalação:

```bash
java -version
```

E:

```bash
javac -version
```

---

# ▶️ Como Executar

Primeiro, abra o terminal na pasta do projeto.

Exemplo:

```text
C:\xampp\htdocs\Aplicacao-de-estrutura-de-dados-
```

---

## Executar Atividade 1

Compile:

```bash
javac Atividade1.java
```

Execute:

```bash
java Atividade1
```

---

## Executar Atividade 2

Compile:

```bash
javac Atividade2.java
```

Execute:

```bash
java Atividade2
```

---

## Executar Atividade 3

Compile:

```bash
javac Atividade3.java
```

Execute:

```bash
java Atividade3
```

---

## Executar Prog1

Compile:

```bash
javac prog1.java
```

Execute:

```bash
java prog1
```

---

## Executar Prog2

Compile:

```bash
javac Prog2.java
```

Execute:

```bash
java Prog2
```

> **Importante:** o arquivo `dados.txt` deve estar no diretório do projeto para que o `Prog2.java` consiga realizar sua leitura.

---

# 🧠 Conteúdos Estudados

Durante o desenvolvimento das atividades foram trabalhados conceitos como:

- Estruturas de Dados;
- Arrays;
- Vetores;
- ArrayList;
- Collections Framework;
- Tipos primitivos;
- Tipos de referência;
- Stack;
- Heap;
- Classes;
- Objetos;
- Abstração;
- Atributos;
- Métodos;
- Construtores;
- Manipulação de arquivos;
- FileReader;
- Scanner;
- Estruturas condicionais;
- Estruturas de repetição;
- Expressões Lambda.

---

# 📈 Próximas Atividades

O repositório continuará sendo atualizado conforme novos conteúdos forem estudados durante a disciplina.

Novas implementações de estruturas de dados serão adicionadas ao longo do semestre.

---

# 👨‍💻 Autor

**Thales Marques Rodrigues**

🎓 Sistemas para Internet  
🏫 Instituto Federal do Tocantins - IFTO

---

## 📄 Licença

Este projeto possui finalidade **acadêmica e educacional**, sendo desenvolvido durante os estudos da disciplina de **Estrutura de Dados**.

---

⭐ **Repositório criado para acompanhamento das atividades e evolução dos estudos em Estrutura de Dados com Java.**