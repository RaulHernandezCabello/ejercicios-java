/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    public Persona(){
        nombre="";
        apellidos="";
        edad=0;
    }
    
    public Persona (String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos =apellidos;
        this.edad=edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellidos;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellidos (String apellidos){
        this.apellidos=apellidos;
    }
    
    public void setEdad (int edad){
        this.edad = edad;
    }
}
