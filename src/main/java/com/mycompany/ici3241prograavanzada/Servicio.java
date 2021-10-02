package com.mycompany.ici3241prograavanzada;

public class Servicio {
    private String servicio;                               //atributos
    private int precioServicio;
    
    public Servicio(String servicio, int precioServicio) { //constructor
        this.servicio = servicio;
        this.precioServicio = precioServicio;
    }
    
    public void mostrarServicio(){
        System.out.println("hola");
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(int precioServicio) {
        this.precioServicio = precioServicio;
    }
    
}
