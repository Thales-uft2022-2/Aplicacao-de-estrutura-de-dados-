public class Main {

    public static void main(String[] args) {

        ListaDuplamenteEncadeada lista =
                new ListaDuplamenteEncadeada();

        Livro livro1 = new Livro(
                "Dom Casmurro",
                "Machado de Assis",
                1899
        );

        Livro livro2 = new Livro(
                "O Cortiço",
                "Aluísio Azevedo",
                1890
        );

        Livro livro3 = new Livro(
                "Iracema",
                "José de Alencar",
                1865
        );

        Livro livro4 = new Livro(
                "Vidas Secas",
                "Graciliano Ramos",
                1938
        );

        Livro livro5 = new Livro(
                "Capitães da Areia",
                "Jorge Amado",
                1937
        );

        lista.add(livro1);
        lista.add(livro2);
        lista.add(livro3);
        lista.add(livro4);
        lista.add(livro5);

        lista.imprimir();
    }
}