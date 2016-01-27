/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo.start;

import ec.edu.espe.distribuidas.mongo.modelo.Factura;
import ec.edu.espe.distribuidas.mongo.modelo.Persona;
import ec.edu.espe.distribuidas.mongo.persistence.PersistenceManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author PabloA
 */
public class Test {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona = new Persona();
		PersistenceManager persistence = new PersistenceManager();

		persona.setCedula("151999874");
		persona.setNombre("Monica Morales");
		Date fecha;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try
		{
		fecha = sdf.parse("1969-09-27");
		persona.setFechadeNacimiento(fecha);
		
		}
		catch(Exception e)
		{
		}
		
		persistence.context().save(persona);
		
		
	} 
    
}
