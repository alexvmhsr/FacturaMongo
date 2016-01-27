/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo.start;

import ec.edu.espe.distribuidas.mongo.modelo.Persona;
import ec.edu.espe.distribuidas.mongo.modelo.Producto;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;
import java.util.List;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author PabloA
 */
public class TestLIstaProducto {
    public static void main(String[] args) {
//        PersistenceManager persistenceManager = new PersistenceManager();
//        Query<Producto> qproducto = persistenceManager.context().find(Producto.class);
//        List<Producto> producto =  qproducto.asList();
//        
//        for (int i = 0; i < producto.size(); i++) {
//            System.out.println(producto.get(i)+"\n");
//            
//        }
        
        PersistenceManager persistenceManager = new PersistenceManager();
        Query<Persona> q = persistenceManager.context().createQuery(Persona.class).
                filter("Cedula", "1721712741");
        Persona persona = (Persona) q.get();
        
        
         System.out.println(persona+"\n");
    }
}
