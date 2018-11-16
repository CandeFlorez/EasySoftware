/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author Frank
 */
public class Cliente {

    // cuando las variables son privadas y se accede a ellas por un get o set -> eso se llama inyeccion de dependencia
    private String ID;// = UUID.randomUUID() + "";
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private ArrayList<Producto> ListaEnDeuda;
    private double DineroDeuda;

    //constructor

    public Cliente(String ID, String nombre, String apellido, String telefono, String direccion) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    
    public Cliente(String nombre, String apellido, String telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;

    }

    public Cliente() {
    }

    public String getID() {

        return ID;

    }

    public void setID(String ID) {

        this.ID = ID;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
