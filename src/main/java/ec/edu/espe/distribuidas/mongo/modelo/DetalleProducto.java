/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo;

import org.mongodb.morphia.annotations.Embedded;

/**
 *
 * @author carlo
 */
@Embedded
public class DetalleProducto 
{
    private Producto producto;
    private Integer cantidad;
    private Float subtotal;

    public DetalleProducto(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = cantidad*producto.getPrecio();
    }

    public DetalleProducto() {
    }
    

    public Producto getProducto() {
        return producto;
    }
    

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "DetalleProducto{" + "producto=" + producto + ", cantidad=" + cantidad + ", subtotal=" + subtotal + '}';
    }
    
     
    
}
