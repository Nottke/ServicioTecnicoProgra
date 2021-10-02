package com.mycompany.serviciotecnico;

import java.util.ArrayList;

public class OrdenTrabajo {
    private int numOrden;
    private int rutCliente;
    private String servicio;
    private String fecha;
    private int precio;
    public ArrayList<Servicio> listaServicios;
    

    public OrdenTrabajo(int numOrden, int rutCliente, String servicio, String fecha, int precio) {
        this.numOrden = numOrden;
        this.rutCliente = rutCliente;
        this.servicio = servicio;
        this.fecha = fecha;
        this.precio = precio;
        this.listaServicios = new ArrayList<>();
        
    }
    
    public void agregarServicio(Servicio b){
        this.listaServicios.add(b);
        System.out.println("Servicio agregado.");
    }
    
    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}