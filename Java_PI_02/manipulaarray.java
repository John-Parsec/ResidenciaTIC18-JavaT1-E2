import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {

    public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho, int valorMaximo) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(valorMaximo + 1);
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = Integer.MIN_VALUE;
        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = Integer.MAX_VALUE;
        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

    public static void main(String[] args) {

        int[] arrayUsuario = criarArrayDoUsuario();
        int[] arrayAleatorio = criarArrayAleatorio(5, 100);

        // Teste do método calcularSoma()
        System.out.println("Soma do array de usuário: " + calcularSoma(arrayUsuario));
        System.out.println("Soma do array aleatório: " + calcularSoma(arrayAleatorio));

        // Teste do método encontrarMaiorValor()
        System.out.println("Maior valor do array de usuário: " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Maior valor do array aleatório: " + encontrarMaiorValor(arrayAleatorio));

        // Teste do método encontrarMenorValor()
        System.out.println("Menor valor do array de usuário: " + encontrarMenorValor(arrayUsuario));
        System.out.println("Menor valor do array aleatório: " + encontrarMenorValor(arrayAleatorio));
    }
}
