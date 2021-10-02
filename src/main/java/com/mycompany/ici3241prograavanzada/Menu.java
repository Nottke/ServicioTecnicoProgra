package com.mycompany.ici3241prograavanzada;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {   
    public void metodMenu(int opt){
        Scanner input = new Scanner(System.in);
        Servicio serviciosLimpieza = new Servicio("Servicio de prueba",10000);

        /*rutina = new Servicio("Limpieza interna", 5000);
        serviciosLimpieza.agregarServicio(rutina);
        rutina = new Servicio("Limpieza disco", 5000);
        serviciosLimpieza.agregarServicio(rutina);
        rutina = new Servicio("Desfragmentacion disco", 2000);
        serviciosLimpieza.agregarServicio(rutina);*/
        /*OdT servicioFormateo = new OdT("Servicio de formateo");
        rutina = new Servicio("Formateo rapido",2000);
        servicioFormateo.agregarServicio(rutina);
        rutina = new Servicio("Formateo completo",5000);
        servicioFormateo.agregarServicio(rutina);
        rutina = new Servicio("Restablecimiento completo con conservacion de archivos",10000);
        servicioFormateo.agregarServicio(rutina);*/                                                
        /* Servicio rutinaLimpieza = new Servicio ("Limpieza",10000);
        rutinaLimpieza = new Servicio("Limpieza Interna",1000);*/
        //creacion servicios
        
        boolean exiting = false;
        while(!exiting){
            System.out.println("1. Agregar servicio ");
            System.out.println("2. Buscar servicio");
            System.out.println("3. Mostrar servicios");
            System.out.println("4. Para finalizar el programa. \n");
            try {
                System.out.println("Elige una opción");
                opt = input.nextInt();
                switch(opt){
                    case 1: //agregar servicio
                        System.out.println("Agregar el nombre del servicio: \n"); //agregar servicio
                        String servicio = input.nextLine();
                        System.out.println("agregar precio del servicio: ");                       
                        int precioServicio = input.nextInt();
                        serviciosLimpieza.agregarServicios(new Servicio(servicio,precioServicio));
                        break;
                    case 2:
                        System.out.println("Agregar nombre del servicio a buscar : \n");
                        servicio = input.nextLine();
                        serviciosLimpieza.buscarServicio(servicio);                        
                        break;
                    case 3:
                        System.out.println("Aquí se muestran los servicios guardados : \n");
                        serviciosLimpieza.mostrarServicios();
                        break;
                    case 4:
                        System.out.println("Finaliza el programa");
                        return;
                    default:
                        System.out.println("Solo numeros entre 1 y 4");
                    }
                }
            catch (InputMismatchException e){
                System.out.println("Debes insertar un numero ");
                input.next();              
            }
        }
    }
}
