package org.example;

import java.util.Date;

public class CronometroCosmico {

    static double FC = 0.0000001; // Ajustamos el valor de FC
    Date fechaPlanetaTierra;
    Date fechaNuevoPlaneta;

    public CronometroCosmico() {
        fechaPlanetaTierra = new Date(System.currentTimeMillis());
        long fnp = this.fechaPlanetaTierra.getTime();
        long tiempoNuevoPlaneta = (long) (fnp * FC); // Utilizamos directamente fnp * FC
        fechaNuevoPlaneta = new Date(fnp - tiempoNuevoPlaneta); // Restamos el tiempoNuevoPlaneta
    }

    public Date getFechaPlanetaTierra() {
        return fechaPlanetaTierra;
    }

    public Date getFechaNuevoPlaneta() {
        return fechaNuevoPlaneta;
    }

    public void setFechaPlanetaTierra(Date fechaPlanetaTierra) {
        this.fechaPlanetaTierra = fechaPlanetaTierra;
    }

    public void setFechaNuevoPlaneta(Date fechaNuevoPlaneta) {
        this.fechaNuevoPlaneta = fechaNuevoPlaneta;
    }

    public static double getFC() {
        return FC;
    }

    public static void setFC(double FC) {
        CronometroCosmico.FC = FC;
    }

    @Override
    public String toString() {
        return "[" + "fechaPlanetaTierra=" + fechaPlanetaTierra + ", fechaNuevoPlaneta=" + fechaNuevoPlaneta + "]";
    }
}