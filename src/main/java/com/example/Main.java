package com.example;

public class Main {

    public static void main(String[] args) {

        // primer objeto

        vehiculo producto1 = new vehiculo(
            "V001",
            "Yamaha FZ 2.0",
            15000000,
            50

        );

        //  segundo objeto

        vehiculo producto2 = new vehiculo(
            "V002",
            "Yamaha MT-03",
            28000000,
            30

        );

        // atributos utilizando Setter

        producto1.setPrecio(15500000);
        producto1.setStock(45);
        producto2.setPrecio(28500000);
        producto2.setStock(25);

        //  Getter para imprimir atributos del primer objeto

        System.out.println("PRODUCTO 1");
        System.out.println("Nombre: " + producto1.getYamaha());
        System.out.println("Precio: " + producto1.getPrecio());

        //  Getter para imprimir atributos del segundo objeto

        System.out.println("\nPRODUCTO 2");
        System.out.println("Nombre: " + producto2.getYamaha());
        System.out.println("Stock: " + producto2.getStock());

        //toString()

        System.out.println("\nINFORMACIÓN COMPLETA");
        System.out.println(producto1);
        System.out.println(producto2);

    }

}