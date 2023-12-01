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

    public static int divisaoInt(int a, int b) {
        return a / b;
    }

    public static float divisaoFloat(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {
        int opcao;
        double resultado = 0, num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Divisão por float");

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        opcao = scanner.nextInt();

        try {
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
                    if (num2 == 0) {
                        throw new DivisionByZeroException("erro");
                    } else {
                        int numeroInt1 = Double.valueOf(num1).intValue();
                        int numeroInt2 = Double.valueOf(num2).intValue();
                        resultado = divisaoInt(numeroInt1, numeroInt2);
                    }
                    break;
                case 5:
                    if (num2 == 0) {
                        throw new DivisionByZeroException("erro ");
                    } else {
                        float numeroFloat1 = Double.valueOf(num1).floatValue();
                        float numeroFloat2 = Double.valueOf(num2).floatValue();

                        resultado = divisaoFloat(numeroFloat1, numeroFloat2);
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    scanner.close();
                    return;
            }

            System.out.println("O resultado é: " + resultado);
        } catch (DivisionByZeroException ex) {
            System.out.println("Erro: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
