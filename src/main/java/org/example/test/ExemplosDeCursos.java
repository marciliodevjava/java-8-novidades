package org.example.test;

import java.util.ArrayList;
import java.util.List;

public class ExemplosDeCursos {

    public static void main(String[] args){

        List<Cursos> cursos = new ArrayList<>();

        cursos.add(new Cursos("Python", 45));
        cursos.add(new Cursos("JavaScript", 150));
        cursos.add(new Cursos("Java 8", 133));
        cursos.add(new Cursos("C", 55));

        cursos.forEach(System.out::println);
    }
}
