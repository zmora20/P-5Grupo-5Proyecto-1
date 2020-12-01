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
public class Adopcion {
    private LocalDate fecha;
    private int codigoAdopcion;                     
    public Animal animal;
    public ArrayList<Adopcion>animalesAdoptados;
    
    public int GetCodigoAdopcion(){
        return codigoAdopcion;
    }
    
    public Adopcion(LocalDate fech,Animal anim, int codigoAdopcion){
        this.fecha=fech;
        this.animal=anim;
        this.codigoAdopcion=codigoAdopcion;
    }
    
}

