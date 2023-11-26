package p002;

import java.util.Scanner;

public class JogoAdivinhacao {
    int numeroAleatorio;

    public JogoAdivinhacao() {
        super();
        numeroAleatorio = (int) (Math.random() * 100) + 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        JogoAdivinhacao jogo = new JogoAdivinhacao();

        int palpite;

        System.out.println("Adivinhe o número (entre 1 e 100): ");
        palpite = sc.nextInt();

        while (palpite != jogo.numeroAleatorio) {
            if (palpite > jogo.numeroAleatorio) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Muito baixo!");
            }

            System.out.println("Adivinhe o número (entre 1 e 100): ");
            palpite = sc.nextInt();
        }

        System.out.println("Parabéns! Você acertou!");
    }

}
