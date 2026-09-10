import java.util.ArrayList;

public class MatrizEsparsa {

    private ArrayList<Celula> dados;

    public MatrizEsparsa() {
        dados = new ArrayList<Celula>();
    }

    public boolean posicaoOcupada(int linha, int coluna) {

        for (int i = 0; i < dados.size(); i++) {

            Celula c = dados.get(i);

            if (c.getLinha() == linha &&
                c.getColuna() == coluna) {

                return true;
            }
        }

        return false;
    }

    public void inserir(int linha, int coluna, int valor) {

        Celula nova = new Celula(linha, coluna, valor);
        dados.add(nova);

        System.out.println("Valor inserido com sucesso.");
    }

    public void substituir(int linha, int coluna, int valor) {

        for (int i = 0; i < dados.size(); i++) {

            Celula c = dados.get(i);

            if (c.getLinha() == linha &&
                c.getColuna() == coluna) {

                c.setValor(valor);

                System.out.println(
                    "Valor substituído com sucesso."
                );

                return;
            }
        }
    }

    public void exibirDados() {

        System.out.println("\n=== POSIÇÕES OCUPADAS ===");

        if (dados.size() == 0) {

            System.out.println(
                "Nenhum valor foi inserido."
            );

            return;
        }

        for (int i = 0; i < dados.size(); i++) {

            Celula c = dados.get(i);

            System.out.println(
                "Linha: " + c.getLinha() +
                " | Coluna: " + c.getColuna() +
                " | Valor: " + c.getValor()
            );
        }
    }
}

class Celula {

    private int linha;
    private int coluna;
    private int valor;

    public Celula(int linha, int coluna, int valor) {
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}