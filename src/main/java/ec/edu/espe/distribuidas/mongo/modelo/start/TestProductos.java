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

//		productos.setNombre("Mermelada");
//		productos.setDetalle("Mora 200g");
//                productos.setValor_Unitario(2.25f);
//                productos.setCantidad(1);
//                productos.setValor_Total(2.25f);
		
		
		persistence.context().save(productos);
		
		
	} 
}
