package com.testAutomationCoach.cMethods;

public class JuegoBatalla {
    public static void main(String[] args) {
        CampoDeBatalla2 juego = new CampoDeBatalla2() ;
        while(true) {
            juego.pedirPosicion();
            if(juego.hayGanador())
                break;
        }
    }
}