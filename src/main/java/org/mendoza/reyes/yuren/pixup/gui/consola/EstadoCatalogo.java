package org.mendoza.reyes.yuren.pixup.gui.consola;

import org.mendoza.reyes.yuren.pixup.model.Estado;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.Estadojdbc;
import org.mendoza.reyes.yuren.pixup.repository.jdbc.impl.Estadojdbcimpl;
import org.mendoza.reyes.yuren.pixup.util.ReadUtil;

import java.util.List;

public class EstadoCatalogo extends Catalogos<Estado>
{
    private static EstadoCatalogo estadoCatalogo;
    private static Estadojdbc estadojdbc;

    private EstadoCatalogo( )
    {
        super();
    }

    public static EstadoCatalogo getInstance( )
    {
        if(estadoCatalogo==null)
        {
            estadoCatalogo = new EstadoCatalogo();
        }
        return estadoCatalogo;
    }

    @Override
    public Estado newT()
    {
        return new Estado( );
    }

    @Override
    public boolean processNewT(Estado estado)
    {
        System.out.println("Teclee un estado" );
        estado.setNombre( ReadUtil.read( ) );
        return true;
    }

    @Override
    public void processEditT(Estado estado)
    {
        System.out.println("Id del Estado " + estado.getId( ) );
        System.out.println("Estado a editar: " + estado.getNombre( ) );
        System.out.println("Teclee el valor nuevo del estado" );
        estado.setNombre( ReadUtil.read( ) );
    }

    @Override
    public List<Estado> processList( )
    {
        if( estadojdbc == null )
        {
            if( !loadEstadojdbc( ) )
            {
                System.out.println("Error al cargar el estadojdbc");
                return null;
            }
        }
        return estadojdbc.findAll( );
    }

    private boolean loadEstadojdbc()
    {
        estadojdbc = Estadojdbcimpl.getInstance( );
        return estadojdbc != null;
    }

}
