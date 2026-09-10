public class ListaDuplamenteEncadeada {

    private No inicio;
    private No fim;

    public ListaDuplamenteEncadeada() {
        inicio = null;
        fim = null;
    }

    public void add(Object objeto) {

        No novoNo = new No(objeto);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void imprimir() {

        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }

        No atual = inicio;

        System.out.println("===== ELEMENTOS DA LISTA =====");

        while (atual != null) {
            System.out.println(atual.objeto);
            atual = atual.proximo;
        }
    }
}