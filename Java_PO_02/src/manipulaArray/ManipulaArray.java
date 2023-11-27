package manipulaArray;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
	public static ArrayList<Integer> criarArrayListDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("Digite o tamanho do ArrayList: ");
        int tamanho = scanner.nextInt();

        System.out.println("Digite os elementos do ArrayList:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arrayList.add(scanner.nextInt());
        }

        return arrayList;
    }

    public static ArrayList<Integer> criarArrayListAleatorio(int tamanho, int valorMaximo) {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < tamanho; i++) {
            arrayList.add(random.nextInt(valorMaximo));
        }

        return arrayList;
    }

    public static int calcularSoma(ArrayList<Integer> arrayList) {
        int soma = 0;
        for (int num : arrayList) {
            soma += num;
        }
        return soma;
    }

	public static int encontrarMaior(ArrayList<Integer> arrayList) {
        int maior = arrayList.get(0);
        for (int num : arrayList) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static int encontrarMenor(ArrayList<Integer> arrayList) {
        int menor = arrayList.get(0);
        for (int num : arrayList) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }
    
    public static void imprimeArray(ArrayList<Integer> arrayList) {
        for (int num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
        ArrayList<Integer> arraytUsuario = criarArrayListDoUsuario();
        ArrayList<Integer> arrayAleatorio = criarArrayListAleatorio(5, 100);

        System.out.println("\nArrayList do Usuário:");
        imprimeArray(arraytUsuario);

        System.out.println("\nArrayList Aleatório:");
        imprimeArray(arrayAleatorio);

        System.out.println("\nSoma do ArrayList do Usuário: " + calcularSoma(arraytUsuario));
        System.out.println("Maior valor do ArrayList do Usuário: " + encontrarMaior(arraytUsuario));
        System.out.println("Menor valor do ArrayList do Usuário: " + encontrarMenor(arraytUsuario));
        System.out.println("\nSoma do ArrayList Aleatório: " + calcularSoma(arrayAleatorio));
        System.out.println("Maior valor do ArrayList Aleatório: " + encontrarMaior(arrayAleatorio));
        System.out.println("Menor valor do ArrayList Aleatório: " + encontrarMenor(arrayAleatorio));
    }
}
