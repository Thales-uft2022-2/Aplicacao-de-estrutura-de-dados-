import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Validar validar = new Validar();

        int opcao;

        do {

            System.out.println();
            System.out.println("=================================");
            System.out.println("   SISTEMA DE PRODUTOS - HASH");
            System.out.println("=================================");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Listar hashes");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.println();
                    System.out.println("===== CADASTRO DE PRODUTO =====");

                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Produto disponível? (true/false): ");
                    boolean disponivel = scanner.nextBoolean();

                    scanner.nextLine();

                    Produto produto =
                            new Produto(nome, preco, disponivel);

                    validar.adicionarProduto(produto);

                    break;

                case 2:

                    validar.listarProdutos();

                    break;

                case 3:

                    validar.listarHashes();

                    break;

                case 0:

                    System.out.println();
                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println();
                    System.out.println("Opção inválida.");

                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}