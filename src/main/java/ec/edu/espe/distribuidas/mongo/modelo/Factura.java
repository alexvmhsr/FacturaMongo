/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo;

import ec.edu.espe.distribuidas.mongo.persistence.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author PabloA
 */

@Entity(value = "factura")
public class Factura extends BaseEntity {
    private Date fecha;
    private BigDecimal valorTotal;
    
    @Embedded
    private List<Producto> productos;
    
    @Reference
    private Persona persona;

    public Factura(Date fecha, BigDecimal valorTotal, List<Producto> productos, Persona persona) {
        this.fecha = fecha;
        this.valorTotal = valorTotal;
        this.productos = productos;
        this.persona = persona;
    }

    public Factura() {
        super();
    }

    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Factura{" + "fecha=" + fecha + ", valorTotal=" + valorTotal + ", productos=" + productos + ", persona=" + persona + '}';
    }
            
}
