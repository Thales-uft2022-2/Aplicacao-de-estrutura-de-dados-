
public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(int codigo, String nome,
                   int quantidade, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirDados() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", preco);
        System.out.printf("Valor em estoque: R$ %.2f%n",
                          quantidade * preco);
        System.out.println("--------------------------");
    }
}