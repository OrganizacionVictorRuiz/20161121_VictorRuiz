/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.Beans;

import java.io.Serializable;

public class EleccionBean implements Serializable{
    
    private String seleccion;

    /**
     * @return the seleccion
     */
    public String getSeleccion() {
        return seleccion;
    }

    /**
     * @param seleccion the seleccion to set
     */
    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }
    
    
    
}
