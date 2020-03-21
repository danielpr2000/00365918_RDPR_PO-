package com.RDPR.x00365918;

public class Main {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Msi", "Window 7");

        laptop1.encender();
        laptop1.procesador("Intel Core Duo");
        laptop1.ram(16);
        laptop1.apagar();

        laptop1.setMarca("Asus");
        laptop1.setSO("Windows 98");
        laptop1.setDiscoD("1 T");


        System.out.println("La marca es: " + laptop1.getMarca());
        System.out.println("El sistema es: " + laptop1.getSO());
        System.out.println("El disco duro tiene capacidad de : " + laptop1.getDiscoD());

        System.out.println("\n");

        laptop2.encender();
        laptop2.procesador("Intel core i7");
        laptop2.ram(4);
        laptop2.apagar();
        laptop2.setDiscoD("500 GB");


        System.out.println("La marca es: " + laptop2.getMarca());
        System.out.println("El sistema  es: " + laptop2.getSO());
        System.out.println("EL disco duro tiene capacidad de: " + laptop2.getDiscoD());



    }
