public class Atividade2 {

    public static void main(String[] args) {

        // Criando um livro
        Livro livro = new Livro(
            "Java: Como Programar",
            "Deitel",
            800
        );

        // Exibindo dados iniciais
        livro.exibirDados();

        // Realizando empréstimo
        livro.emprestar();

        // Tentando emprestar novamente
        livro.emprestar();

        // Devolvendo o livro
        livro.devolver();

        // Exibindo situação final
        livro.exibirDados();
    }
}


// Classe que representa a abstração de um Livro
class Livro {

    String titulo;
    String autor;
    int paginas;
    boolean disponivel;


    // Construtor
    Livro(String titulo, String autor, int paginas) {

        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;

        // Livro começa disponível
        this.disponivel = true;
    }


    // Método para emprestar
    void emprestar() {

        if (disponivel) {

            disponivel = false;

            System.out.println(
                "Livro emprestado com sucesso!"
            );

        } else {

            System.out.println(
                "O livro já está emprestado!"
            );
        }
    }


    // Método para devolver
    void devolver() {

        if (!disponivel) {

            disponivel = true;

            System.out.println(
                "Livro devolvido com sucesso!"
            );

        } else {

            System.out.println(
                "O livro já está disponível!"
            );
        }
    }


    // Exibir informações
    void exibirDados() {

        System.out.println("\n--- DADOS DO LIVRO ---");

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);

        if (disponivel) {
            System.out.println("Status: Disponível");
        } else {
            System.out.println("Status: Emprestado");
        }
    }
}