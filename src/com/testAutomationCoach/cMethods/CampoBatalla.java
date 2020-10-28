package com.testAutomationCoach.cMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CampoBatalla {

    public static char[][] matriz = new char[3][3];

    public static void main(String[] args) {
        //public static void imprimirPosiciones(); {
            int pos = 1;
            System.out.println("Selecciona una posición en el tablero: ");
            System.out.println("Las casillas marcadas con X u O ya están ocupadas");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if (matriz[i][j] == 'X' || matriz[i][j] == 'O')
                        System.out.print(" " + matriz[i][j]);
                    else
                        System.out.print(" " + pos);
                    pos++;
                }
                System.out.println();
            }

    }

    public static boolean casillaNoOcupada(int posicion){
        switch (posicion){
            case 1: return matriz[0][0]!=' ';
            case 2: return matriz[0][1]!=' ';
            case 3: return matriz[0][2]!=' ';
            case 4: return matriz[1][0]!=' ';
            case 5: return matriz[1][1]!=' ';
            case 6: return matriz[1][2]!=' ';
            case 7: return matriz[2][0]!=' ';
            case 8: return matriz[2][1]!=' ';
            case 9: return matriz[2][2]!=' ';
            default: return false;
        }
    }

    public static void registrarJugada(char caracter) throws IOException {
        boolean salir = false;
        String entrada;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        int posicion;
        do{
            //imprimirPosiciones();
            System.out.println("Escriba el número de casilla en donde desea tirar: ");
            entrada = bufer.readLine();
            posicion = Integer.parseInt(entrada);
            if ( casillaNoOcupada(posicion)){
                switch (posicion){
                    case 1: matriz[0][0] = caracter;
                        break;
                    case 2: matriz[0][1] = caracter;
                        break;
                    case 3: matriz[0][2] = caracter;
                        break;
                    case 4: matriz[1][0] = caracter;
                        break;
                    case 5: matriz[1][1] = caracter;
                        break;
                    case 6: matriz[1][2] = caracter;
                        break;
                    case 7: matriz[2][0] = caracter;
                        break;
                    case 8: matriz[2][1] = caracter;
                        break;
                    case 9: matriz[2][2] = caracter;
                        break;
                }
                salir = true;
            }
            else
                System.out.println("Casilla no válida, escriba una posición valida");
        } while (!salir);
    }
    }

