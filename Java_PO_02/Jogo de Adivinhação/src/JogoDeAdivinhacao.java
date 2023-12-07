import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {        
        Random random = new Random();
        int number = random.nextInt(100) + 1;        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tente adivinhar o número (entre 1 e 100):");
        int guess = scanner.nextInt();        
        
        int contadorErros = 0;        
        
        while (guess != number) {
            
            if (guess > number) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Muito baixo! Tente novamente.");
            }            
            
            contadorErros++;            
            
            guess = scanner.nextInt();
        }        
        
        System.out.println("Você acertou o número. Você errou " + contadorErros + " vezes.");        
        
        scanner.close();
    }
}