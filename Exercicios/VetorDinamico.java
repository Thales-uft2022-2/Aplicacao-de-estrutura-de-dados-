public class VetorDinamico {

    // Vetor privado
    private int[] vetor;

    // Controla a próxima posição livre
    private int quantidade;

    // Construtor
    public VetorDinamico() {

        // Capacidade inicial do vetor
        vetor = new int[3];

        quantidade = 0;
    }

    // Único método de acesso externo
    public void adicionar(int valor) {

        // Verifica se o vetor está cheio
        if (quantidade == vetor.length) {

            // Novo vetor com o dobro do tamanho
            int[] novoVetor = new int[vetor.length * 2];

            // Copia os valores do vetor antigo
            for (int i = 0; i < vetor.length; i++) {

                novoVetor[i] = vetor[i];
            }

            // O vetor passa a apontar para o novo vetor
            vetor = novoVetor;

            System.out.println(
                "Capacidade aumentada para: " + vetor.length
            );
        }

        // Adiciona o valor na próxima posição
        vetor[quantidade] = valor;

        quantidade++;

        System.out.println("Valor " + valor + " adicionado.");
    }
}