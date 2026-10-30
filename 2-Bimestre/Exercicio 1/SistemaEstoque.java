
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SistemaEstoque {

    private static HashMap<Integer, Produto> estoque =
            new HashMap<Integer, Produto>();

    private static BufferedReader arquivo;
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            arquivo = new BufferedReader(
                    new FileReader("produtos.txt"));

            int opcao = -1;

            while (opcao != 0) {

                System.out.println("\n===== SISTEMA DE ESTOQUE =====");
                System.out.println("1 - Cadastrar produto pelo arquivo");
                System.out.println("2 - Consultar produto pelo código");
                System.out.println("3 - Listar todos os produtos");
                System.out.println("4 - Atualizar quantidade em estoque");
                System.out.println("5 - Excluir produto");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");

                if (!entrada.hasNextInt()) {
                    System.out.println("Digite uma opção válida.");
                    entrada.nextLine();
                    continue;
                }

                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        cadastrarProduto();
                        break;

                    case 2:
                        consultarProduto();
                        break;

                    case 3:
                        listarProdutos();
                        break;

                    case 4:
                        atualizarQuantidade();
                        break;

                    case 5:
                        excluirProduto();
                        break;

                    case 0:
                        System.out.println("Programa encerrado.");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            }

            arquivo.close();
            entrada.close();

        } catch (IOException e) {
            System.out.println(
                "Erro ao abrir ou ler produtos.txt: " + e.getMessage());
        }
    }

    private static void cadastrarProduto() throws IOException {

        String linha = arquivo.readLine();

        if (linha == null) {
            System.out.println(
                "Não há mais produtos no arquivo.");
            return;
        }

        try {
            String[] dados = linha.split(";", -1);

            if (dados.length != 4) {
                System.out.println(
                    "Registro inválido no arquivo: " + linha);
                return;
            }

            int codigo = Integer.parseInt(dados[0].trim());
            String nome = dados[1].trim();
            int quantidade = Integer.parseInt(dados[2].trim());
            double preco = Double.parseDouble(
                    dados[3].trim().replace(',', '.'));

            if (codigo <= 0 || nome.isEmpty()
                    || quantidade < 0 || preco < 0) {
                System.out.println(
                    "Dados inválidos para o produto.");
                return;
            }

            if (estoque.containsKey(codigo)) {
                System.out.println(
                    "Já existe um produto com esse código.");
                return;
            }

            Produto produto = new Produto(
                    codigo, nome, quantidade, preco);

            estoque.put(codigo, produto);

            System.out.println(
                "Produto cadastrado: " + nome);

        } catch (NumberFormatException e) {
            System.out.println(
                "Erro: verifique os números do registro.");
        }
    }

    private static void consultarProduto() {

        System.out.print("Código do produto: ");
        int codigo = entrada.nextInt();

        Produto produto = estoque.get(codigo);

        if (produto != null) {
            produto.exibirDados();
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void listarProdutos() {

        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        for (Map.Entry<Integer, Produto> item
                : estoque.entrySet()) {
            item.getValue().exibirDados();
        }

        System.out.println(
            "Total de produtos diferentes: " + estoque.size());
    }

    private static void atualizarQuantidade() {

        System.out.print("Código do produto: ");
        int codigo = entrada.nextInt();

        Produto produto = estoque.get(codigo);

        if (produto == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        System.out.print("Nova quantidade: ");
        int quantidade = entrada.nextInt();

        if (quantidade < 0) {
            System.out.println(
                "A quantidade não pode ser negativa.");
            return;
        }

        produto.setQuantidade(quantidade);

        System.out.println("Estoque atualizado com sucesso.");
    }

    private static void excluirProduto() {

        System.out.print("Código do produto: ");
        int codigo = entrada.nextInt();

        if (estoque.containsKey(codigo)) {
            estoque.remove(codigo);
            System.out.println("Produto excluído com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}