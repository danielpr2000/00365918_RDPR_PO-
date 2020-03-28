package com.RDPR.x00365918;

import javax.swing.*;

public class ticket {
    public static double cobrar(int rango){//1-gratis/2-0.50...
        double precio=0,vuelto=0,cantidad=0;
        boolean pagocorrecto=false;
        String mensaje;
        switch (rango){
            case 2:
                precio=0.50;
                break;
            case 3:
                precio=1.00;
                break;
            case 4:
                precio=5.00;
                break;
        }
        if(precio==0){
            mensaje="Tu estadia ha sido menor a 30 minutos el parqueo es gratis, gracias por visitarnos!";
            JOptionPane.showMessageDialog(null,mensaje,"Vuelve pronto",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            mensaje="El total a pagar es $"+precio+"\n\nElige la denominacion de monedas con las que deseas pagar :"+
                    "\n1)$0.05\n2)$0.10\n3)0.25\n4)$1.00";
            int opcion= Integer.parseInt(JOptionPane.showInputDialog(null,mensaje,"Pagar",JOptionPane.INFORMATION_MESSAGE));
            do{
                int moneda=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa la cantidad de monedas :","Monedas",JOptionPane.INFORMATION_MESSAGE));
                switch (opcion){
                    case 1:
                        cantidad=(int)(precio/0.05);
                        if(cantidad<moneda){
                            vuelto=(moneda-cantidad)*0.05;
                            JOptionPane.showMessageDialog(null,"Tu vuelto es $"+vuelto,"Vuelve pronto",JOptionPane.INFORMATION_MESSAGE);
                            pagocorrecto=true;
                        }
                        break;
                    case 2:
                        cantidad=(int)(precio/0.10);
                        if(cantidad<moneda){
                            vuelto=(moneda-cantidad)*0.10;
                            JOptionPane.showMessageDialog(null,"Tu vuelto es $"+vuelto,"Vuelve pronto",JOptionPane.INFORMATION_MESSAGE);
                            pagocorrecto=true;
                        }
                        break;
                    case 3:
                        cantidad=(int)(precio/0.25);
                        if(cantidad<moneda){
                            vuelto=(moneda-cantidad)*0.25;
                            JOptionPane.showMessageDialog(null,"Tu vuelto es $"+vuelto,"Vuelve pronto",JOptionPane.INFORMATION_MESSAGE);
                            pagocorrecto=true;
                        }
                        break;
                    case 4:
                        cantidad=(precio/1);
                        if(cantidad<moneda){
                            vuelto=(moneda-cantidad)*1;
                            JOptionPane.showMessageDialog(null,"Tu vuelto es $"+vuelto,"Vuelve pronto",JOptionPane.INFORMATION_MESSAGE);
                            pagocorrecto=true;
                        }
                        break;
                }
                if(cantidad==moneda){
                    JOptionPane.showMessageDialog(null,"Gracias por tu visita!!","Vuelve pronto",JOptionPane.INFORMATION_MESSAGE);
                    pagocorrecto=true;
                }
                else if(cantidad>moneda){
                    JOptionPane.showMessageDialog(null,"No has ingresado suficientes monedas","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            while(!pagocorrecto);
        }
        return precio;
    }
}
