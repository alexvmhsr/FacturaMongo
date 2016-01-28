/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo.start;

import ec.edu.espe.distribuidas.mongo.modelo.Factura;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;
import ec.edu.espe.distribuidas.mongo.servicio.AgregacionClientes;
import ec.edu.espe.distribuidas.mongo.servicio.AgregacionProducto;
import ec.edu.espe.distribuidas.mongo.servicio.AgregacionVentas;
import ec.edu.espe.distribuidas.mongo.servicio.FacturaServicio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mongodb.morphia.aggregation.Accumulator;
import org.mongodb.morphia.aggregation.Group;

/**
 *
 * @author carlo
 */
public class TestConsultaCliente {
    
    public static void main(String args[])
    {
//        FacturaServicio factura=new FacturaServicio();
//        System.out.println(factura.clientePorCedula("1724218951"));
        
//        PersistenceManager persistenceManager = new PersistenceManager();
//        List<AgregacionProducto>productosSumarizados = new ArrayList<AgregacionProducto>();
//
//        Iterator<AgregacionProducto> aggregate = persistenceManager.context().createAggregation(Factura.class).
//                unwind("detalles").
//                group("detalles.producto.nombre", Group.grouping("total", new Accumulator("$sum", "detalles.subtotal"))).aggregate(AgregacionProducto.class);
//        while (aggregate.hasNext()) {
//            productosSumarizados.add(aggregate.next());
//
//        } 
//        for (int i = 0; i < productosSumarizados.size(); i++) {
//            System.out.println(productosSumarizados.get(i));
//            
//        }
        
//     
        
        PersistenceManager persistenceManager = new PersistenceManager();
        List<AgregacionVentas> ventasSumarizados = new ArrayList<AgregacionVentas>();
   
        Iterator<AgregacionVentas> aggregate = persistenceManager.context().
                createAggregation(Factura.class).unwind("detalles").
                group("fecha", Group.grouping("total", new Accumulator("$sum", "detalles.subtotal"))).aggregate(AgregacionVentas.class);
        while (aggregate.hasNext()) {
            ventasSumarizados.add(aggregate.next());

        }
        
        for (int i = 0; i < ventasSumarizados.size(); i++) {
            System.out.println(ventasSumarizados.get(i));
            
        }
    }
    
}
