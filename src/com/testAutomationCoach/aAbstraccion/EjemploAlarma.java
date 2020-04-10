package com.testAutomationCoach.aAbstraccion;

public class EjemploAlarma {
    public static void main(String[] args) {
        Alarma a = new Alarma();
        a.horaActual = "12:12";
        a.botonApagar = "On";
        a.botonposPoner = "Off";
        a.horaAlarma = "2 Vueltas";
        a.volumen = 15;
        a.luz = "Off";

        a.sonar();
        a.posponerse();
        a.darHora();
        a.programarse();
        a.posponerse();

        libs.Input.print("La hora del reloj es de: " + a.horaActual + "\n");
        libs.Input.print("El volumen de la alarma es de: " + a.volumen + "\n");
        libs.Input.print("Cuerda: " + a.horaAlarma + "\n");
        libs.Input.print("Luz: " + a.luz + "\n");
        libs.Input.print("Posponer: " + a.botonposPoner + "\n");
        libs.Input.print("Apagar: " +a.botonApagar + "\n");

    }
}
