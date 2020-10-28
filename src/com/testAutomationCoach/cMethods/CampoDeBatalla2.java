package com.testAutomationCoach.cMethods;

public class CampoDeBatalla2 {


    char[] listaPosiciones;
    int contadorGolpes;
    int contadorPosiciones;

    public CampoDeBatalla2() {
        listaPosiciones = new char[10];
        listaPosiciones[0] = 'L';
        listaPosiciones[1] = 'L';
        listaPosiciones[2] = 'L';
        listaPosiciones[3] = 'L';
        listaPosiciones[4] = 'N';
        listaPosiciones[5] = 'N';
        listaPosiciones[6] = 'N';
        listaPosiciones[7] = 'N';
        listaPosiciones[8] = 'N';
        listaPosiciones[9] = 'N';
        contadorPosiciones = 6;
        contadorGolpes = 0;


    }


          public void  golpearPosicion(int numeroPosicion) {
              if (listaPosiciones[numeroPosicion] == 'N') {
                  contadorGolpes = contadorGolpes + 1;
                  listaPosiciones[numeroPosicion] = 'X';
                  System.out.println("Golpeaste una nave. ");
              } else if (listaPosiciones[numeroPosicion] == 'X') { System.out.println("Ya le habias pegado. ");}
                else

                  System.out.println("Fallaste el golpe. ");
              }

          public void pedirPosicion() {
                libs.Input.print("Cual es la posición a golpear? ");
                int numeroPosicion = libs.Input.get_int();
                golpearPosicion(numeroPosicion);

          }


          public boolean  hayGanador() {
                if(contadorGolpes == contadorPosiciones) {
                    System.out.println("Ganaste el juego. ");
                    return true;
                } else
                    return  false;
          }

}
