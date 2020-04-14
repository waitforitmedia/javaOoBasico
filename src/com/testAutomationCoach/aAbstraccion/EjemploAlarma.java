package com.testAutomationCoach.aAbstraccion;

public class EjemploAlarma {
    public static void main(String[] args) {
        Alarma a = new Alarma();
        a.horaActual = "12:12";
        a.botonApagar = "On";
        a.botonPosponer = "On";
        a.horaAlarma = "15:55";
        a.volumen = 15;
        a.luz = "Off";

        a.sonar();
        a.posponerse();
        a.darHora();
        //a.programarse();
        //a.programarse();

        libs.Input.print("La hora del reloj es de: " + a.horaActual + "\n");
        libs.Input.print("El volumen de la alarma es de: " + a.volumen + "\n");
        libs.Input.print("Cuerda: " + a.horaAlarma + "\n");
        libs.Input.print("Luz: " + a.luz + "\n");
        libs.Input.print("Posponer: " + a.botonPosponer + "\n");
        libs.Input.print("Apagar: " +a.botonApagar + "\n");

    }
}
