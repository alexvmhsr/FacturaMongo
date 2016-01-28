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

        productos.setNombre("Mermelada");
        productos.setCodigo("001");
        productos.setPrecio(2f);

        persistence.context().save(productos);
        
        
//        Producto producto1 = new Producto();
//        producto1.setCodigo("002");
//        producto1.setNombre("Zapatos de Cuero");        
//        producto1.setPrecio(82.2f);
//
//        PersistenceManager persistence1 = new PersistenceManager();
//        persistence1.context().save(producto1);
//
//        Producto producto2 = new Producto();
//        producto2.setCodigo("003");
//        producto2.setNombre("Zapatos bailarina");
//      
//        producto2.setPrecio(52.2f);
//
//        PersistenceManager persistence2 = new PersistenceManager();
//        persistence2.context().save(producto2);
//        Producto producto3 = new Producto();
//        producto3.setCodigo("004");
//        producto3.setNombre("Blusa Rosel");
//       
//        producto3.setPrecio(22.2f);
//
//        PersistenceManager persistence3 = new PersistenceManager();
//        persistence3.context().save(producto3);
//
//        Producto producto4 = new Producto();
//        producto4.setCodigo("005");
//        producto4.setNombre("Saco de Lana");      
//        producto4.setPrecio(45.9f);
//
//        PersistenceManager persistence4 = new PersistenceManager();
//        persistence4.context().save(producto4);
//
//        Producto producto5 = new Producto();
//        producto5.setCodigo("006");
//        producto5.setNombre("Pantalón de Tela");
//        producto5.setPrecio(92.0f);
//
//        PersistenceManager persistence5 = new PersistenceManager();
//        persistence5.context().save(producto5);
//
//        Producto producto6 = new Producto();
//        producto6.setCodigo("007");
//        producto6.setNombre("Medias Nylon");
//        producto6.setPrecio(2.20f);
//
//        PersistenceManager persistence6 = new PersistenceManager();
//        persistence6.context().save(producto6);
//
//        Producto producto7 = new Producto();
//        producto7.setCodigo("008");
//        producto7.setNombre("Falda larga");
//        producto7.setPrecio(30.0f);
//
//        PersistenceManager persistence7 = new PersistenceManager();
//        persistence7.context().save(producto7);
//
//        Producto producto8 = new Producto();
//        producto8.setCodigo("009");
//        producto8.setNombre("Zaptillas");
//        producto8.setPrecio(132.2f);
//
//        PersistenceManager persistence8 = new PersistenceManager();
//        persistence8.context().save(producto8);
//
//        Producto producto9 = new Producto();
//        producto9.setCodigo("010");
//        producto9.setNombre("Camisa de Seda");
//        producto9.setPrecio(92.2f);
//
//        PersistenceManager persistence9 = new PersistenceManager();
//        persistence9.context().save(producto9);
//
//        Producto producto10 = new Producto();
//        producto10.setCodigo("011");
//        producto10.setNombre("Jeans");
//        producto10.setPrecio(12.2f);
//
//        PersistenceManager persistence10 = new PersistenceManager();
//        persistence10.context().save(producto10);
//
//        Producto producto11 = new Producto();
//        producto11.setCodigo("012");
//        producto11.setNombre("Cartera de cuero");
//        producto11.setPrecio(23.2f);
//
//        PersistenceManager persistence11 = new PersistenceManager();
//        persistence11.context().save(producto11);
//
//        Producto producto12 = new Producto();
//        producto12.setCodigo("013");
//        producto12.setNombre("Bolso de tela");
//        producto12.setPrecio(92.0f);
//
//        PersistenceManager persistence12 = new PersistenceManager();
//        persistence12.context().save(producto12);
//
//        Producto producto13 = new Producto();
//        producto13.setCodigo("014");
//        producto13.setNombre("Mochila escolar");
//        producto13.setPrecio(90.0f);
//
//        PersistenceManager persistence13 = new PersistenceManager();
//        persistence13.context().save(producto13);
//
//        Producto producto14 = new Producto();
//        producto14.setCodigo("015");
//        producto14.setNombre("Aretes");
//        producto14.setPrecio(1.90f);
//
//        PersistenceManager persistence14 = new PersistenceManager();
//        persistence14.context().save(producto14);
//
//        Producto producto15 = new Producto();
//        producto15.setCodigo("016");
//        producto15.setNombre("Jean Negro");
//        producto15.setPrecio(72.5f);
//
//        PersistenceManager persistence15 = new PersistenceManager();
//        persistence15.context().save(producto15);
//
//        Producto producto16 = new Producto();
//        producto16.setCodigo("017");
//        producto16.setNombre("Patanlón de Tela");
//        producto16.setPrecio(21.21f);
//
//        PersistenceManager persistence16 = new PersistenceManager();
//        persistence16.context().save(producto16);
//
//        Producto producto17 = new Producto();
//        producto17.setCodigo("018");
//        producto17.setNombre("Camisa de algodón");
//        producto17.setPrecio(29.2f);
//
//        PersistenceManager persistence17 = new PersistenceManager();
//        persistence17.context().save(producto17);
//
//        Producto producto18 = new Producto();
//        producto18.setCodigo("019");
//        producto18.setNombre("Reloj");
//        producto18.setPrecio(95.2f);
//
//        PersistenceManager persistence18 = new PersistenceManager();
//        persistence18.context().save(producto18);
//
//        Producto producto19 = new Producto();
//        producto19.setCodigo("020");
//        producto19.setNombre("Saco de Algodón");
//        producto19.setPrecio(78.2f);
//
//        PersistenceManager persistence19 = new PersistenceManager();
//        persistence19.context().save(producto19);
//
//        Producto producto20 = new Producto();
//        producto20.setCodigo("021");
//        producto20.setNombre("Aretes largos");
//        producto20.setPrecio(2.29f);
//
//        PersistenceManager persistence20 = new PersistenceManager();
//        persistence20.context().save(producto20);

    }
}
