package com.mycompany.ici3241prograavanzada;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {   
    public void metodMenu(int opt){
        Scanner input = new Scanner(System.in);
        boolean exiting = false;
        while(!exiting){
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Para finalizar el programa. \n");
            try {
                System.out.println("Elige una opción");
                opt = input.nextInt();
                switch(opt){
                    case 0:
                        System.out.println("\n");
                        break;
                    case 1:
                        System.out.println("Agregar el nombre del servicio: \n"); //agregar servicio
                        String servicio = input.nextLine();
                        System.out.println("agregar precio del servicio: ");                       
                        int precioServicio = input.nextInt();
                        break;
                    case 2:
                        System.out.println("Opcion 2 seleccionada");
                        break;
                    case 3:
                        System.out.println("Opcion 3 seleccionada");
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
