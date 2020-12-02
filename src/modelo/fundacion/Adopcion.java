/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fundacion;
import java.time.LocalDate;
import modelo.animal.*;
import java.util.ArrayList;



/**
 *
 * @author zaida
 */
public class Adopcion implements Comparable<Adopcion> {
    private LocalDate fecha;
    private int codigoAdopcion;                     
    public Animal animal;
    public ArrayList<Adopcion>animalesAdoptados;
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
    
    public Adopcion(LocalDate fech,Animal anim, int codigoAdopcion){
        this.fecha=fech;
        this.animal=anim;
        this.codigoAdopcion=codigoAdopcion;
    }

    @Override
    public int compareTo(Adopcion o) {
        return fecha.compareTo(o.GetFecha());
        
    }
    
}

