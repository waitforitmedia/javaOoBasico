package com.testAutomationCoach.aAbstraccion;

public class Alarma {

        public String horaActual;
        public String botonApagar;
        public String botonposPoner;
        public String horaAlarma; //para programar la alarma
        public String luz;
        public int volumen;


        public void sonar() {
                if(horaActual.equals(horaAlarma)) {
                        System.out.println("¨ring ring");
                }
        }

        public void posponerse() {
                //horaAlarma hay que sumarle los minutos
                //hay que separar en horas y minutos
                //convertirlos a integer
                //sumarle 5 a los minutos
                //si se pasa de sesenta, restarle sesenta a los minutos, y sumarle uno a la hora
                //convertirlo en formato hh:mm

        }

        public void darHora() {
                System.out.println(horaActual);
        }

        public void programarse(String horaProgramar) {
                horaAlarma = horaProgramar;
        }

        public void mostarAlarma() {
                System.out.println(horaAlarma);
        }



    }