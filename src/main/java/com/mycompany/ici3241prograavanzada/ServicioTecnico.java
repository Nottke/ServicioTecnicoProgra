package com.mycompany.ici3241prograavanzada;

//@author sebas

import java.util.HashMap;
import java.util.Map;


public class ServicioTecnico {
    public static void main(String[] args) {
        System.out.println("|||||| Bienvenido al Servicio Tecnico ||||||");
        System.out.println("Seleccione alguna opción porfavor ... :");
        Menu m = new Menu ();
        m.metodMenu(0);
        OdT ordenTrabajo0 = new OdT(0,123456789,"ordenTesting0","04-04-2020");// #orden,rut,servicio,fecha
        OdT ordenTrabajo1 = new OdT(1,234567890,"ordenTesting1","04-04-2020");
        OdT ordenTrabajo2 = new OdT(2,154567891,"ordenTesting2","04-04-2020");
        OdT ordenTrabajo3 = new OdT(3,184567892,"ordenTesting3","04-04-2020");
        OdT ordenTrabajo4 = new OdT(4,141231234,"ordenTesting4","05-04-2020");
        OdT ordenTrabajo5 = new OdT(5,132441234,"ordenTesting5","05-04-2020");
        OdT ordenTrabajo6 = new OdT(6,167238234,"ordenTesting6","05-04-2020");
        OdT ordenTrabajo7 = new OdT(7,203172385,"ordenTesting7","05-04-2020");
        
        Calendario fecha1 = new Calendario ("04-04-2020",4,4,4,false);//fecha,mes,dia,cargatrabajo,disponibilidad
        Calendario fecha2 = new Calendario ("05-04-2020",5,4,4,false);
        fecha1.agregarOrden(ordenTrabajo0);
        fecha1.agregarOrden(ordenTrabajo1);
        fecha1.agregarOrden(ordenTrabajo2);
        fecha1.agregarOrden(ordenTrabajo3); //agregamos cuatro ordenes (el maximo por dia) a la fecha "04-04-2020"
        fecha2.agregarOrden(ordenTrabajo4);
        fecha2.agregarOrden(ordenTrabajo5);
        fecha2.agregarOrden(ordenTrabajo6);
        fecha2.agregarOrden(ordenTrabajo7);
        
        fecha1.mostrarOrdenCompleta();
        fecha2.mostrarOrdenCompleta();
        fecha1.obtenerOrden(0);
        fecha2.obtenerOrden(3);
        //Producto producto = new Producto("Lentium95","Procesador",10,30000); //producto,tipo,stock,precio
        //Servicio servicio = new Servicio("TesteoProyecto",100); //servicio,precio
        //ordenTrabajo.mostrarServicio(); //invoca un metodo para mostrar servicio
        //ordenTrabajo.mostrarNumOrden();
        
        Map<Integer,OdT> mapOrden = new HashMap();
        mapOrden.put(1, ordenTrabajo1);
        mapOrden.put(2, ordenTrabajo2);
        mapOrden.put(3, ordenTrabajo3);
        mapOrden.put(4, ordenTrabajo4);     
        
        System.out.println("\n");
        System.out.println(mapOrden.get(1).getServicio());
        System.out.println("\nHe compilado sin problemas, finalización del programa normal");
    }    
}
