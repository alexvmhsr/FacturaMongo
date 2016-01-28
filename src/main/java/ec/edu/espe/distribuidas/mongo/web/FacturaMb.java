/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.web;

import ec.edu.espe.distribuidas.mongo.modelo.Cliente;
import ec.edu.espe.distribuidas.mongo.modelo.DetalleProducto;
import ec.edu.espe.distribuidas.mongo.modelo.Factura;
import ec.edu.espe.distribuidas.mongo.modelo.Producto;
import ec.edu.espe.distribuidas.mongo.servicio.FacturaServicio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author carlo
 */
@ManagedBean
@ViewScoped
public class FacturaMb implements Serializable {

    private Cliente cliente;
    private Producto producto;
    private Integer cantidadProducto;
    private Float iva;
    private Float total;
    private String cedula;
    private String codigoProducto;

    private Factura factura;

    private FacturaServicio servicios;

    public FacturaMb() {
        this.servicios = new FacturaServicio();
        this.cliente = new Cliente();
        this.producto = new Producto();
        factura = new Factura();
    }

    public void buscarCliente() {
        FacesContext context = FacesContext.getCurrentInstance();
        System.out.println("buscando cliente ...");
        cliente = servicios.clientePorCedula(cedula);
        //System.out.println(cliente);
        if (cliente != null) {
            context.addMessage(null, new FacesMessage("OK", "El usuario se encontro"));
        } else {
            context.addMessage(null, new FacesMessage("ERROR", "El usuario no existe"));
            cliente=new Cliente();
        }
    }

    public void buscarProducto() {
        FacesContext context = FacesContext.getCurrentInstance();
        System.out.println("buscando producto ...");
        producto = servicios.productoPorCodigo(codigoProducto);
        if (producto != null) {
            context.addMessage(null, new FacesMessage("OK", "El producto se encontro"));
            
        } else {
            context.addMessage(null, new FacesMessage("ERROR", "El producto no existe"));
            producto=new Producto();
        }
    }

    public void agregarDetalle() {
        System.out.println("Agregando producto...");
        DetalleProducto detalle = new DetalleProducto(producto, cantidadProducto);
        factura.agregarDetalle(detalle);
        total = factura.obtenerTotal();
        iva = factura.obtenerIva();
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Item Agregado"));

    }

    public void facturar() {
        factura.setFecha(new Date());
        factura.setCliente(cliente);
        servicios.grabarFactura(factura);
        System.out.println("grabanado ....");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Factura Guardada"));
    }
    
    public void cancelar()
    {
        factura=new Factura();
        cliente=new Cliente();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    
}
