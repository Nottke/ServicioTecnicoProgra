package com.mycompany.ici3241prograavanzada;

import java.util.ArrayList;

public class Calendario {
    private String fecha; 
    private int dia; // 1-31 DE RESERVA 
    private int mes; // 1-12
    private int cargaTrabajo; // 1-4 (máximo cuatro trabajos reservados por día)
    private boolean reserva = true; //si esta disponible 
    private ArrayList<OdT> listaOrdenes;

    public Calendario(String fecha, int dia, int mes, int cargaTrabajo, boolean reserva) {
        this.fecha = fecha;
        this.dia = dia;
        this.mes = mes;
        this.cargaTrabajo = cargaTrabajo;
        this.reserva = reserva;
        this.listaOrdenes = new ArrayList<>();
    }

    public void mostrarCalendario(){ //método para mostrar disponibilidad de reserva
        System.out.println("La fecha correspondiente a: "+this.fecha);
        if (this.cargaTrabajo == 4){
            reserva = false;
            System.out.println("está al máximo de órdenes de trabajo");
        }else{
            System.out.println("puede reservar otra órden de trabajo");
        }
    }
    
    public void mostrarCalendario(String fecha){ //método (sobrecarga) para mostrar la carga de trabajo de una fecha específica
        this.fecha = fecha;
        System.out.println("La fecha correspondiente a: "+this.fecha);
        if (this.cargaTrabajo == 0){
            System.out.println("aún no se ha realizado ninguna reserva en esa fecha");
        }
        else{
            System.out.println("tiene una carga de :"+this.cargaTrabajo);
        }
    }
    
    public void agregarOrden(OdT obj){ //agregar objeto orden (int-numeroOrden,int-rutCliente,string-nombreServicio,string-fecha)
        this.listaOrdenes.add(obj);
    }
    public void obtenerOrden(int index){ //en proceso de construccion
        for(int i = 0; i<this.listaOrdenes.size();i++){
            if(index == i){
                System.out.println("La orden "+index+" a la fecha: "+this.fecha+" contiene los siguientes datos: ");
                this.listaOrdenes.get(i).mostrarOrden();
            }
        }
    }
    
    public void mostrarOrdenCompleta(){
        System.out.println("Las ordenes almacenadas son las siguientes :");
        for(int i=0;i<this.listaOrdenes.size();i++){
            this.listaOrdenes.get(i).mostrarOrden();
        }
        System.out.println("\n");
    }
    public void mostrarOrden(){
        for(int i=0;i<this.listaOrdenes.size();i++){
            System.out.println("El número de órden es: ");
            this.listaOrdenes.get(i).mostrarOrden();
        }
    }
    
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getCargaTrabajo() {
        return cargaTrabajo;
    }

    public void setCargaTrabajo(int cargaTrabajo) {
        this.cargaTrabajo = cargaTrabajo;
    }

    public boolean isReserva() {
        return reserva;
    }

    public void setReserva(boolean reserva) {
        this.reserva = reserva;
    }
    
     
}
