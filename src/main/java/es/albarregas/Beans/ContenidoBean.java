/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.Beans;

import java.io.Serializable;

/**
 *
 * @author Zack
 */
public class ContenidoBean implements Serializable{

    private String cubrir;
    private int asegurar;
    private String franquicia;
    private String opcion;

    /**
     * @return the cubrir
     */
    public String getCubrir() {
        return cubrir;
    }

    /**
     * @param cubrir the cubrir to set
     */
    public void setCubrir(String cubrir) {
        if(cubrir!=null)
        {
        this.cubrir = "Si";
        }
        else
        {
        this.cubrir = "No";
        }
    }

    /**
     * @return the asegurar
     */
    public int getAsegurar() {
        return asegurar;
    }

    /**
     * @param asegurar the asegurar to set
     */
    public void setAsegurar(int asegurar) {
        this.asegurar = asegurar;
    }

    /**
     * @return the franquicia
     */
    public String getFranquicia() {
        return franquicia;
    }

    /**
     * @param franquicia the franquicia to set
     */
    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    /**
     * @return the opcion
     */
    public String getOpcion() {
        return opcion;
    }

    /**
     * @param opcion the opcion to set
     */
    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
}
