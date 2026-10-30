import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Permite usar ponto nas notas: 8.5, 7.5 etc.
        scanner.useLocale(Locale.US);

        List<Double> notas = new ArrayList<>();

        System.out.println("=== CONTROLE DE NOTAS ===");

        for (int i = 1; i <= 5; i++) {

            System.out.print("Digite a nota " + i + ": ");

            double nota = scanner.nextDouble();

            notas.add(nota);
        }

        System.out.println("\nNotas cadastradas: " + notas);

        calcularMedia(notas);

        removerReprovados(notas);

        System.out.println("\n=== LISTA FINAL DE APROVADOS ===");
        System.out.println(notas);

        scanner.close();
    }


    public static void calcularMedia(List<Double> notas) {

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.size();

        System.out.printf(
            Locale.US,
            "Média das notas: %.2f%n",
            media
        );
    }


    public static void removerReprovados(List<Double> notas) {

        notas.removeIf(nota -> nota < 6.0);

    }
}