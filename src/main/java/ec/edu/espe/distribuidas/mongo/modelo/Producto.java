/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo;

import java.math.BigDecimal;
import org.mongodb.morphia.annotations.Embedded;

/**
 *
 * @author PabloA
 */
@Embedded
public class Producto {
    private String nombre;
    private String detalle;
    private Integer cantidad;
    private Double valor_Unitario;
    private Double valor_Total;
    
      public Producto() {
        super();
    }

    public Producto(String nombre, String detalle, Integer cantidad, Double valor_Unitario, Double valor_Total) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.valor_Unitario = valor_Unitario;
        this.valor_Total = valor_Total;
    }
      
      

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Double getValor_Unitario() {
        return valor_Unitario;
    }

    public void setValor_Unitario(Double valor_Unitario) {
        this.valor_Unitario = valor_Unitario;
    }

    public Double getValor_Total() {
        return valor_Total;
    }

    public void setValor_Total(Double valor_Total) {
        this.valor_Total = valor_Total;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", detalle=" + detalle + ", cantidad=" + cantidad + ", valor_Unitario=" + valor_Unitario + ", valor_Total=" + valor_Total + '}';
    }

   
  
    
}
