package com.mycompany.ici3241prograavanzada;

import java.util.ArrayList;

public class OdT {
    private int numOrden;
    private int rutCliente;
    private String servicio;
    private String fecha;
    private int precio;
    public ArrayList<Servicio> listaServicios;
    

    public OdT(int numOrden, int rutCliente, String servicio, String fecha, int precio) {
        this.numOrden = numOrden;
        this.rutCliente = rutCliente;
        this.servicio = servicio;
        this.fecha = fecha;
        this.precio = precio;
        this.listaServicios = new ArrayList<>();
        
    }
    
    public OdT(String servicio, String fecha){
        this.servicio = servicio;
        this.fecha = fecha;
    }
    public OdT(String servicio, int precio){
        this.servicio = servicio;
        this.precio = precio;
        
    }
    public OdT(String servicio){
        this.servicio = servicio;
    }
   
    
    public void agregarServicios(Servicio b){      
        this.listaServicios.add(b);
        System.out.println("Servicios agregados.");
    }
    public void agregarServicio(Servicio b){ // agregar un servicio (
        this.listaServicios.add(b);
        System.out.println("Servicio agregado.");
    }
    public void buscarServicio(String servicio){
        this.listaServicios.forEach(
        (b) -> {
            if (b.getServicio().equals(servicio)){
                b.mostrarServicio();
                return;
            }else
            {
                System.out.println("pase por aqui");
            }              
        });
    }

    public void mostrarServicios(){
        for(int i = 0; i<this.listaServicios.size();i++){
            this.listaServicios.get(i).mostrarServicio();
        }
    }
    
    public void mostrarOrden(){ //método para mostrar orden guardada
        System.out.println("El cliente "+this.rutCliente+" tiene el número de órden "+this.numOrden+" con el servicio "+this.servicio);
    }
    /*public void mostrarOrden(){ //método para mostrar orden guardada
        System.out.println("El cliente "+this.rutCliente+" tiene la órden "+this.numOrden+" con el servicio "+this.servicio+" a la fecha: "+this.fecha);
    }*/
    
    /*public void mostrarOrden(){
        for(int i=0;i<this.listaOrdenes.size();i++){
            System.out.println("El número de órden es: ");
            this.listaOrdenes.get(i).mostrarOrden();
        }
    }*/
    
    /*public void mostrarOrden(String rut){ //método sobrecarga para mostrar numero de orden de un cliente
        int rutI = Integer.parseInt(rut);
        this.rutCliente = rutI;
        System.out.println("El cliente "+this.rutCliente+" tiene la órden: "+this.numOrden);
    }*/

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
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
