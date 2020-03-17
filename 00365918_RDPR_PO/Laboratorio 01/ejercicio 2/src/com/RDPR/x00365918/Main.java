package com.RDPR.x00365918;

import java.util.Scanner;

public class Main {

    public static boolean Palindrome(String Palabra) {
        for (int i = 0; i < Palabra.length(); i++) {
            if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String Palabra;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la palabra");
        Palabra = scan.next();

        if (Palindrome(Palabra) == true) {
            System.out.println("Es palindrome: " + Palindrome(Palabra));
        } else {
            System.out.println("No es palindrome: " + Palindrome(Palabra));
        }
    }
}