public class Atividade1 {

    public static void main(String[] args) {

        // ================================
        // PARTE 1 - TIPOS PRIMITIVOS
        // ================================

        int a = 10;
        int b = a;

        // Alterando apenas a
        a = 20;

        System.out.println("=== TIPOS PRIMITIVOS ===");
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);


        // ================================
        // PARTE 2 - TIPOS DE REFERÊNCIA
        // ================================

        Aluno aluno1 = new Aluno();
        aluno1.nota = 10;

        // aluno2 recebe a referência de aluno1
        Aluno aluno2 = aluno1;

        // Alterando através de aluno2
        aluno2.nota = 8;

        System.out.println("\n=== TIPOS DE REFERÊNCIA ===");
        System.out.println("Nota do aluno1: " + aluno1.nota);
        System.out.println("Nota do aluno2: " + aluno2.nota);
    }
}


// Classe Aluno
class Aluno {

    int nota;

}