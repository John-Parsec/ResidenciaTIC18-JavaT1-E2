package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static double adicao(double a, double b) {
	    return a + b;
	}

	public static double subtracao(double a, double b) {
	    return a - b;
	}

	public static double multiplicacao(double a, double b) {
	    return a * b;
	}

	public static double divisao(double a, double b) {
	    return a / b;
	}
	
    public static void main(String[] args) {
    	int opcao;
        double resultado = 0, num1, num2;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                resultado = adicao(num1, num2);
                break;
            case 2:
                resultado = subtracao(num1, num2);
                break;
            case 3:
                resultado = multiplicacao(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = divisao(num1, num2);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                return;
        }

        System.out.println("O resultado é: " + resultado);

        scanner.close();
    }
}

