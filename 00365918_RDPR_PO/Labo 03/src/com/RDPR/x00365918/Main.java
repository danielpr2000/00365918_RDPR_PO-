package com.RDPR.x00365918;

import javax.swing.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int opcion=0;
        double ganancias=0;
        String placa;
        ArrayList <automovil> autos= new ArrayList();
        String mensaje="1)Agregar vehiculo\n2)Salir del parqueo\n3)Consultar ticket\n4)Salir";
        do{
            String valor=JOptionPane.showInputDialog(null, mensaje, "hola", JOptionPane.INFORMATION_MESSAGE);
            if(valor==null){
                opcion=4;
            }
            else {
                opcion = Integer.parseInt(valor);
                switch(opcion){
                    case 1:
                        placa=JOptionPane.showInputDialog(null,"Placa","Ingresa tu placa",JOptionPane.QUESTION_MESSAGE);
                        String hora;
                        hora=registrodetiempo.validarhora(1);
                        autos.add(new automovil(placa,hora));
                        JOptionPane.showMessageDialog(null,"Agregado correctamente","Hecho",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 2:
                        boolean placaencontrado=false;
                        hora="";
                        placa=JOptionPane.showInputDialog(null,"Placa","Ingresa tu placa",JOptionPane.QUESTION_MESSAGE);
                        for(automovil aux:autos){
                            if(aux.getPlaca().equals(placa)) {
                                placaencontrado=true;
                                hora=aux.getHora();
                            }
                        }
                        if(!placaencontrado){
                            JOptionPane.showMessageDialog(null,"No hay ningun ticket registrado con esa placa","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else{
                            String horasalida="";
                            boolean validar=false;
                            do{
                                horasalida=registrodetiempo.validarhora(2);
                                if(registrodetiempo.validarhoramayor(horasalida,hora)){
                                    validar=true;
                                }
                            }
                            while(!validar);
                            registrodetiempo registro= new registrodetiempo(horasalida,hora);
                            int rango=(registro.horasenparqueo());
                            ganancias+=ticket.cobrar(rango);
                            String placaauxiliar=placa;
                            autos.removeIf(s->s.getPlaca().equals(placaauxiliar));
                        }
                        break;
                    case 3:
                        boolean encontrado=false;
                        placa=JOptionPane.showInputDialog(null,"Placa","Ingresa la placa a buscar",JOptionPane.QUESTION_MESSAGE);
                        for(automovil aux:autos){
                            if(aux.getPlaca().equals(placa)) {
                                String texto="Placa : " +aux.getPlaca() + "\nHora de entrada : "+aux.getHora()+"";
                                JOptionPane.showMessageDialog(null,texto,"Datos del automovil",JOptionPane.INFORMATION_MESSAGE);
                                encontrado=true;
                            }
                        }
                        if(!encontrado){
                            JOptionPane.showMessageDialog(null,"No hay ningun ticket registrado con esa placa","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        break;
                }
            }
        }
        while(opcion!=4);
        JOptionPane.showMessageDialog(null,"Las ganancias totales han sido $ "+ganancias,"Gracias por usar el sistema",JOptionPane.INFORMATION_MESSAGE);
    }
}
