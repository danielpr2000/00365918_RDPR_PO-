package com.RDPR.x00365918;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero hasta qeu la secuencia llegara ");
        String s = "";
        s = scan.nextLine();
        int n = Integer.parseInt(s);


        String resultado = recursiveDesc(1, n) + ", " + recursiveAsc(n - 1);
        System.out.println("Result: " + resultado);
    }


    private static String recursiveAsc(int a) {
        return a == 1 ? "" + a : (a + ", " + recursiveAsc(a - 1));
    }

    private static String recursiveDesc(int a, int i) {
        return a == i? ("" + a) : a + ", " + recursiveDesc(a + 1, i);
    }
}
