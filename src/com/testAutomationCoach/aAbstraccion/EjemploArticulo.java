package com.testAutomationCoach.aAbstraccion;

public class EjemploArticulo {

    public static void main(String[] args) {
        Articulo a = new Articulo();
        a.tamano = 150;
        a.tema = "Politica";

        a.nombreTema();
        a.tamanioDelTema();

        libs.Input.print("Tamaño " + a.tamano + " Paginas" + "\n");
        libs.Input.print("Tema " + a.tema + "\n");

    }
}
