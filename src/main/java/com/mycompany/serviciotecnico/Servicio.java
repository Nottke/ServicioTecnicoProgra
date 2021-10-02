package com.mycompany.serviciotecnico;

import java.util.ArrayList;

public class Servicio {
    private String nombre;                               //atributos
    private String precio;
    public ArrayList<Producto> listaProductos;
    
    
    public Servicio(String nombre, String precio) {      //constructor
        this.nombre = nombre;
        this.precio = precio;
        this.listaProductos = new ArrayList<>();
    }
    
    public void mostrarServicio(){
        System.out.println("El servicio "+this.nombre+" tiene un costo de $ "+this.precio+".");
    }
    public void agregarProducto(Producto p){             //agregar
        this.listaProductos.add(p);
        System.out.println("Producto agregado.");
    }
    public void mostrarProductos(){
        for(int i = 0; i<this.listaProductos.size();i++){
            this.listaProductos.get(i).mostrarProducto();
        }
    }
    public void mostrarProductos(String nombre){           
        for(int i = 0; i<this.listaProductos.size();i++){
            if (this.listaProductos.get(i).getNombre().equals(nombre)){
                this.listaProductos.get(i).mostrarProducto();
            }
        }
    }
    
    public void buscarProducto(String nombre){
        this.listaProductos.forEach(
        (b) -> {
            if (b.getNombre().equals(nombre)){
                b.mostrarProducto();
            /*}else
            {
                System.out.println("pase por aqui");¨*/
            }              
        });
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

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    

}

