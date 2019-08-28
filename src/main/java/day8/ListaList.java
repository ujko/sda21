package day8;

import java.util.ArrayList;
import java.util.List;

public class ListaList {

    public static void main(String[] args) {
        tabliczkaMnozenia();
}

    private static void tabliczkaMnozenia() {
        List<List<Integer>> tab = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            List<Integer> podlist = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                podlist.add(i * j);
            }
            tab.add(podlist);
        }
        for(List<Integer> l: tab) {
            for(Integer i : l) {
                System.out.printf("%3d, ", i);
            }
            System.out.println();
        }
    }

    private static void listaList() {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> podLista = new ArrayList<>();
        podLista.add(3);
        podLista.add(2);
        podLista.add(6);
        podLista.add(3);
        lists.add(podLista);

        List<Integer> podLista1 = new ArrayList<>();
        podLista1.add(48);
        podLista1.add(56);
        podLista1.add(78);
        podLista1.add(41);
        lists.add(podLista1);


    }
}
