package com.RDPR.x00365918;

import javax.swing.*;
public class registrodetiempo {
    private String horasalida,horaentrada;
    private int horadeentrada,horadesalida,minutosentrada,salida,minutossalida;

    public registrodetiempo(String horasalida, String horaentrada) {
        this.horasalida = horasalida;
        this.horaentrada = horaentrada;
    }
    public static String validarhora(int mensaje){
        boolean resultado=false;
        int minutos,horas;
        String hora,texto;
        if(mensaje==1){
            texto="Ingresa tu hora de entrada";
        }
        else{
            texto="Ingresa tu hora de salida";
        }
        do {
            hora = JOptionPane.showInputDialog(null, "Formato de la hora HH:mm", texto, JOptionPane.QUESTION_MESSAGE);
            if (hora != null) {
                if (hora.length() > 5 || hora.length() < 5) {
                    JOptionPane.showMessageDialog(null, "Formato invalido", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        Integer.parseInt(hora.substring(0, 2));
                        Integer.parseInt(hora.substring(3, 5));
                        horas = Integer.parseInt(hora.substring(0, 2));
                        minutos = Integer.parseInt(hora.substring(3, 5));
                        if (hora.substring(2, 3).equals(":")) {
                            if (horas <= 23 && minutos <= 59 && horas > -1 && minutos > -1) {
                                resultado = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Formato invalido", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Formato invalido", "Error", JOptionPane.ERROR_MESSAGE);
                            resultado = false;
                        }
                    } catch (NumberFormatException excepcion) {
                        resultado = false;
                    }
                }
            }
            else{
                resultado=true;
            }
        }
        while (resultado == false) ;
        return hora;
    }

    public int horasenparqueo(){
        horadeentrada=Integer.parseInt(horaentrada.substring(0,2));
        minutosentrada=Integer.parseInt(horaentrada.substring(3,5));
        horadesalida=Integer.parseInt(horasalida.substring(0,2));
        minutossalida=Integer.parseInt(horasalida.substring(3,5));
        if(horadeentrada==horadesalida){//la misma hora diferentes minutos
            if(minutossalida-minutosentrada<30){
                salida=1;//primer tarifa
            }
            else{
                salida=2;//segunda tarifa
            }
        }
        else{
            if(horadesalida>horadeentrada){//10- 11 ejemplo
                if(horadesalida-horadeentrada==1) {
                    if ((minutosentrada - minutossalida) <= 0) {
                        salida = 3;//tercer tarifa
                    } else {
                        salida = 2;//menos de la hora
                    }
                }
                else if(horadesalida-horadeentrada==2) {
                    if((minutosentrada-minutossalida)>0){
                        salida=3;
                    }
                    else {
                        salida = 4;//pasa de las 2 horas
                    }
                }
                else{
                    salida=4;
                }
            }
        }
        return salida;
    }
    public static boolean validarhoramayor(String horasalida, String horaentrada){
        boolean valor=false;
        int horas,horae,mine,mins;
        horas=Integer.parseInt(horasalida.substring(0,2));
        mins=Integer.parseInt(horasalida.substring(3,5));
        mine=Integer.parseInt(horaentrada.substring(3,5));
        horae=Integer.parseInt(horaentrada.substring(0,2));
        if(horas==horae){
            if(mine>mins){
                JOptionPane.showMessageDialog(null,"La hora de salida no puede ser menor a la de entrada","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                valor=true;
            }
        }
        else{
            if(horae>horas){
                JOptionPane.showMessageDialog(null,"La hora de salida no puede ser menor a la de entrada","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                valor=true;
            }
        }
        return valor;
    }
}