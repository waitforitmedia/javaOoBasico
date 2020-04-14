package com.testAutomationCoach.bVariables;

public class EjemploEscuela {
    public static void main(String[] args) {
        Escuela publica = new Escuela();

        Grupo a = new Grupo();

        Maestro profeFisica = new Maestro();
        profeFisica.nombre = "Profesor Jirafales";

        Alumno aplicado = new Alumno();
        aplicado.nombre = "Carlos Saul";

        Alumno burro = new Alumno();
        burro.nombre = "Juan Duenas";
        a.alumnos = new Alumno[2];
        a.alumnos[0] = aplicado;
        a.alumnos[1] = burro;

        a.profe = profeFisica;

        publica.grupos = new Grupo[1];
        publica.grupos[0] = a;


    }
}
