package com.RDPR.x00365918;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Realiza un programa que reciba n letras por teclado y almacene en una lista solo las vocales, mayúsculas o minúsculas


        Scanner scan = new Scanner(System.in);

        System.out.println("digite la cantidad de letras que desea insertar");

        int n=scan.nextInt();

        int a=0;
        int b=0;
        int c=0;

        char[] letras=new char[n];
        char[] mayus= new char[n];
        char[] minus= new char[n];
        char[] vocal= new char[n];

        for (int i=0;i<n;i++) {

            System.out.println("digite una letra");
            letras[i]=scan.next().charAt(0);

            if(Character.isUpperCase(letras[i])) {
                ;

                mayus[a] =letras[i];
                a++;
            }
            else{

                minus[b]= letras[i];
                b++;

            }

            switch (letras[i]) {

                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':vocal[c]=letras[i];c++;break;

            }
        }

        if(a>0) {
            System.out.println("lista de mayusculas");
            for (int i = 0; i < a; i++) {
                System.out.print(" "+mayus[i]);
            }
        }

        System.out.println(" ");

        if(b>0) {
            System.out.println("lista de minusculas");
            for (int i = 0; i < b; i++) {
                System.out.print(" "+minus[i]);
            }
        }
        System.out.println(" ");

        if(c>0) {
            System.out.println("lista de vocales");
            for (int i = 0; i < c; i++) {
                System.out.print(" "+vocal[i]);
            }
        }
    }

}
