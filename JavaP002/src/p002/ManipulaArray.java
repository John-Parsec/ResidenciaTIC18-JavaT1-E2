package p002;

import java.util.Scanner;

public class ManipulaArray {

    public static int[] criaArray() {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        sc.close();

        return array;
    }

    public static int[] criaArrayAleatorio() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
        }

        return array;
    }

    public static int somaArray(int[] array) {
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        return soma;
    }

    public static int maiorElemento(int[] array){
        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior){
                maior = array[i];
            }
        }

        return maior;
    }

    public static int menorElemento(int[] array){
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor){
                menor = array[i];
            }
        }

        return menor;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayAleatorio = new int[10];

        array = criaArray();
        arrayAleatorio = criaArrayAleatorio();

        System.out.println("Soma dos elementos do array: " + somaArray(array));
        System.out.println("Maior elemento do array: " + maiorElemento(array));
        System.out.println("Menor elemento do array: " + menorElemento(array));
        System.out.println("Soma dos elementos do array aleatório: " + somaArray(arrayAleatorio));
        System.out.println("Maior elemento do array aleatório: " + maiorElemento(arrayAleatorio));
        System.out.println("Menor elemento do array aleatório: " + menorElemento(arrayAleatorio));
    }

}
