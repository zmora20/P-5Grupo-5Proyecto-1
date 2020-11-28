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
    private int telefono;
    private String nombre;
    public LocalDate fechaInicio;
    private double sueldo;
    public String usuario;
    protected String contraseña;
    
    
    public String GetCorreoElectronico(){
        return correoElectronico;
    }
    public String GetDireccion(){
        return direccion;
    }
    public int GetTelefono(){
        return telefono;
    }
    public String GetNombre(){
        return nombre;
    }
    public double GetSueldo(){
        return sueldo;
    }
    
    
    
    
}
