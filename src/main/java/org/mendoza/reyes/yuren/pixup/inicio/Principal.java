package org.mendoza.reyes.yuren.pixup.inicio;

import org.mendoza.reyes.yuren.pixup.util.ReadUtil;
import org.mendoza.reyes.yuren.pixup.vista.*;
import org.mendoza.reyes.yuren.pixup.vista.Consola1;
import org.mendoza.reyes.yuren.pixup.vista.Ejecutable;
import org.mendoza.reyes.yuren.pixup.vista.Menu;
import org.mendoza.reyes.yuren.pixup.vista.Ventana;

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
