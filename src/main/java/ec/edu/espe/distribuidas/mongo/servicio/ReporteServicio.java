/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.servicio;

import ec.edu.espe.distribuidas.mongo.modelo.Factura;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mongodb.morphia.aggregation.Accumulator;
import org.mongodb.morphia.aggregation.Group;

/**
 *
 * @author PabloA
 */
public class ReporteServicio {
    public List<AgregacionProducto> mostarReporteProductos()
    {
        PersistenceManager persistenceManager = new PersistenceManager();
        List<AgregacionProducto>productosSumarizados = new ArrayList<AgregacionProducto>();

        Iterator<AgregacionProducto> aggregate = persistenceManager.context().createAggregation(Factura.class).
                unwind("detalles").
                group("detalles.producto.nombre", Group.grouping("total", new Accumulator("$sum", "detalles.subtotal"))).aggregate(AgregacionProducto.class);
        while (aggregate.hasNext()) {
            productosSumarizados.add(aggregate.next());

        } 
        return productosSumarizados;
    }
    public List<AgregacionClientes> mostarReporteClientes()
    {
        PersistenceManager persistenceManager = new PersistenceManager();
        List<AgregacionClientes> clientesSumarizados = new ArrayList<AgregacionClientes>();

        Iterator<AgregacionClientes> aggregate = persistenceManager.context().
                createAggregation(Factura.class).unwind("detalles").
                group("cliente", Group.grouping("total", new Accumulator("$sum", "detalles.subtotal"))).aggregate(AgregacionClientes.class);
        while (aggregate.hasNext()) {
            clientesSumarizados.add(aggregate.next());

        } 
        return clientesSumarizados;
    }
    public List<AgregacionVentas> mostarReporteVentas()
    {
        PersistenceManager persistenceManager = new PersistenceManager();
        List<AgregacionVentas> ventasSumarizados = new ArrayList<AgregacionVentas>();
   
        Iterator<AgregacionVentas> aggregate = persistenceManager.context().
                createAggregation(Factura.class).unwind("detalles").
                group("fecha", Group.grouping("total", new Accumulator("$sum", "detalles.subtotal"))).aggregate(AgregacionVentas.class);
        while (aggregate.hasNext()) {
            ventasSumarizados.add(aggregate.next());

        }
        return ventasSumarizados;
    }
}
