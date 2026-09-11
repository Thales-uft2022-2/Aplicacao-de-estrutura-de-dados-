📚 Aplicação de Estrutura de Dados

Repositório destinado às atividades práticas da disciplina de Aplicação de Estrutura de Dados, utilizando a linguagem de programação Java.

O objetivo deste projeto é praticar conceitos fundamentais de programação, estruturas de dados, manipulação de arquivos, orientação a objetos, Java Collections Framework, implementação de estruturas encadeadas e uso de Threads.

🎓 Informações Acadêmicas

Curso: Sistemas para Internet

Instituição: Instituto Federal do Tocantins - IFTO

Professor: Prof. Me. Helder Cleber Almeida Pereira

Disciplina: Aplicação de Estrutura de Dados

Linguagem: Java

IDE: Visual Studio Code

📂 Estrutura do Projeto

Aplicacao-de-estrutura-de-dados/
│
├── Aulas/
├── Exercicios/
├── Link do video/
├── Prova1/
│   ├── No.java
│   ├── Livro.java
│   ├── ListaDuplamenteEncadeada.java
│   └── Main.java
│
├── Threads/
│   └── VetorThreads.java
│
├── Atividade1.java
├── Atividade2.java
├── Atividade3.java
├── prog1.java
├── Prog2.java
├── dados.txt
├── LICENSE
└── README.md

💻 Atividades Desenvolvidas

🔹 Prog1 - Vetores e ArrayList

Programa introdutório utilizado para demonstrar a diferença entre um vetor tradicional (Array) e um ArrayList em Java.

Vetor tradicional

Um vetor possui tamanho definido no momento de sua criação.

Exemplo:

int[] v = new int[3];

v[0] = 1;
v[1] = 10;
v[2] = 40;

Resultado:

Vetor:
1
10
40

ArrayList

O ArrayList possui tamanho dinâmico e permite adicionar novos elementos durante a execução do programa.

Exemplo:

ArrayList<Integer> v2 = new ArrayList<>();

v2.add(1);
v2.add(10);
v2.add(40);

Resultado:

ArrayList:
1
10
40

Conceitos utilizados

Arrays;

ArrayList;

Estruturas de repetição;

Inserção de elementos;

Acesso aos elementos;

Collections Framework.

🔹 Prog2 - Leitura de Arquivos

Programa desenvolvido para realizar a leitura de um arquivo de texto utilizando a classe FileReader.

O programa abre o arquivo:

dados.txt

e realiza a leitura de cada caractere até encontrar o final do arquivo.

Exemplo

FileReader fr = new FileReader("dados.txt");

int c;

while ((c = fr.read()) != -1) {
    System.out.print((char) c);
}

O valor:

-1

indica que o programa chegou ao final do arquivo.

Conceitos utilizados

FileReader;

IOException;

Manipulação de arquivos;

Estrutura while;

Conversão de int para char;

Entrada e saída de dados.

🔹 Atividade 1 - Tipos Primitivos e Tipos de Referência

A atividade demonstra a diferença entre tipos primitivos e tipos de referência em Java.

Tipos Primitivos

Exemplo:

int a = 10;
int b = a;
a = 20;

Resultado:

=== TIPOS PRIMITIVOS ===
Valor de a: 20
Valor de b: 10

Nesse caso, a variável b recebe uma cópia do valor armazenado em a.

Por isso, quando o valor de a é alterado para 20, o valor de b continua sendo 10.

Tipos de Referência

No exemplo de tipos de referência é utilizada uma classe chamada Aluno.

Aluno aluno1 = new Aluno();
aluno1.nota = 10;

Aluno aluno2 = aluno1;
aluno2.nota = 8;

Resultado:

=== TIPOS DE REFERÊNCIA ===
Nota do aluno1: 8
Nota do aluno2: 8

Nesse caso, aluno1 e aluno2 fazem referência ao mesmo objeto.

Portanto, uma alteração realizada através de aluno2 também pode ser observada através de aluno1.

Conceitos utilizados

Tipos primitivos;

Tipos de referência;

Objetos;

Referências de memória;

Stack;

Heap;

Classes.

🔹 Atividade 2 - Abstração de uma Entidade do Mundo Real

Nesta atividade foi criada uma classe Livro para representar a abstração de um livro dentro de um sistema de biblioteca.

A classe possui os seguintes atributos:

String titulo;
String autor;
int paginas;
boolean disponivel;

Métodos

Foram implementados métodos para controlar a disponibilidade do livro.

Emprestar livro

void emprestar()

O método verifica se o livro está disponível.

Caso esteja disponível, o status é alterado para emprestado.

