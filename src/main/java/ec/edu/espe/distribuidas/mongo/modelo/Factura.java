/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo;

import ec.edu.espe.distribuidas.mongo.persistence.BaseEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author PabloA
 */
/**
 *
 * @author carlo
 */
public class Factura 
{
    private Cliente cliente;
    private Date fecha;
    private Float total;
    
    
    
    private List<DetalleProducto> detalles;

    public Factura(Date fecha, Float total) {
        this.fecha = fecha;
        this.total = total;
        this.detalles=new ArrayList<DetalleProducto>();
    }

    public Factura() 
    {
        this.total=0f;
        this.detalles=new ArrayList<DetalleProducto>();
    }
    
    
    public void agregarDetalle(DetalleProducto detalle)
    {
        detalles.add(detalle);
        this.total+=detalle.getSubtotal();
        System.out.println(total); 
   }
    
    public Float obtenerIva()
    {
        return total*0.12f;
    }
    
    public Float obtenerTotal()
    {
        return total*1.12f;
    }
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public List<DetalleProducto> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleProducto> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Factura{" + "fecha=" + fecha + ", total=" + total + ", detalles=" + detalles + '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
}
