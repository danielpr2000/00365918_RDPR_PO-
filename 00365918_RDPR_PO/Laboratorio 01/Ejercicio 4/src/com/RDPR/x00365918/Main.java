package com.RDPR.x00365918;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra: ");
        String palabra = scan.nextLine();

        System.out.println(palabra.replace("a", "b"));


    }
}
