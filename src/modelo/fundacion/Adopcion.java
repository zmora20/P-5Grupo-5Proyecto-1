/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fundacion;
import java.time.LocalDate;
import modelo.animal.*;
import java.util.ArrayList;
import modelo.fundacion.*;


/**
 *
 * @author zaida
 */
public class Adopcion implements Comparable<Adopcion> {
    private LocalDate fecha;
    private static int codigoAdopcion=50;                     
    public Animal animal;
    public PersonaAdopta persona;
    
    public LocalDate GetFecha(){
        return fecha;
    }
    
    public void SetFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    
    public int GetCodigoAdopcion(){
        return codigoAdopcion;
    }
    public void AumentarCodigoAdopcion(){
        codigoAdopcion++;
    }
    
    public Adopcion(LocalDate fech,Animal anim,PersonaAdopta persona){
        this.fecha=fech;
        animal=anim;
        persona=persona;
    }

    @Override
    public int compareTo(Adopcion o) {
        return fecha.compareTo(o.GetFecha());
        
    }
    /*public String toString(){
        return "Codigo Adopcion: "+codigoAdopcion+" "+"Fecha: "+fecha+" "+
                "Codigo Animal: "+animal.GetCodigo()+"Nombre animal:"+
                animal.nombre+" "+"Cedula adoptante: "+
                persona.GetIdentificacion()+" "+"Nombre adoptante:"+
                persona.GetNombrePersona();
    }*/
}

