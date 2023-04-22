package org.example.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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

        System.out.println(sum);

        Optional<Cursos> optinalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100).findAny();

        Cursos curso = optinalCurso.orElse(null);

        System.out.println("====================");
        System.out.println(curso.getNome());

    }
}
