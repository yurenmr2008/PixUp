package org.gerdoc.pixup.vista;

import org.gerdoc.pixup.model.*;
import org.gerdoc.pixup.util.ReadUtil;

public class Consola2 implements Ejecutable{
    private static Consola2 consola2;

    public  static Consola2 getInstance(){
        if(consola2 ==  null){
            consola2 = new Consola2();
        }
        return consola2;
    }


    @Override
    public void run(){

        boolean flag =true;
        boolean flag2 = true;
        int option;
        Opciones opciones = new Opciones();
        while (flag){
            Menu.menuCatalogo();
            option = ReadUtil.getInstance().leerInt();
            switch (option){
                case 1:
                    while (flag2){
                        Menu.menu();
                        option = ReadUtil.getInstance().leerInt();
                        switch (option) {
                            case 1:
                                opciones.altaEstado();
                                break;
                            case 2:
                                opciones.bajaEstado();
                                break;
                            case 3:
                                opciones.cambiosEstado();
                                break;
                            case 4:
                                opciones.consultaEstado();
                                break;
                            case 5:
                                flag2 = false;
                                break;
                            default:
                                Menu.opcionInvalida();
                        }
                    }
                    break;
                case 2:
                    while (flag2){
                        Municipio municipio = new Municipio();
                        Menu.menu();
                        option = ReadUtil.getInstance().leerInt();
                        switch (option){
                            case 1:
                                opciones.altaMunicipio();
                                break;
                            case 2:
                                opciones.bajaMunicipio();
                                break;
                            case 3:
                                opciones.cambiosMunicipio();
                                break;
                            case 4:
                                opciones.consultaMunicipio();
                                break;
                            case 5:
                                flag2 = false;
                                break;
                            default:
                                Menu.opcionInvalida();
                        }
                    }
                    break;
                case 3:
                    while (flag2){
                        Colonia colonia = new Colonia();
                        Menu.menu();
                        option = ReadUtil.getInstance().leerInt();
                        switch (option) {
                            case 1:
                                opciones.altaColonia();
                                break;
                            case 2:
                                opciones.bajaColonia();
                                break;
                            case 3:
                                opciones.cambiosColonia();
                                break;
                            case 4:
                                opciones.consultaColonia();
                                break;
                            case 5:
                                flag2 = false;
                                break;
                            default:
                                Menu.opcionInvalida();
                        }
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }


        }
    }

}
