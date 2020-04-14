package com.testAutomationCoach.bVariables;

public class Escuela {

    public Grupo[] grupos;
    public void recreo() {

    }

    public void clases() {

            Alumno[] grupo;
            grupo = new Alumno[12];
            grupo[0] = new Alumno();
            grupo[1] = new Alumno();
            System.out.println(grupo[2]);
            //inicializar el resto de los perros.

            //ingresar caracteristicas del perro en la primera celda
            grupo[0].nombre = "Solovino";

            //mover al perro de la celda 0 a la celda 3
            grupo[3] = grupo[0];
            //vaciar la celda cero
            grupo[0] = null;
            System.out.println(grupo[1]);

    }

    public void asesorias() {
    }

}
