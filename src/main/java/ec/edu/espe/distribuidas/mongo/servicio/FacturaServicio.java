/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.servicio;

import ec.edu.espe.distribuidas.mongo.modelo.Cliente;
import ec.edu.espe.distribuidas.mongo.modelo.Factura;
import ec.edu.espe.distribuidas.mongo.modelo.Persona;
import ec.edu.espe.distribuidas.mongo.modelo.Producto;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.mongodb.morphia.query.Query;


/**
 *
 * @author PabloA
 */
public class FacturaServicio {

    public void ingresarFactura(String cedula, List<Producto> producto, Date fecha) {
        PersistenceManager persistenceManager = new PersistenceManager();
        
        Query<Persona> q = persistenceManager.context().createQuery(Persona.class).
                filter("Cedula", cedula);
        Persona persona = (Persona) q.get();
        
        Factura factura = new Factura();
        
		
		factura.setFecha(fecha);
		
	
        producto = new ArrayList<Producto>();
        Integer sumatoria;
        Float total = 0f;
//        for (int i = 0; i < producto.size(); i++) {
//            total = total+(producto.get(i).getCantidad()* producto.get(i).getValor_Unitario());
//            
//        }
//        factura.setValorTotal(new BigDecimal(total));
//        factura.setProductos(producto);
//        factura.setPersona(persona);
        
        persistenceManager.context().save(factura);        
    }
    
    public Cliente buscarCliente(String cedula){
        PersistenceManager persistenceManager = new PersistenceManager();
        Query<Cliente> q = persistenceManager.context().createQuery(Cliente.class).
                filter("cedula",cedula);
        Cliente cliente = q.get();
        return cliente;
    }
    
    public List<Producto> verProductos(){
        PersistenceManager persistenceManager = new PersistenceManager();
        Query<Producto> qproducto = persistenceManager.context().find(Producto.class);
        List<Producto> producto =  qproducto.asList();
        
        return producto;
    }
    
    public Cliente clientePorCedula(String cedula)
    {
        Cliente cliente=buscarCliente(cedula);
        if(cliente!=null)
        {
            return cliente;
        }
        else
        {
            return null;
        }
    }
    
    public Producto productoPorCodigo(String codigo)
    {
        List<Producto> lista=verProductos();
        for (Producto producto : lista) {
            if(producto.getCodigo().equals(codigo))
            {
                return producto;
            }
        }
        return null;
    }
    
    public void grabarFactura(Factura factura)
    {
        PersistenceManager persistence=new PersistenceManager();
        persistence.context().save(factura);
    }   
}
