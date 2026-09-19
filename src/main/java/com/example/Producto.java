package com.example;

public class Producto {
    // Atributos

    private String moto;
    private String Yamaha;
    private double precio;
    private int stock;

    // Constructor

    public Producto(String moto, String Yamaha, double precio, int stock) {
        this.moto= moto;
        this.Yamaha = Yamaha;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters

    public String getMoto() {
        return moto;
    }

    public String getYamaha() {
        return Yamaha;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public void setYamaha(String yamaha) {
        this.Yamaha = yamaha;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }

    }
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    // Método toString
    @Override
    public String toString() {
        return " vehiculo : " + moto +
                ", Nombre: " + Yamaha+
                ", Precio: " + precio +
                ", Stock: " + stock + "]";
    }
}

