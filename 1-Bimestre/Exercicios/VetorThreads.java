public class VetorThreads {

    public static void main(String[] args) {

        int[] vetor = new int[1000];

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i <= 499; i++) {
                vetor[i] += 5;
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 500; i <= 999; i++) {
                vetor[i] += 10;
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Erro na execução das threads.");
        }

        System.out.println("=== VETOR FINAL ===");

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }
}