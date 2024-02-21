package org.example;
import java.util.Arrays;

public class Ejercicio2 {

    static final int UMBRAL_SEGURO = 20; // Porcentaje

    public static void main(String[] args) {
        // Datos de consumo de recursos (agua, comida, oxígeno) en un periodo de 5 días
        int[] consumoAgua = {25, 30, 20, 35, 28}; // Ejemplo de consumo de agua en litros
        int[] consumoComida = {50, 55, 45, 60, 52}; // Ejemplo de consumo de comida en kilogramos
        int[] consumoOxigeno = {40, 38, 42, 36, 39}; // Ejemplo de consumo de oxígeno en litros

        // Calcular estadísticas de consumo
        calcularEstadisticas(consumoAgua, "agua");
        calcularEstadisticas(consumoComida, "comida");
        calcularEstadisticas(consumoOxigeno, "oxígeno");

        // Alertas de recursos bajos
        verificarNivelesBajos(consumoAgua, "agua");
        verificarNivelesBajos(consumoComida, "comida");
        verificarNivelesBajos(consumoOxigeno, "oxígeno");
    }

    // Función para calcular estadísticas de consumo de recursos
    static void calcularEstadisticas(int[] consumo, String recurso) {
        int total = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int valor : consumo) {
            total += valor;
            if (valor < min) {
                min = valor;
            }
            if (valor > max) {
                max = valor;
            }
        }

        double promedio = total / (double) consumo.length;

        System.out.println("Estadísticas de consumo de " + recurso + ":");
        System.out.println("Total consumido: " + total);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mínimo: " + min);
        System.out.println("Máximo: " + max);
    }

    // Función para verificar niveles bajos de recursos y generar alertas
    static void verificarNivelesBajos(int[] consumo, String recurso) {
        double promedio = Arrays.stream(consumo).average().orElse(0);
        if (promedio < UMBRAL_SEGURO) {
            System.out.println("¡Alerta! Consumo de " + recurso + " por debajo del umbral seguro.");
        }
    }
}
