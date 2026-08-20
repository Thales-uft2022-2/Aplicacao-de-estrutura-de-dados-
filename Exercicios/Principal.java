import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Criando o objeto VetorDinamico
        VetorDinamico vetor = new VetorDinamico();

        int quantidade;
        int valor;

        System.out.println("=== VETOR DINÂMICO ===");

        System.out.print(
            "Quantos valores deseja adicionar? "
        );

        quantidade = entrada.nextInt();

        // Usuário não precisa controlar o índice
        for (int i = 0; i < quantidade; i++) {

            System.out.print(
                "Digite o valor " + (i + 1) + ": "
            );

            valor = entrada.nextInt();

            // Único acesso à estrutura
            vetor.adicionar(valor);
        }

        System.out.println(
            "\nTodos os valores foram adicionados."
        );

        entrada.close();
    }
}