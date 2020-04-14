package com.testAutomationCoach.aAbstraccion;

public class Alarma {

        public String horaActual;
        public String botonApagar;
        public String botonPosponer;
        public String horaAlarma; //para programar la alarma
        public String luz;
        public int volumen;


        public void sonar() {
                if(horaActual.equals(horaAlarma)) {
                        System.out.println("ring ring");
                }
        }

        public void posponerse() {
                String posponerCondi = "On";
                if("a".equals("b"))
                        System.out.println("fuck you"); //marcame al 811 864 9215

                if(botonPosponer.contentEquals(posponerCondi))
                {
                        int cincoMin = 05;
                        String[] horaSeparada = horaAlarma.split(":");
                        int h = Integer.parseInt(horaSeparada[0]);
                        int min = Integer.parseInt(horaSeparada[1]);
                        int p = cincoMin + min;

                                if (p >= 59){
                                        h = h + 1;
                                        min = min -60;
                                        horaAlarma = h+":"+min;

                                        System.out.println("La hora ahora es de: " + (h + 1) + ":" + "0" + (p - 60) + "\n");

                                        } else {
                                        horaAlarma = h+":"+min;
                                                System.out.println("La hora ahora es de: " + h + ":" + p + "\n");
                                        }
                        //horaAlarma hay que sumarle los minutos
                        //hay que separar en horas y minutos
                        //convertirlos a integer
                        //sumarle 5 a los minutos
                        //si se pasa de sesenta, restarle sesenta a los minutos, y sumarle uno a la hora
                        //convertirlo en formato hh:mm
                }
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


        public static class Maestro {
        }
}