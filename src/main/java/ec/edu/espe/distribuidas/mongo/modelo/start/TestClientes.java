/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo.start;

import ec.edu.espe.distribuidas.mongo.modelo.Cliente;
import ec.edu.espe.distribuidas.mongo.modelo.Producto;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;

/**
 *
 * @author carlo
 */
public class TestClientes {

    public static void main(String args[]) {
//        Cliente cliente = new Cliente();
//        PersistenceManager persistence = new PersistenceManager();
//
//        cliente.setCedula("1724218951");
//        cliente.setGenero("M");
//        cliente.setNombre("Carlos");
//        cliente.setTelefono("26123213");
//        persistence.context().save(cliente);
        
        Cliente cliente = new Cliente();
        PersistenceManager persistence = new PersistenceManager();

        cliente.setCedula("1721712741");
        cliente.setGenero("M");
        cliente.setNombre("Pablo");
        cliente.setTelefono("0987654412");
        persistence.context().save(cliente);
        
        
    }
}
