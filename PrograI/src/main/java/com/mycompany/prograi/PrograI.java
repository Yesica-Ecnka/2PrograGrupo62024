
package com.mycompany.prograi;

import java.util.Scanner;

public class PrograI {

    public static void main(String[] args) {
        
        System.out.println("----    ----   ----   ----  ----   ----");
        System.out.println("        Bienvendidos            ");
        System.out.println("----    -----  ----  ----  ----  ----");
        System.out.println("        Menú Inicial");
        System.out.println("Por favor, elige una opción: ");
        System.out.println("Fase 1 -- Objetos y recursividad "); 
        System.out.println("Fase 2 -- ");
        System.out.println("Fase 3 -- "); System.out.println("Fase 4-- Salir");
        
        int opcion;
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();
      
        
        do {
        
        
        switch (opcion) {
            
            case 1 -> {
                System.out.println("--- --- --- ---");
                System.out.println(" Objetivos y recursividad");
                }
            case 2 -> {
                System.out.println("--- --- --- ---");
                System.out.println("Fase 2");
                }
            case 3 -> {
                System.out.println("--- --- --- ---");
                System.out.println("Fase 3");
                }
            case 4 -> {
                System.out.println("--- --- --- ---");
                System.out.println("Fase 4");
                System.out.println(" Nos vemos, amigo!");
                System.out.println(" .............");
                }
            default -> {
                System.out.println("--- --- --- ---");
                System.out.println("Opción inválida, por favor seleccione una opción válida");
                }
            }    
        
        
        }while (opcion == 4);
        
            
             //aca estoy declarondo la opcion de nuevo para poder dejar entrar datos.
             
                System.out.println(" SUB MENÚ DE FASE I");
                System.out.println(" 1. Ingresar datos de vehículos");
                System.out.println(" 2. Mostrar datos de vehículos");
                System.out.println(" 3. Crear una torre de Hanoio");
                System.out.println(" 4. Regresar al menú");
                System.out.println("  ---------------------");
                System.out.println(" Ingrese su opción ");
                
                int opc;
                Scanner teclado1 = new Scanner(System.in);
                opc = teclado1.nextInt();
                
            do {

                switch (opc){

                    case 1 -> { 
                        System.out.println("1.  Carro");
                        System.out.println("2.  Balsa");
                        System.out.println("3.  Avión");
                        System.out.println("--- --- --- --- ---");
                        System.out.println(" Qué deseas ingresar, amigo?");
                        
                        int eleccion;
                        Scanner teclado3 = new Scanner(System.in);
                        eleccion = teclado3.nextInt();
                        
                        if (eleccion == 1) {

                            System.out.println(" Ingresa el tipo de gasolina, por favor: ");
                            int gass;
                            Scanner teclado4 = new Scanner(System.in);
                            gass = teclado4.nextInt();
                            
                        } else {
                            System.out.println("Ingresa unos datos, por favor!");
                        }
                        if (eleccion == 2){
                            System.out.println(" Ingresa sí utiliza remo o motor, por favor: ");
                            int mot;
                            Scanner teclado5 = new Scanner(System.in);
                            mot = teclado5.nextInt();
                          
                        } else {
                            System.out.println("Ingresa unos datos, por favor!");
                        }
                        if (eleccion == 3){
                            System.out.println(" Ingresa la antidad de psajeros, por favor: ");
                            int cantPasajeros;
                            Scanner teclado6 = new Scanner(System.in);
                            cantPasajeros = teclado6.nextInt();
                            
                            
                        } else {
                            System.out.println("Ingresa unos datos, por favor!");
                        }
                }
                        
                    case 2 -> System.out.println("Usted ingreso datos a  estos son: ");
                        
                    default -> System.out.println("Nos vemos!");
                }      
                        
            }while (opc !=4);
        
        
        
    }
}
