
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class SistemaProdutos {

    private static Scanner entrada = new Scanner(System.in);

    // Parte A: vetor de tamanho fixo
    private static String[] nomes = new String[5];

    // Parte B: lista de produtos
    private static ArrayList<Produto> lista =
            new ArrayList<Produto>();

    // Parte C: conjunto de códigos
    private static HashSet<Integer> codigos =
            new HashSet<Integer>();

    // Parte D: mapa de produtos
    private static HashMap<Integer, Produto> mapa =
            new HashMap<Integer, Produto>();

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("\n========== SISTEMA DE PRODUTOS ==========");
            System.out.println("1 - Trabalhar com vetor");
            System.out.println("2 - Trabalhar com lista");
            System.out.println("3 - Trabalhar com conjunto");
            System.out.println("4 - Trabalhar com mapa");
            System.out.println("0 - Encerrar o programa");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1:
                    trabalharComVetor();
                    break;
                case 2:
                    trabalharComLista();
                    break;
                case 3:
                    trabalharComConjunto();
                    break;
                case 4:
                    trabalharComMapa();
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        entrada.close();
    }

    private static int lerInteiro() {
        while (!entrada.hasNextInt()) {
            System.out.print("Digite um número inteiro válido: ");
            entrada.nextLine();
        }

        int valor = entrada.nextInt();
        entrada.nextLine();
        return valor;
    }

    private static double lerDouble() {
        while (!entrada.hasNextDouble()) {
            System.out.print("Digite um preço válido: ");
            entrada.nextLine();
        }

        double valor = entrada.nextDouble();
        entrada.nextLine();
        return valor;
    }

    private static Produto lerProduto() {
        System.out.print("Código: ");
        int codigo = lerInteiro();

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = lerInteiro();

        while (quantidade < 0) {
            System.out.print("A quantidade não pode ser negativa. Digite novamente: ");
            quantidade = lerInteiro();
        }

        System.out.print("Preço: ");
        double preco = lerDouble();

        while (preco < 0) {
            System.out.print("O preço não pode ser negativo. Digite novamente: ");
            preco = lerDouble();
        }

        return new Produto(codigo, nome, quantidade, preco);
    }

    // PARTE A - ARRAY

    private static void trabalharComVetor() {

        System.out.println("\n=== VETOR DE PRODUTOS ===");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do produto "
                    + (i + 1) + ": ");
            nomes[i] = entrada.nextLine();
        }

        System.out.println("\nNomes armazenados:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(i + " - " + nomes[i]);
        }

        System.out.print("Informe o índice que deseja consultar (0 a 4): ");
        int indice = lerInteiro();

        if (indice >= 0 && indice < nomes.length) {
            System.out.println("Produto: " + nomes[indice]);
        } else {
            System.out.println("Índice inválido.");
        }

        System.out.println(
                "O vetor tem cinco posições fixas. Um sexto nome não cabe nele.");
    }

    // PARTE B - ARRAYLIST

    private static void trabalharComLista() {

        int opcao;

        do {
            System.out.println("\n=== LISTA DE PRODUTOS ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Remover produto pelo código");
            System.out.println("4 - Mostrar quantidade de produtos");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1: {
                    Produto produto = lerProduto();
                    lista.add(produto);
                    System.out.println("Produto cadastrado na lista.");
                    break;
                }

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        for (Produto produto : lista) {
                            System.out.println(produto);
                        }
                    }
                    break;

                case 3: {
                    System.out.print("Código para remover: ");
                    int codigo = lerInteiro();
                    boolean removido = false;

                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getCodigo() == codigo) {
                            lista.remove(i);
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        System.out.println("Produto removido.");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                }

                case 4:
                    System.out.println(
                            "Quantidade de produtos: " + lista.size());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    // PARTE C - HASHSET

    private static void trabalharComConjunto() {

        System.out.println("\n=== CONJUNTO DE CÓDIGOS ===");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o código "
                    + (i + 1) + " de 5: ");
            int codigo = lerInteiro();

            if (codigos.add(codigo)) {
                System.out.println("Código adicionado.");
            } else {
                System.out.println("Esse código já existe no conjunto.");
            }
        }

        System.out.println("Códigos armazenados: " + codigos);
        System.out.println(
                "Quantidade de códigos distintos: " + codigos.size());

        System.out.print("Digite um código para pesquisar: ");
        int pesquisa = lerInteiro();

        if (codigos.contains(pesquisa)) {
            System.out.println("O código está no conjunto.");
        } else {
            System.out.println("O código não está no conjunto.");
        }
    }

    // PARTE D - HASHMAP

    private static void trabalharComMapa() {

        int opcao;

        do {
            System.out.println("\n=== MAPA DE PRODUTOS ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Consultar produto");
            System.out.println("3 - Listar produtos");
            System.out.println("4 - Verificar código");
            System.out.println("5 - Atualizar quantidade");
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha: ");

            opcao = lerInteiro();

            switch (opcao) {
                case 1: {
                    Produto produto = lerProduto();
                    int codigo = produto.getCodigo();

                    if (mapa.containsKey(codigo)) {
                        System.out.println(
                                "Já existe um produto com esse código.");
                    } else {
                        mapa.put(codigo, produto);
                        System.out.println("Produto cadastrado no mapa.");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Código para consultar: ");
                    int codigo = lerInteiro();

                    Produto produto = mapa.get(codigo);

                    if (produto != null) {
                        System.out.println(produto);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                }

                case 3:
                    if (mapa.isEmpty()) {
                        System.out.println("Mapa vazio.");
                    } else {
                        for (Produto produto : mapa.values()) {
                            System.out.println(produto);
                        }
                    }
                    break;

                case 4: {
                    System.out.print("Código para verificar: ");
                    int codigo = lerInteiro();

                    if (mapa.containsKey(codigo)) {
                        System.out.println("O código existe no mapa.");
                    } else {
                        System.out.println("O código não existe no mapa.");
                    }
                    break;
                }

                case 5: {
                    System.out.print("Código do produto: ");
                    int codigo = lerInteiro();

                    Produto produto = mapa.get(codigo);

                    if (produto == null) {
                        System.out.println("Produto não encontrado.");
                        break;
                    }

                    System.out.print("Nova quantidade: ");
                    int quantidade = lerInteiro();

                    if (quantidade < 0) {
                        System.out.println(
                                "A quantidade não pode ser negativa.");
                    } else {
                        produto.setQuantidade(quantidade);
                        System.out.println("Quantidade atualizada.");
                    }
                    break;
                }

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}