package Exercicio;

import java.util.*;

public class LinkedLists {

    private static final String color[] = {"blue", "red", "green"};
    private static final String color2[] = {"yellow", "black", "white"};


    public LinkedLists() {
        List<String> link = new LinkedList<String>();
        List<String> link2 = new LinkedList<String>();
        ArrayList<Double> media = new ArrayList<Double>();
        Vector<String> strings = new Vector<String>();
        
        for (int i=0; i < color.length; i++) {
            link.add(color[i]);
            link2.add(color2[i]);
        }

        media.add(5.0);
        media.add(10.0);
        media.add(15.0);
        media.add(20.0);
   
        strings.add("Degas");
        strings.add("Helder");
        strings.add("Esbel");
        strings.add("Julio");

        link.addAll(link2);
        link2 = null;

        System.out.println(link);
        printReverseList(link);

        System.out.println("------------");

        System.out.println(media);
        calcularMedia(media);

        System.out.println("------------");

        System.out.println(strings);
        

    }

    private void printReverseList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    private void calcularMedia(List<Double> list) {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        double media = total / list.size();
        System.out.println("Media: " + media);
    }

    public static void main(String[] args) {
        new LinkedLists();
    }

}
