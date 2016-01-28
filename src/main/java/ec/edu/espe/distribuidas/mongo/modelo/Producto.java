/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo;

import ec.edu.espe.distribuidas.mongo.persistence.BaseEntity;
import java.math.BigDecimal;
import org.mongodb.morphia.annotations.Embedded;

/**
 *
 * @author PabloA
 */
@Embedded
public class Producto extends BaseEntity
{
    private String codigo;
    private String nombre;
    private Float precio;

    public Producto(String codigo, String nombre, Float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    
}
