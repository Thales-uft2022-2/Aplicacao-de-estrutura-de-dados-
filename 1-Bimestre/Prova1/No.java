public class No {
    Object objeto;
    No proximo;
    No anterior;

    public No(Object objeto) {
        this.objeto = objeto;
        this.proximo = null;
        this.anterior = null;
    }
}