import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
    public static void main(String[] args) {
        int[] arrayLidoUsuario = criarArrayLidoUsuario();
        int[] arrayAleatorio = criarArrayAleatorio();
        
        System.out.println("Array lido do usuário:");
        exibirArray(arrayLidoUsuario);
        
        System.out.println("Array criado aleatoriamente:");
        exibirArray(arrayAleatorio);
        
        int soma = calcularSomaArray(arrayLidoUsuario);
        System.out.println("A soma dos elementos do array lido do usuário é: " + soma);
        
        int maiorValor = encontrarMaiorValorArray(arrayAleatorio);
        System.out.println("O maior valor do array criado aleatoriamente é: " + maiorValor);
        
        int menorValor = encontrarMenorValorArray(arrayAleatorio);
        System.out.println("O menor valor do array criado aleatoriamente é: " + menorValor);
    }
    
    public static int[] criarArrayLidoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        
        int[] array = new int[tamanho];
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }
        
        return array;
    }
    
    public static int[] criarArrayAleatorio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        
        int[] array = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100);
        }
        
        return array;
    }
    
    public static int calcularSomaArray(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }
    
    public static int encontrarMaiorValorArray(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }
    
    public static int encontrarMenorValorArray(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
    
    public static void exibirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}