Devolver livro

void devolver()

O método realiza a devolução do livro e altera novamente seu status para disponível.

Exibir dados

void exibirDados()

Exibe informações como:

Título;

Autor;

Quantidade de páginas;

Status de disponibilidade.

Exemplo de execução

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

Conceitos utilizados

Programação Orientada a Objetos;

Classes;

Objetos;

Atributos;

Métodos;

Construtores;

Abstração;

Boolean;

Estruturas condicionais.

🔹 Atividade 3 - Uso do Collections Framework

Nesta atividade foi utilizado o Collections Framework do Java para desenvolver um pequeno sistema de controle de notas.

Foi utilizada a estrutura:

List<Double> notas = new ArrayList<>();

O programa solicita ao usuário a entrada de 5 notas.

As notas são adicionadas dinamicamente ao ArrayList.

Exemplo:

for (int i = 1; i <= 5; i++) {
    System.out.print("Digite a nota " + i + ": ");
    double nota = scanner.nextDouble();
    notas.add(nota);
}

📊 Cálculo da Média

O programa percorre todas as notas cadastradas e realiza a soma.

double soma = 0;

for (double nota : notas) {
    soma += nota;
}

double media = soma / notas.size();

Depois, a média é exibida para o usuário.

❌ Remoção das Notas Menores que 6

As notas menores que 6.0 são removidas da coleção utilizando:

notas.removeIf(nota -> nota < 6.0);

Dessa forma, permanecem na lista somente as notas consideradas aprovadas.

📋 Exemplo de Execução

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

A nota 5.5 foi removida porque é menor que 6.0.

Conceitos utilizados

Collections Framework;

List;

ArrayList;

Scanner;

Double;

Estrutura for;

Enhanced For;

Expressões Lambda;

removeIf();

Entrada de dados;

Cálculo de média.

🔗 Prova 1 - Lista Duplamente Encadeada

Nesta atividade foi implementada uma Lista Duplamente Encadeada em Java.

O objetivo é compreender a estrutura interna de uma lista encadeada utilizando nós que possuem referência tanto para o próximo elemento quanto para o elemento anterior.

O trabalho solicita o cadastro de pelo menos 5 objetos e a implementação dos métodos add() e imprimir().

📂 Arquivos da Prova 1

Prova1/
├── No.java
├── Livro.java
├── ListaDuplamenteEncadeada.java
└── Main.java

🧩 Classe No

A classe No representa cada elemento da lista.

Cada nó possui:

Object objeto;
No proximo;
No anterior;

Dessa forma, cada elemento possui uma referência para o próximo nó e para o nó anterior.

📚 Classe Livro

Foi utilizada a classe Livro como modelo de objeto do mundo real.

A classe possui os atributos:

private String titulo;
private String autor;
private int ano;

Também foi sobrescrito o método:

toString()

para permitir a exibição organizada dos dados de cada livro.

🔗 Classe ListaDuplamenteEncadeada

A classe ListaDuplamenteEncadeada é responsável pelo gerenciamento dos nós.

Ela possui duas referências principais:

private No inicio;
private No fim;

➕ Método add()

O método:

add(Object objeto)

é responsável por adicionar novos objetos ao final da lista.

Quando um novo objeto é inserido, as referências proximo e anterior são atualizadas.

🖨️ Método imprimir()

O método:

imprimir()

percorre a lista do primeiro elemento até o último.

Durante o percurso, cada objeto armazenado na lista é exibido no console.

📖 Livros cadastrados

Foram utilizados 5 livros para testar a Lista Duplamente Encadeada:

Dom Casmurro — Machado de Assis

O Cortiço — Aluísio Azevedo

Iracema — José de Alencar

Vidas Secas — Graciliano Ramos

Capitães da Areia — Jorge Amado

🔗 Representação da Lista

null
  ↑
[Livro 1]
  ⇅
[Livro 2]
  ⇅
[Livro 3]
  ⇅
[Livro 4]
  ⇅
[Livro 5]
  ↓
 null

Cada elemento possui ligação com o próximo e com o anterior.

📋 Exemplo de Execução

===== ELEMENTOS DA LISTA =====
Título: Dom Casmurro | Autor: Machado de Assis | Ano: 1899
Título: O Cortiço | Autor: Aluísio Azevedo | Ano: 1890
Título: Iracema | Autor: José de Alencar | Ano: 1865
Título: Vidas Secas | Autor: Graciliano Ramos | Ano: 1938
Título: Capitães da Areia | Autor: Jorge Amado | Ano: 1937

🧠 Conceitos utilizados na Prova 1

