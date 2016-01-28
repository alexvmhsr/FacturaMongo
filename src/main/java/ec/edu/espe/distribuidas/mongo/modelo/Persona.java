/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo;

import ec.edu.espe.distribuidas.mongo.persistence.BaseEntity;
import java.util.Date;
import org.mongodb.morphia.annotations.Embedded;

/**
 *
 * @author PabloA
 */
@Embedded
public class Persona extends BaseEntity {
    private String Nombre;
    private String Cedula;
    private Date FechadeNacimiento;

    public Persona() {
        super();
    }

    public Persona(String Nombre, String Cedula, Date FechadeNacimiento) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.FechadeNacimiento = FechadeNacimiento;
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public Date getFechadeNacimiento() {
        return FechadeNacimiento;
    }

    public void setFechadeNacimiento(Date FechadeNacimiento) {
        this.FechadeNacimiento = FechadeNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Cedula=" + Cedula + ", FechadeNacimiento=" + FechadeNacimiento + '}';
    }
    
    
}
