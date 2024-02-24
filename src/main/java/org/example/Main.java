package org.example;

import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");

        Date fecha1 = new Date();
        String myString = DateFormat.getDateInstance().format(fecha1);
        System.out.println("Fecha 1: " + myString);
        System.out.println("Fecha 1: " + fecha1.toString());

        CronometroCosmico cc1 = new CronometroCosmico();
        Date fecha2 = cc1.getFechaNuevoPlaneta();
        System.out.println("Fecha 2: " + fecha2.toString());

        // CronometroCosmico
        System.out.println("cc1: " + cc1.toString());
    }
}