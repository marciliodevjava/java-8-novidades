package org.example.test;

import java.util.*;
import java.util.stream.Collectors;

public class ExemplosDeCursos {

    public static void main(String[] args) {

        List<Cursos> cursos = new ArrayList<>();
        List<Cursos> cursos2 = new ArrayList<>();

        cursos.add(new Cursos("Python", 45));
        cursos.add(new Cursos("JavaScript", 150));
        cursos.add(new Cursos("Java 8", 133));
        cursos.add(new Cursos("C", 55));

        cursos.forEach(c -> {
            cursos2.add(c);
        });

        for (Cursos imprime : cursos2) {
            System.out.println(imprime.toString());
        }

        cursos.sort(Comparator.comparing(Cursos::getNome));
        cursos.forEach(c -> System.out.println(c.getNome()));

        System.out.println("Cursos com mais de 100 Alunos");
        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));

        int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).sum();

        OptionalDouble sum1 = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(c -> c.getAlunos()).average();

        System.out.println(sum);

        cursos.stream().filter(c -> c.getAlunos() >= 100)
                                                .findAny().ifPresent(c -> System.out.println(c.getNome()));


        System.out.println("====================");

        cursos =  cursos.stream().filter(c -> c.getAlunos() >= 100).collect(Collectors.toList());

        Map<String, Integer> map = cursos.stream()
                                            .filter(c -> c.getAlunos() >= 100 )
                                            .collect(Collectors.toMap(
                                                    c -> c.getNome(),
                                                    c -> c.getAlunos()));

        System.out.println("Impressão do map");
        System.out.println(map);

        cursos.forEach(System.out::println);
    }
}
