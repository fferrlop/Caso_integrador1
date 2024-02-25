package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaMonitoreo {
    public void monitorear() {
        // Simulamos los valores de radiación, temperatura y presión
        double nivelRadiacion = 8.0;
        double temperatura = 30.0;
        double presion = 100.0;

        // Mostramos los valores iniciales
        System.out.println("Niveles iniciales:");
        System.out.println("Nivel de radiación: " + nivelRadiacion);
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Presión: " + presion);

        // Identificación y notificación de eventos raros o críticos (números primos)
        System.out.println("\nPrimeros 5 números primos:");
        List<Integer> primerosPrimos = encontrarPrimerosPrimos(5);
        for (int primo : primerosPrimos) {
            System.out.println(primo);
        }
    }

    private List<Integer> encontrarPrimerosPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        int numero = 2; // Comenzamos desde el primer número primo

        while (primos.size() < n) {
            if (esPrimo(numero)) {
                primos.add(numero);
            }
            numero++;
        }
        return primos;
    }

    private boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}