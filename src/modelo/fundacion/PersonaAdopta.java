/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fundacion;
import java.util.ArrayList; 

/**
 *
 * @author zaida
 */
public class PersonaAdopta {
    private String nombrePersona;
    private String identificacion;
    private String direccion;
    private String telefono;
    private String correoElectro;
    public String preferencia;
    public ArrayList<PersonaAdopta> personas;
    public int animalesAdoptados = 0;
    
    public void SetNombrePersona(String nombrePersona){
        this.nombrePersona=nombrePersona;
    }
     public String GetNombrePersona(){
        return nombrePersona;
    }
    public String GetIdentificacion(){
        return identificacion;
    }
    
    public String GetDireccion(){
        return direccion;
    }
    
    public void SetDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String GetTelefono(){
        return telefono;
    }
    
    public void SetTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public String GetCorreoElectro(){
        return correoElectro;
    }
    
    public void SetCorreoElectro(String correoElectro){
        this.correoElectro = correoElectro;
    }
    
    public String GetPreferencia(){
        return preferencia;
    }
    
    
    public void SetPreferencia(String preferencia){
        this.preferencia = preferencia;
    }
    
    public PersonaAdopta(String nombrePersona,String identificacion
            ,String direccion,String telefono,String correoElectro,
            String preferencia){
        this.nombrePersona=nombrePersona;
        this.identificacion=identificacion;
        this.direccion=direccion;
        this.telefono=telefono;
        this.correoElectro=correoElectro;
        preferencia=preferencia;
    }
}
