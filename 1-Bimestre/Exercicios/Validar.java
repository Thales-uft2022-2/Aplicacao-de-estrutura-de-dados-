import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validar {

    private List<Integer> listaHash;
    private Set<Produto> produtos;

    public Validar() {
        listaHash = new ArrayList<>();
        produtos = new HashSet<>();
    }

    public boolean adicionarProduto(Produto produto) {

        int hash = produto.hashCode();

        // Verifica se o hash já existe
        if (listaHash.contains(hash)) {

            System.out.println();
            System.out.println("Produto não adicionado.");
            System.out.println("Já existe um produto com esse hash.");
            System.out.println("Hash duplicado: " + hash);

            return false;

        } else {

            // Adiciona o hash na lista
            listaHash.add(hash);

            // Adiciona o produto no HashSet
            produtos.add(produto);

            System.out.println();
            System.out.println("Produto adicionado com sucesso!");
            System.out.println("Hash gerado: " + hash);

            return true;
        }
    }

    public void listarProdutos() {

        System.out.println();
        System.out.println("===== PRODUTOS CADASTRADOS =====");

        if (produtos.isEmpty()) {

            System.out.println("Nenhum produto cadastrado.");

        } else {

            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    public void listarHashes() {

        System.out.println();
        System.out.println("===== LISTA DE HASHES =====");

        if (listaHash.isEmpty()) {

            System.out.println("Nenhum hash cadastrado.");

        } else {

            for (Integer hash : listaHash) {
                System.out.println("Hash: " + hash);
            }
        }
    }
}