/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo.start;

import ec.edu.espe.distribuidas.mongo.modelo.Factura;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author PabloA
 */
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//		Persona persona = new Persona();
//		PersistenceManager persistence = new PersistenceManager();
//
//		persona.setCedula("151999874");
//		persona.setNombre("Monica Morales");
//		Date fecha;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		try
//		{
//		fecha = sdf.parse("1969-09-27");
//		persona.setFechadeNacimiento(fecha);
//		
//		}
//		catch(Exception e)
//		{
//		}
//		
//		persistence.context().save(persona);
        PersistenceManager persistenceManager = new PersistenceManager();
        Query<Factura> qfactura = persistenceManager.context().find(Factura.class);
        List<Factura> factura = qfactura.asList();
        List<String> reporte3 = new ArrayList<String>();
        Float total = 0f;
        Float total1 = 0f;
        for (int i = 0; i < factura.size(); i++) {
            for (int j = 1; j < factura.size(); j++) {
                if (factura.get(i).getFecha() == factura.get(j).getFecha()) {
                    total = total1 + factura.get(j).getTotal();
                    System.out.println("Total: "+total);
                }
    
                    total1 = factura.get(i).getTotal();
                    System.out.println("Total Else: "+total);
            }
            
        }
        
       // reporte3.add("Fecha: "+factura.getFecha().toString() +" Total: "+total.toString());
        
        for (int i = 0; i < reporte3.size(); i++) {
            System.out.println(reporte3.get(i));
            
        }
    }

}
