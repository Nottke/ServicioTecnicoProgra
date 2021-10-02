package com.mycompany.serviciotecnico;

public class Producto {
    private String nombre;                                        //atributos
    private String precio;
    private String stock;
    
    public Producto(String nombre, String precio, String stock) { //constructor
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void mostrarProducto(){
        System.out.println("El producto "+this.nombre+" tiene el precio de $ "+this.precio+" y hay "+this.stock+" disponibles .");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
