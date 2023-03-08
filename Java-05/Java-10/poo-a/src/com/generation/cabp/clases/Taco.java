package com.generation.cabp.clases;

public class Taco {
    private String tipo;
    private int cantidad;
    private boolean esPicante;
    private double precio;

    public Taco(String tipo, int cantidad, boolean esPicante, double precio) {
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.esPicante = esPicante;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public boolean isEsPicante() {
        return esPicante;
    }
    public void setEsPicante(boolean esPicante) {
        this.esPicante = esPicante;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString() {
        String picante = esPicante ? "picante" : "no picante";
        return cantidad + " tacos de " + tipo + " " + picante + " a $" + precio + " cada uno";
    }
}