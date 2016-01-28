/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.beans;


import ec.edu.espe.distribuidas.mongo.servicio.AgregacionClientes;
import ec.edu.espe.distribuidas.mongo.servicio.AgregacionProducto;
import ec.edu.espe.distribuidas.mongo.servicio.AgregacionVentas;
import ec.edu.espe.distribuidas.mongo.modelo.Factura;
import ec.edu.espe.distribuidas.mongo.modelo.Producto;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;
import ec.edu.espe.distribuidas.mongo.servicio.ReporteServicio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.mongodb.morphia.aggregation.Accumulator;
import org.mongodb.morphia.aggregation.Group;

/**
 *
 * @author PabloA
 */
@ViewScoped
@ManagedBean
public class ReportesBean implements Serializable {

    /**
     * Creates a new instance of ReportesBean
     */

    
    private ReporteServicio reporteServicio=new ReporteServicio();
    private List<AgregacionProducto> productosSumarizados;
    private List<AgregacionVentas> ventasSumarizados;
    private List<AgregacionClientes> clientesSumarizados;

    private Producto productoSeleccionado;

   
 
    @PostConstruct
    public void reportesBean()
    {        
        this.ventasSumarizados = reporteServicio.mostarReporteVentas();
        this.clientesSumarizados = reporteServicio.mostarReporteClientes();
        this.productosSumarizados = reporteServicio.mostarReporteProductos();
    }
    
    
    public void mostarReporteProductos()
    {
       this.productosSumarizados = reporteServicio.mostarReporteProductos(); 
        System.out.println(productosSumarizados);
    }
    public void mostarReporteClientes()
    {
       this.clientesSumarizados = reporteServicio.mostarReporteClientes();
       System.out.println(clientesSumarizados);
    }
    public void mostarReporteVentas()
    {
        this.ventasSumarizados = reporteServicio.mostarReporteVentas();
        System.out.println(ventasSumarizados);
    }

    public List<AgregacionProducto> getProductosSumarizados() {
        return productosSumarizados;
    }

    public void setProductosSumarizados(List<AgregacionProducto> productosSumarizados) {
        this.productosSumarizados = productosSumarizados;
    }

    public Producto getProductoSeleccionado() {
        return productoSeleccionado;
    }

    public void setProductoSeleccionado(Producto productoSeleccionado) {
        this.productoSeleccionado = productoSeleccionado;
    }

    public List<AgregacionVentas> getVentasSumarizados() {
        return ventasSumarizados;
    }

    public void setVentasSumarizados(List<AgregacionVentas> ventasSumarizados) {
        this.ventasSumarizados = ventasSumarizados;
    }

    public List<AgregacionClientes> getClientesSumarizados() {
        return clientesSumarizados;
    }

    public void setClientesSumarizados(List<AgregacionClientes> clientesSumarizados) {
        this.clientesSumarizados = clientesSumarizados;
    }
   
}
