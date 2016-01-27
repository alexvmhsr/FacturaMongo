/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo.start;

import ec.edu.espe.distribuidas.mongo.modelo.Producto;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;

/**
 *
 * @author PabloA
 */
public class TestProductos {
    
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto productos = new Producto();
		PersistenceManager persistence = new PersistenceManager();

		productos.setNombre("Cereal");
		productos.setDetalle("Zucaritas de 300g");
                productos.setValor_Unitario(0.25);
                productos.setCantidad(5);
                productos.setValor_Total(1.25);
		
		
		persistence.context().save(productos);
		
		
	} 
}
