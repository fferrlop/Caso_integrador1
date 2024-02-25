package org.example;

public class NavegadorEstelar {
    private int[][] terreno;

    public NavegadorEstelar(int[][] terreno) {
        this.terreno = terreno;
    }

    public void visualizarTerreno() {
        System.out.println("Terreno:");
        for (int[] fila : terreno) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public void planificarRutaOptima() {
        int[][] rutaOptima = calcularRutaOptima();
        if (rutaOptima != null) {
            System.out.println("Ruta óptima planificada:");
            for (int[] paso : rutaOptima) {
                int fila = paso[0];
                int columna = paso[1];
                System.out.println("(" + fila + ", " + columna + ")");
            }
        } else {
            System.out.println("No se pudo planificar una ruta óptima.");
        }
    }

    private int[][] calcularRutaOptima() {

        int[][] rutaOptima = {{0, 0}, {1, 1}, {2, 2}, {3, 3}, {4, 4}};
        return rutaOptima;
    }
}