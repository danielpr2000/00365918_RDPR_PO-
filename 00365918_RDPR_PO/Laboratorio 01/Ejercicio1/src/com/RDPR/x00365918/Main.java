package com.RDPR.x00365918;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0 , b = 1 , resultado=0;


        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese hasta que término desea que llegue la secuencia: " );
        byte n = scan.nextByte();


        if(n==1){
            System.out.println(a);

        }
        if(n==2){

            System.out.println(a+" "+b);

        }
        if(n>=3){
            System.out.print(a+" "+b);

            for(byte i= 3; i<= n; i++){

                resultado = a + b;
                a = b;
                b = resultado;

                System.out.print(" "+resultado);
            }

        }
    }
}



