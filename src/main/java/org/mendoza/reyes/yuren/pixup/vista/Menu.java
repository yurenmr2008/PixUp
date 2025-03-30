package org.mendoza.reyes.yuren.pixup.vista;

public class Menu {
    public static void principal(){
        System.out.println( "WELCOME");
        System.out.println( "Selecciona una opción");
        System.out.println( "1.- Consola");
        System.out.println( "2.- Ventana");
        System.out.println( "3.- Salir");
    }
    public static void principal2(){
        System.out.println("Seleccione una opción");
        System.out.println("1.- Catalogo");
        System.out.println("2.- Pendiente ");
        System.out.println("3.- Salir");
    }

    public static void menuCatalogo(){
        System.out.println("Seleccione la opcion deseada");
        System.out.println("1.- Estado");
        System.out.println("2.- Municipio");
        System.out.println("3.- Colonia");
        System.out.println("4.- Salir");
    }

    public static void menu(){
        System.out.println("Selecciones la opcion deseada:");
        System.out.println("1.- Altas");
        System.out.println("2.- Bajas");
        System.out.println("3.- Cambios");
        System.out.println("4.- Consultas");
        System.out.println("5.- Salir");
    }


    public static void opcionInvalida(){
        System.out.println("Opcion invalida");
    }

    public static void  menuEstado(){
        System.out.println("Ingresa un estado");
    }
    public static void menuMunicipio(){
        System.out.println("Ingrese un municipio");
    }
    public static void menuColonia(){
        System.out.println("Ingrese una colonia");
    }




}
