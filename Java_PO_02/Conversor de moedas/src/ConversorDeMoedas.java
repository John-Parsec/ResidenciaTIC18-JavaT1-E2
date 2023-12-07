import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a taxa de câmbio: ");
        float taxaDeCambio = scanner.nextFloat();

        System.out.print("Insira a quantidade em dólares: ");
        double quantidadeEmDolares = scanner.nextDouble();

        double valorConvertido = quantidadeEmDolares * taxaDeCambio;

        System.out.println("O valor convertido é: " + valorConvertido);
    }
}