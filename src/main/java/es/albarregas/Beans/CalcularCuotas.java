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
public class CalcularCuotas implements Serializable{
    
    private String tipo;
    private int habitaciones;
    private String fecha;
    private String material;
    private double valor;
    private double total;
    private double prima;
    private String cubrir;
    private int asegurar;
    private String franquicia;
    private double contenido;
    private String opcion;
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        if("Piso".equals(tipo))
        {
        this.tipo="0.95";
        }
        if("Casa".equals(tipo))
        {
        this.tipo="1.00";
        }
        if("Adosado".equals(tipo))
        {
        this.tipo="1.05";
        }
        if("Duplex".equals(tipo))
        {
        this.tipo="1.10";
        }
        if("Chalet".equals(tipo))
        {
        this.tipo="1.20";
        }
    }

    /**
     * @return the habitaciones
     */
    public int getHabitaciones() {
        return habitaciones;
    }

    /**
     * @param habitaciones the habitaciones to set
     */
    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        if("1949".equals(fecha))
        {
        this.fecha = "0.09";
        }
        if("1950".equals(fecha))
        {
        this.fecha = "0.06";
        }
        if("1991".equals(fecha))
        {
        this.fecha = "0.04";
        }
        if("2006".equals(fecha))
        {
        this.fecha = "0.02";
        }
        if("2016".equals(fecha))
        {
        this.fecha = "0.01";
        }
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        if("Madera".equals(material))
        {
        this.material = "0.1";
        }
        if("Hormigon".equals(material))
        {
        this.material = "0.5";
        }
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the prima
     */
    public double getPrima() {
        prima = (valor*0.005) * Double.parseDouble(tipo);
        prima += (prima/100)*habitaciones;
        prima += prima * Double.parseDouble(fecha);
        prima += prima * Double.parseDouble(material);

        return prima;
    }

    /**
     * @param prima the prima to set
     */
    public void setPrima(double prima) {
        this.prima = prima;
    }

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
            this.cubrir = "1.25";
        }
        if(cubrir==null)
        {
            this.cubrir = "1";
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
        if("ninguna".equals(franquicia))
        {
        this.franquicia = "0";
        }
        if("500".equals(franquicia))
        {
        this.franquicia = "0.1";
        }
        if("1000".equals(franquicia))
        {
        this.franquicia = "0.2";
        }
    }

    /**
     * @return the contenido
     */
    public double getContenido() {
        contenido = asegurar * 0.008;
        contenido = contenido * Double.parseDouble(cubrir);
        contenido -= contenido * Double.parseDouble(franquicia);
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(double contenido) {
        this.contenido = contenido;
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
