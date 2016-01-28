/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.mongo.modelo;

/**
 *
 * @author carlo
 */
public class Cliente 
{
    private String cedula;
    private String nombre;
    private String genero;
    private String telefono;

    public Cliente(String cedula, String nombre, String genero, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
        this.telefono = telefono;
    }

    public Cliente() {
    }
    
    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", genero=" + genero + ", telefono=" + telefono + '}';
    }
    
    
    
}
