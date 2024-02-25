package org.example;

import java.util.HashMap;
import java.util.Map;

public class PlanificadorTareas {
    private Map<String, Integer> tareasPorMiembro;

    public PlanificadorTareas() {
        tareasPorMiembro = new HashMap<>();
    }

    public void asignarTarea(String miembro, int tareas) {
        tareasPorMiembro.put(miembro, tareas);
    }

    public void visualizarHorario() {
        System.out.println("Horario de tareas:");
        for (Map.Entry<String, Integer> entry : tareasPorMiembro.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " tareas");
        }
    }

    public int calcularCargaOptima() {
        int cargaTotal = 0;
        for (int tareas : tareasPorMiembro.values()) {
            cargaTotal += tareas;
        }
        return cargaTotal / tareasPorMiembro.size();
    }
}