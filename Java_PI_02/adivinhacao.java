import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        int tentativas = 0;
        int palpite;

        do {
            System.out.print("Digite o seu palpite: ");
            palpite = scanner.nextInt();

            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("Muito alto. Tente novamente.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }

        } while (palpite != numeroAleatorio);

        scanner.close();
    }
}
