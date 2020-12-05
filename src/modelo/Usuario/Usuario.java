/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Usuario;

import java.time.LocalDate;
/**
 *
 * @author zaida
 */
public class Usuario {

    private String correoElectronico;
    private String direccion;
    private String telefono;
    private String nombre;
    public LocalDate fechaInicio;
    private double sueldo;
    public String usuario;
    private String contraseña;
    
    
    public String GetCorreoElectronico(){
        return correoElectronico;
    }
    public String GetDireccion(){
        return direccion;
    }
    public String GetTelefono(){
        return telefono;
    }
    public String GetNombre(){
        return nombre;
    }
    public double GetSueldo(){
        return sueldo;
    }
    
    public void SetNombre(String nombre){
        this.nombre=nombre;
    }
    public String Getcontraseña(){
        return contraseña;
    }
    public Usuario(String nombre,String direccion,String telefono, String correo,
         LocalDate fechainicio,double sueldo,String usuario,String contraseña){
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correoElectronico=correo;
        this.fechaInicio=fechainicio;
        this.sueldo=sueldo;
        this.usuario=usuario;
        this.contraseña=contraseña;
    }
    public String toString(){
        return "Nombre : "+nombre +" "+"Direccion: "+direccion+" "+
                "Telefono: "+telefono+"Correo Electronico:"+
                correoElectronico+" "+"Fecha de Inicio: "+
                fechaInicio+" "+"Sueldo :"+
                sueldo;
    }
    
    
}
