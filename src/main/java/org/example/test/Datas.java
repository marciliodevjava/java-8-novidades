package org.example.test;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args){

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olipiadasRio = LocalDate.of(2024, Month.JUNE, 5);

        int anos = olipiadasRio.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje, olipiadasRio);

        System.out.println(periodo.getDays());

        LocalDate proxmaOlipiadas = olipiadasRio.plusYears(4);

        System.out.println(proxmaOlipiadas);

        DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        String valorFormatado = proxmaOlipiadas.format(dataFormatada);

        System.out.println(valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(dataHoraFormatada));

        Year ano = Year.now();
        YearMonth mes = YearMonth.now();

        System.out.println(ano);
        System.out.println(mes);
    }
}
