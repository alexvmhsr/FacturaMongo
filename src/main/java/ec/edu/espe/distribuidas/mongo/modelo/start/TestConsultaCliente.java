/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo.start;

import ec.edu.espe.distribuidas.mongo.servicio.FacturaServicio;

/**
 *
 * @author carlo
 */
public class TestConsultaCliente {
    
    public static void main(String args[])
    {
        FacturaServicio factura=new FacturaServicio();
        System.out.println(factura.clientePorCedula("1724218951"));
    }
    
}
