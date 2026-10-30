public class Produto {

    private String nome;
    private double preco;
    private boolean disponivel;

    public Produto(String nome, double preco, boolean disponivel) {
        this.nome = nome;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public int hashCode() {

        // Concatena todos os atributos
        String dados = nome + preco + disponivel;

        int hash = 0;

        // Percorre cada caractere da String
        for (int i = 0; i < dados.length(); i++) {

            char caractere = dados.charAt(i);

            // Se for espaço, subtrai 1
            if (caractere == ' ') {
                hash = hash - 1;
            } else {
                // Caso contrário, soma o valor ASCII/Unicode
                hash = hash + (int) caractere;
            }
        }

        return hash;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", disponivel=" + disponivel +
                ", hash=" + hashCode() +
                '}';
    }
}