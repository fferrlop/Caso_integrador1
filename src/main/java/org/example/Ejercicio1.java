package org.example;

public class Ejercicio1 {

    static final double TIEMPO_PLANETA = 1.5; // Supongamos que el nuevo planeta tiene un ciclo diario 1.5 veces más largo que el de la Tierra
    static final double ANIO_PLANETA = 0.8; // Supongamos que un año en el nuevo planeta equivale al 80% de un año en la Tierra

    public static void main(String[] args) {
        // Tiempo en la Tierra
        int segundosTierra = 1000000000; // Ejemplo de tiempo en segundos
        // Conversión de tiempo
        double segundosPlaneta = convertirTiempo(segundosTierra);

        // Visualización del tiempo en varios formatos
        mostrarTiempo(segundosTierra, segundosPlaneta);

        // Identificación de los límites de representación de datos
        identificarLimitesDatos();
    }

    // Función para convertir tiempo de la Tierra al nuevo planeta
    static double convertirTiempo(int segundosTierra) {
        double segundosPlaneta = segundosTierra * TIEMPO_PLANETA;
        return segundosPlaneta;
    }

    // Función para mostrar el tiempo en varios formatos
    static void mostrarTiempo(int segundosTierra, double segundosPlaneta) {
        System.out.println("Tiempo en la Tierra:");
        mostrarTiempoFormato(segundosTierra);
        System.out.println("Tiempo en el nuevo planeta:");
        mostrarTiempoFormato((int)segundosPlaneta);
    }

    // Función auxiliar para mostrar el tiempo en formato horas, minutos y segundos
    static void mostrarTiempoFormato(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int seg = segundos % 60;
        System.out.printf("%d horas, %d minutos, %d segundos%n", horas, minutos, seg);
    }

    // Función para identificar los límites de representación de datos
    static void identificarLimitesDatos() {
        System.out.println("Límites de representación de datos:");
        System.out.println("Entero más grande representable en Java: " + Integer.MAX_VALUE);
        System.out.println("Entero más grande representable en el nuevo planeta: " + (int)(Integer.MAX_VALUE / TIEMPO_PLANETA));
    }

}
