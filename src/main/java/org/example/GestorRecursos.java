package org.example;

import java.util.Arrays;

public class GestorRecursos {
    private String nombre;
    private double cantidad;
    private double umbralSeguro;

    public GestorRecursos(String nombre, double cantidad, double umbralSeguro) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.umbralSeguro = umbralSeguro;
    }

    public void actualizarConsumo(double consumo) {
        cantidad -= consumo;
    }

    public double calcularPrediccionNecesidadFutura(int periodo) {

        return cantidad;
    }

    public boolean verificarUmbralSeguro() {
        return cantidad >= umbralSeguro;
    }

    public double calcularMediaRecursosConsumidos(double[] consumos) {
        double total = 0;
        for (double consumo : consumos) {
            total += consumo;
        }
        return total / consumos.length;
    }

    public double calcularMinimoRecursosConsumidos(double[] consumos) {
        Arrays.sort(consumos);
        return consumos[0];
    }

    public double calcularMaximoRecursosConsumidos(double[] consumos) {
        Arrays.sort(consumos);
        return consumos[consumos.length - 1];
    }

    public double[] generarProyeccionConsumo(int periodo) {
        double[] proyeccion = new double[periodo];

        Arrays.fill(proyeccion, cantidad);
        return proyeccion;
    }

    public double getCantidad() {
        return cantidad;
    }


}