package adivinhacao;

import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
	
	public static void testePalpite(int numero) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe seu palpite: ");
        int palpite = scanner.nextInt();
        
        while (palpite != numero) {
            if (palpite < numero) {
            	System.out.print("O número está acima! Tente novamente: ");
                palpite = scanner.nextInt();
            } else if (palpite > numero) {
            	System.out.print("O número está abaixo! Tente novamente: ");
                palpite = scanner.nextInt();
            } 
        }
        
        scanner.close();
	}
	
	public static void main(String[] args) {
		Random random = new Random();
        
        int numero = random.nextInt(100) + 1;
     
        testePalpite(numero);
        
        System.out.print("Acertou o número: " + numero + "!!!");
    }
}
