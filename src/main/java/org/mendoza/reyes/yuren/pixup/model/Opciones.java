package org.mendoza.reyes.yuren.pixup.model;

import org.mendoza.reyes.yuren.pixup.util.ReadUtil;

import java.util.ArrayList;

public class Opciones {


    ArrayList<Estado> listaEstados = new ArrayList<>();
    ArrayList<Municipio> listaMunicipios = new ArrayList<>();
    ArrayList<Colonia> listaColonia = new ArrayList<>();
    Integer idColonia;
    String confirmacion;
    boolean coincidencia = false;


    public void altaEstado() {
        Estado nuevoEstado = new Estado();
        System.out.println("Ingrese un estado");
        nuevoEstado.setNombre(ReadUtil.getInstance().leer());
        System.out.println("Ingrese el id de estado");
        nuevoEstado.setIde(ReadUtil.getInstance().leerInt());

        listaEstados.add(nuevoEstado);
    }

    public void bajaEstado() {
        System.out.println("Ingrese el id del estado que desea dar de baja");
        idColonia = ReadUtil.getInstance().leerInt();
        System.out.println("Estas seguro? (si/no)");
        confirmacion = ReadUtil.getInstance().leer();
        if (confirmacion.equals("si")) {
            for (int i = 0; i < listaEstados.size(); i++) {
                if (idColonia == listaEstados.get(i).getIde()) {
                    listaEstados.remove(i);
                    coincidencia = true;
                    System.out.println("Estado borrado con exito");
                }
            }
            if (coincidencia == false) {
                System.out.println("Estado no encontrado");
            }
        }
    }

    public void cambiosEstado() {
        Estado estado = new Estado();
        System.out.println("Ingrese el id del estado que desea cambiar:");
        idColonia = ReadUtil.getInstance().leerInt();
        for (int i = 0; i < listaEstados.size(); i++) {
            if (idColonia == listaEstados.get(i).getIde()) {
                Estado nuevoEstado = new Estado();
                nuevoEstado.setIde(listaEstados.get(i).getIde());
                System.out.println("Ingresa el nuevo estado:");
                nuevoEstado.setNombre(ReadUtil.getInstance().leer());
                listaEstados.set(i,nuevoEstado);
                coincidencia = true;
                System.out.println("Datos cambiado con exito");
            }
        }
        if (coincidencia == false) {
            System.out.println("Estado no encontrado");
        }
    }

    public void consultaEstado() {

        System.out.println("Estados guardados");
        for (int i = 0; i < listaEstados.size(); i++) {
            System.out.println(i+1+".-" + " Nombre:"+listaEstados.get(i).getNombre()+" - id:"+ listaEstados.get(i).getIde());
        }
    }



    public void altaMunicipio() {
        Municipio nuevoMunicipio = new Municipio();
        System.out.println("Ingrese un municipio");
        nuevoMunicipio.setNombre(ReadUtil.getInstance().leer());
        System.out.println("Ingrese el id de municipio");
        nuevoMunicipio.setIde(ReadUtil.getInstance().leerInt());

        listaMunicipios.add(nuevoMunicipio);
    }

    public void bajaMunicipio() {
        System.out.println("Ingrese el id del municipio que desea dar de baja");
        idColonia = ReadUtil.getInstance().leerInt();
        System.out.println("Estas seguro? (si/no)");
        confirmacion = ReadUtil.getInstance().leer();
        if (confirmacion.equals("si")) {
            for (int i = 0; i < listaMunicipios.size(); i++) {
                if (idColonia == listaMunicipios.get(i).getIde()) {
                    listaMunicipios.remove(i);
                    coincidencia = true;
                    System.out.println("Municipio borrado con exito");
                }
            }
            if (coincidencia == false) {
                System.out.println("Municipio no encontrado");
            }
        }
    }

    public void cambiosMunicipio() {

        System.out.println("Ingrese el id del municipio que desea cambiar:");
        idColonia = ReadUtil.getInstance().leerInt();
        for (int i = 0; i < listaMunicipios.size(); i++) {
            if (idColonia == listaMunicipios.get(i).getIde()) {
                Municipio nuevoMunicipio = new Municipio();
                nuevoMunicipio.setIde(listaMunicipios.get(i).getIde());
                System.out.println("Ingresa el nuevo municipio:");
                nuevoMunicipio.setNombre(ReadUtil.getInstance().leer());
                listaMunicipios.set(i,nuevoMunicipio);
                coincidencia = true;
                System.out.println("Datos cambiado con exito");
            }
        }
        if (coincidencia == false) {
            System.out.println("Municipio no encontrado");
        }
    }

    public void consultaMunicipio() {

        System.out.println("Municipios guardados");
        for (int i = 0; i < listaMunicipios.size(); i++) {
            System.out.println(i+1+".-" + " Nombre:"+listaMunicipios.get(i).getNombre()+" - id:"+ listaMunicipios.get(i).getIde());
        }
    }





    public void altaColonia() {
        Colonia nuevoColonia = new Colonia();
        System.out.println("Ingrese un colonia");
        nuevoColonia.setNombre(ReadUtil.getInstance().leer());
        System.out.println("Ingrese el id de colonia");
        nuevoColonia.setId(ReadUtil.getInstance().leerInt());
        System.out.println("Ingrese el codigo postal");
        nuevoColonia.setCp(ReadUtil.getInstance().leerInt());
        listaColonia.add(nuevoColonia);
    }

    public void bajaColonia() {
        System.out.println("Ingrese el id de la colonia que desea dar de baja");
        idColonia = ReadUtil.getInstance().leerInt();
        System.out.println("Estas seguro? (si/no)");
        confirmacion = ReadUtil.getInstance().leer();
        if (confirmacion.equals("si")) {
            for (int i = 0; i < listaColonia.size(); i++) {
                if (idColonia == listaColonia.get(i).getId()) {
                    listaColonia.remove(i);
                    coincidencia = true;
                    System.out.println("Colonia borrada con exito");
                }
            }
            if (coincidencia == false) {
                System.out.println("Colonia no encontrada");
            }
        }
    }

    public void cambiosColonia() {
        Colonia nuevoColonia = new Colonia();
        System.out.println("Ingrese el id de la colonia que desea cambiar:");
        idColonia = ReadUtil.getInstance().leerInt();
        for (int i = 0; i < listaColonia.size(); i++) {
            if (idColonia == listaColonia.get(i).getId()) {
                Estado nuevoEstado = new Estado();
                nuevoColonia.setId(listaColonia.get(i).getId());
                System.out.println("Ingresa la nueva colonia:");
                nuevoColonia.setNombre(ReadUtil.getInstance().leer());
                System.out.println("Ingresa el numero postal");
                nuevoColonia.setCp(ReadUtil.getInstance().leerInt());
                listaColonia.set(i,nuevoColonia);
                coincidencia = true;
                System.out.println("Datos cambiado con exito");
            }
        }
        if (coincidencia == false) {
            System.out.println("Colonia no encontrada");
        }
    }

    public void consultaColonia() {

        System.out.println("Colonias guardadas");
        for (int i = 0; i < listaColonia.size(); i++) {
            System.out.println(i+1+".-" + " Nombre:"+listaColonia.get(i).getNombre() + " - id:" + listaColonia.get(i).getId()+ " - cp: " + listaColonia.get(i).getCp());
        }

    }
}
