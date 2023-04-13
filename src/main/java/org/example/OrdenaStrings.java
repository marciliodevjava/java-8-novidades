package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

    public static void main(String[] args) {

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
        for (String nome : palavras) {
            System.out.println(nome);
        }

        System.out.println("Números.");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Palavras ordenadas.");
        palavras.sort((s1, s2) -> {
                    if (s1.length() < s2.length()) return -1;
                    if (s1.length() > s2.length()) return 1;
                    return 0;
                }
        );

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        palavras.sort(Comparator.comparing(s -> s.length()));

        palavras.forEach(s -> System.out.println(s));

        Function<String, Integer> funcao = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        Consumer<String> impressor = s -> System.out.println(s);
        palavras.forEach(impressor);


        System.out.println("Números ordenados.");
        numeros.sort(comparadorNumero);
        numeros.forEach(System.out::println);
    }
}


class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {

        if (s1.length() < s2.length()) return -1;
        if (s1.length() > s2.length()) return 1;
        return 0;
    }

}
