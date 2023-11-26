package conversor;

import java.util.Scanner;

public class Conversor {
	
	public static double converte(double dolar, double cambio) {
	    return dolar * cambio;
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a taxa de câmbio para converter dólares para real: ");
        double cambio = scanner.nextDouble();

        System.out.print("Informe a quantidade em dólares: ");
        double dolar = scanner.nextDouble();

        double valor = converte(dolar, cambio);

        System.out.println(String.format("%.2f", dolar) + " dolares é igual a " + String.format("%.2f", valor) + " reais!");

        scanner.close();
    }
}
