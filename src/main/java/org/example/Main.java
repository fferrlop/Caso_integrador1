package org.example;

import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cronometro Cosmico");
        // CronometroCosmico

        System.out.println("Hello World");

        Date fecha1 = new Date();
        String myString = DateFormat.getDateInstance().format(fecha1);
        System.out.println("Fecha 1: " + myString);
        System.out.println("Fecha 1: " + fecha1.toString());

        CronometroCosmico cc1 = new CronometroCosmico();
        Date fecha2 = cc1.getFechaNuevoPlaneta();
        System.out.println("Fecha 2: " + fecha2.toString());

        System.out.println("cc1: " + cc1.toString());



        // GestorRecursos

        System.out.println("__________________________________________________________________________________");
        System.out.println("Gestor de Recursos");

        GestorRecursos agua = new GestorRecursos("Agua", 100, 50);
        agua.actualizarConsumo(20);

        double[] consumos = {30, 40, 50, 60};
        double totalConsumido = 0;
        for (double consumo : consumos) {
            totalConsumido += consumo;
        }


        agua.actualizarConsumo(totalConsumido);

        double media = agua.calcularMediaRecursosConsumidos(consumos);
        double minimo = agua.calcularMinimoRecursosConsumidos(consumos);
        double maximo = agua.calcularMaximoRecursosConsumidos(consumos);


        double[] proyeccion = new double[7];
        double cantidadRestante = agua.getCantidad();
        double consumoPromedio = totalConsumido / consumos.length;

        for (int i = 0; i < 7; i++) {
            if (cantidadRestante > 0) {
                proyeccion[i] = Math.min(cantidadRestante, consumoPromedio);
                cantidadRestante -= proyeccion[i];
            } else {
                proyeccion[i] = consumoPromedio;
            }
        }

        // Muestra los resultados

        System.out.println("Media de recursos consumidos: " + media);
        System.out.println("Mínimo de recursos consumidos: " + minimo);
        System.out.println("Máximo de recursos consumidos: " + maximo);
        System.out.println("Proyección de consumo para la próxima semana:");
        for (int i = 0; i < proyeccion.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + proyeccion[i]);
        }

// Sistema de alerta y Monitoreo
        System.out.println("__________________________________________________________________________________");
        System.out.println("Sistema de Alerta y Monitoreo");

        SistemaMonitoreo sistema = new SistemaMonitoreo();
        sistema.monitorear();

// Planificador de tareas

        System.out.println("__________________________________________________________________________________");
        System.out.println("Planificador de Tareas");

        PlanificadorTareas planificador = new PlanificadorTareas();

        // Asignar tareas a cada miembro de la tripulación
        planificador.asignarTarea("Miembro 1", 5);
        planificador.asignarTarea("Miembro 2", 6);
        planificador.asignarTarea("Miembro 3", 4);

        // Visualizar horario y cargas de trabajo
        planificador.visualizarHorario();

        // Calcular carga de trabajo óptima
        int cargaOptima = planificador.calcularCargaOptima();
        System.out.println("Carga de trabajo óptima por miembro: " + cargaOptima);

//Navegador Estelar

        System.out.println("__________________________________________________________________________________");
        System.out.println("Navegador Estelar");

        int[][] terreno = {
                {0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}
        };

        NavegadorEstelar navegador = new NavegadorEstelar(terreno);

        navegador.visualizarTerreno();

        navegador.planificarRutaOptima();

// Comunicador Intergaláctico

        System.out.println("__________________________________________________________________________________");
        System.out.println("Comunicador Intergalactico");

        String mensaje = "Anita lava la tina";

        int cantidadVocales = ComunicadorInterplanetario.contarVocales(mensaje);
        System.out.println("Cantidad de vocales: " + cantidadVocales);


        String mensajeInvertido = ComunicadorInterplanetario.invertirMensaje(mensaje);
        System.out.println("Mensaje invertido: " + mensajeInvertido);


        boolean esPalindromo = ComunicadorInterplanetario.esPalindromo(mensaje);
        System.out.println("Es palíndromo: " + esPalindromo);

    }
}