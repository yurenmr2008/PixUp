package org.mendoza.reyes.yuren.pixup.gui;

import org.mendoza.reyes.yuren.pixup.gui.consola.Consola;
import org.mendoza.reyes.yuren.pixup.gui.ventana.Ventana;
import org.mendoza.reyes.yuren.pixup.negocio.Ejecutable;

public class ConsolaVentana  extends LecturaAccion
{
    public static ConsolaVentana consolaVentana;

    private ConsolaVentana()
    {
    }

    public static ConsolaVentana getInstance( )
    {
        if(consolaVentana==null)
        {
            consolaVentana = new ConsolaVentana();
        }
        return consolaVentana;
    }

    @Override
    public void despliegaMenu()
    {
        System.out.println("Seleccione una opcion:");
        System.out.println("1.-Consola");
        System.out.println("2.-Ventana");
        System.out.println("3.-Salir");
    }
    @Override
    public int valorMinMenu()
    {
        return 1;
    }

    @Override
    public int valorMaxMenu()
    {
        return 3;
    }

    @Override
    public void procesaOpcion()
    {
        Ejecutable ejecutable = null;
        if(opcion==1)
        {
            ejecutable = Consola.getInstance( );
        }
        if(opcion==2)
        {
            ejecutable = Ventana.getInstance( );
        }
        ejecutable.setFlag( true );
        ejecutable.run( );
    }
}
