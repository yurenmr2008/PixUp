package org.mendoza.reyes.yuren.pixup.vista;

import org.mendoza.reyes.yuren.pixup.util.ReadUtil;

public class Consola1 implements Ejecutable{
    private static  Consola1 consola1;

    public  static  Consola1 getInstance(){
        if(consola1 ==  null){
            consola1 = new Consola1();
        }
        return consola1;
    }


    @Override
    public void run(){

        boolean flag =true;
        int option;
        while (flag){
            Menu.principal2();
            option = ReadUtil.getInstance().leerInt();
            switch (option){
                case 1:
                    Consola2.getInstance().run();
                    break;
                case 2:
                    System.out.println("Todavia esta en desarrollo");
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
        }
    }
}
