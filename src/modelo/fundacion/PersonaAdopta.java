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
    private int telefono;
    private String correoElectro;
    public String preferencia;
    public ArrayList<PersonaAdopta> personas;
    
    public void SetNombrePersona(String nombrePersona){
        this.nombrePersona=nombrePersona;
    }
    
    public String GetIdentificacion(){
        return identificacion;
    }
    
    public void SetIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }
}
