package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args){

        List<String> palavras = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();

        palavras.add("Marcilio");
        palavras.add("Alessandra");
        palavras.add("Alessandra Luiza");
        palavras.add("Isabela");
        palavras.add("Mãe");
        palavras.add("Pai");

        numeros.add(5);
        numeros.add(10);
        numeros.add(45);
        numeros.add(15);
        numeros.add(53);

        Comparator<String> comparadorString = new ComparadorPorTamanho();
        Comparator<Integer> comparadorNumero = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        System.out.println("Palavras.");
        for (String nome: palavras) {
            System.out.println(nome);
        }

        System.out.println("Números.");
        for (Integer numero: numeros) {
            System.out.println(numero);
        }

        System.out.println("Palavras ordenadas.");
        palavras.sort(comparadorString);
        for (String nome: palavras) {
            System.out.println(nome);
        }

        System.out.println("Números ordenados.");
        numeros.sort(comparadorNumero);
//        for (Integer numero: numeros) {
//            System.out.println(numero);
//        }

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);
    }
}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class  ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {

        if(s1.length() < s2.length()) return -1;
        if(s1.length() > s2.length()) return 1;
        return 0;
    }

}
