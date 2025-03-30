package org.gerdoc.pixup.inicio;

import org.gerdoc.pixup.util.ReadUtil;
import org.gerdoc.pixup.vista.*;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        boolean flag = true;
        Integer option;

        Ejecutable ejecutable = null;

        while (flag)
        {
            Menu.principal();
            ejecutable = null;
            option = ReadUtil.getInstance().leerInt();
            switch (option){
                case 1:
                    ejecutable = Consola1.getInstance();
                    break;
                case 2:
                    ejecutable = Ventana.getInstance();
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();

            }
            if (ejecutable != null)
            {
                ejecutable.run();
            }




        }

    }
}