Lista Duplamente Encadeada;

Nós;

Referências;

Próximo elemento;

Elemento anterior;

Classes;

Objetos;

Construtores;

Encapsulamento;

Programação Orientada a Objetos;

Percurso de listas;

Método toString();

Estrutura while.

🧵 Atividade - Threads Aplicadas a Vetores

Nesta atividade foi desenvolvido um programa em Java utilizando Threads para processar diferentes partes de um vetor de 1000 posições do tipo int.

A Thread 1 adiciona 5 aos elementos das posições 0 até 499, enquanto a Thread 2 adiciona 10 aos elementos das posições 500 até 999.

📌 Criação do vetor

int[] vetor = new int[1000];

🧵 Thread 1

Thread thread1 = new Thread(() -> {
    for (int i = 0; i <= 499; i++) {
        vetor[i] += 5;
    }
});

🧵 Thread 2

Thread thread2 = new Thread(() -> {
    for (int i = 500; i <= 999; i++) {
        vetor[i] += 10;
    }
});

▶️ Inicialização e sincronização

thread1.start();
thread2.start();

thread1.join();
thread2.join();

O método join() garante que o programa principal aguarde a conclusão das duas Threads antes de imprimir o vetor.

📋 Resultado esperado

Posições 0 até 499: valor 5;

Posições 500 até 999: valor 10.

🧠 Conceitos utilizados

Threads;

Vetores e Arrays;

Processamento concorrente;

Estruturas de repetição;

Métodos start() e join();

Expressões Lambda.

▶️ Como executar

cd Threads
javac VetorThreads.java
java VetorThreads

🛠️ Tecnologias Utilizadas

O projeto utiliza:

☕ Java

📦 Java Collections Framework

📋 ArrayList

⌨️ Scanner

📁 FileReader

🔗 Lista Duplamente Encadeada

🧵 Threads

🔄 Estruturas de repetição

🔀 Estruturas condicionais

🧩 Programação Orientada a Objetos

💻 Visual Studio Code

🌐 Git

🐙 GitHub

⚙️ Pré-requisitos

Para executar os programas é necessário possuir o Java Development Kit (JDK) instalado.

Para verificar a instalação:

java -version

E:

javac -version

▶️ Como Executar

Primeiro, abra o terminal na pasta do projeto.

Exemplo:

C:\xampp\htdocs\Aplicacao-de-estrutura-de-dados-

Executar Atividade 1

javac Atividade1.java
java Atividade1

Executar Atividade 2

javac Atividade2.java
java Atividade2

Executar Atividade 3

javac Atividade3.java
java Atividade3

Executar Prog1

javac prog1.java
java prog1

Executar Prog2

javac Prog2.java
java Prog2

Importante: o arquivo dados.txt deve estar no diretório do projeto para que o Prog2.java consiga realizar sua leitura.

▶️ Executar Prova 1

Entre na pasta:

cd Prova1

Compile todos os arquivos:

javac *.java

Execute o programa principal:

java Main

O programa irá cadastrar os livros na Lista Duplamente Encadeada e exibir todos os elementos no terminal.

▶️ Executar Atividade de Threads

Entre na pasta:

cd Threads

Compile:

javac VetorThreads.java

Execute:

java VetorThreads

🧠 Conteúdos Estudados

Durante o desenvolvimento das atividades foram trabalhados conceitos como:

Estruturas de Dados;

Arrays;

Vetores;

ArrayList;

Collections Framework;

Tipos primitivos;

Tipos de referência;

Stack;

Heap;

Classes;

Objetos;

Abstração;

Encapsulamento;

Atributos;

Métodos;

Construtores;

Manipulação de arquivos;

FileReader;

Scanner;

Estruturas condicionais;

Estruturas de repetição;

Expressões Lambda;

Nós;

Listas Encadeadas;

Listas Duplamente Encadeadas;

Referência para próximo elemento;

Referência para elemento anterior;

Threads;

Processamento concorrente;

Métodos start() e join().

📈 Próximas Atividades

O repositório continuará sendo atualizado conforme novos conteúdos forem estudados durante a disciplina.

Novas implementações de estruturas de dados serão adicionadas ao longo do semestre.

👨‍💻 Autor

Thales Marques Rodrigues

🎓 Sistemas para Internet
🏫 Instituto Federal do Tocantins - IFTO

📄 Licença

Este projeto possui finalidade acadêmica e educacional, sendo desenvolvido durante os estudos da disciplina de Aplicação de Estrutura de Dados.

⭐ Repositório criado para acompanhamento das atividades e evolução dos estudos em Aplicação de Estrutura de Dados com Java.