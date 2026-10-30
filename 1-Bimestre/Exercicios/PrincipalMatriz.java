import java.util.Scanner;

public class PrincipalMatriz {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        MatrizEsparsa matriz = new MatrizEsparsa();

        int opcao = 0;

        while (opcao != 3) {

            System.out.println("\n==============================");
            System.out.println("      MATRIZ 100000 x 100000");
            System.out.println("==============================");
            System.out.println("1 - Inserir valor");
            System.out.println("2 - Exibir posições ocupadas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            if (opcao == 1) {

                int linha;
                int coluna;
                int valor;

                System.out.print(
                    "Informe a linha (1 a 100000): "
                );
                linha = entrada.nextInt();

                System.out.print(
                    "Informe a coluna (1 a 100000): "
                );
                coluna = entrada.nextInt();

                if (linha < 1 || linha > 100000 ||
                    coluna < 1 || coluna > 100000) {

                    System.out.println(
                        "Linha ou coluna inválida."
                    );

                    continue;
                }

                System.out.print(
                    "Informe um valor diferente de zero: "
                );
                valor = entrada.nextInt();

                if (valor == 0) {

                    System.out.println(
                        "O valor deve ser diferente de zero."
                    );

                    continue;
                }

                if (matriz.posicaoOcupada(linha, coluna)) {

                    System.out.println(
                        "Essa posição já está ocupada."
                    );

                    System.out.print(
                        "Deseja substituir? (1-Sim / 2-Não): "
                    );

                    int resposta = entrada.nextInt();

                    if (resposta == 1) {

                        matriz.substituir(
                            linha,
                            coluna,
                            valor
                        );

                    } else {

                        System.out.println(
                            "Valor não alterado."
                        );
                    }

                } else {

                    matriz.inserir(
                        linha,
                        coluna,
                        valor
                    );
                }

            } else if (opcao == 2) {

                matriz.exibirDados();

            } else if (opcao == 3) {

                System.out.println(
                    "Programa encerrado."
                );

            } else {

                System.out.println(
                    "Opção inválida."
                );
            }
        }

        entrada.close();
    }
}