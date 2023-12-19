package Exercicio;

import java.util.*;

public class Arrays {

    ArrayList<String> nomes;

    public void preencherArray() {
        nomes = new ArrayList<>();
        nomes.add("Joaao");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Lucas");
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public void imprimirNomes() {
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    public ArrayList<String> filtrarNomes(String nome) {
        if (nomes.contains(nome)) {
            System.out.println("Nome encontrado: " + nome);
        } else {
            System.out.println("Nome nao encontrado: " + nome);
        }
        return null;
    }

    public void modificaNome(String nome, String novoNome) {
        if (nomes.contains(nome)) {
            nomes.set(nomes.indexOf(nome), novoNome);
        } else {
            System.out.println("Nome nao encontrado: " + nome);
        }
    }

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        arrays.preencherArray();
        arrays.imprimirNomes();

        List<Arrays> list = new ArrayList<>(java.util.Arrays.asList(arrays));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNomes());
        }

        arrays.filtrarNomes("Joaao");
        arrays.modificaNome("Joaao", "Joaquim");

        arrays.imprimirNomes();
    }
}
