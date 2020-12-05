/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.animal;

import java.time.LocalDate;

/**
 *
 * @author leonvargas
 */
public class Gato extends Animal{
 
    
    @Override
    public double calcularGasto(){
        double gasto=0;
        if (edad<8 && edad>1){
            gasto=3*2.5;
        }else if(edad>=8){
            gasto=5*2.5;
            
        }
        return gasto;
    }
    
    public Gato(LocalDate fecha, String nombre,String raza,Sexo sexo,
            int edad,double peso,String obser){
        super(fecha,nombre,raza,sexo,edad,peso,obser);        
    }
    public String toString(){
        return "Fecha de ingreso: "+this.GetFechaIngreso()+" "+"Nombre: "+nombre+" "+
                "raza: "+raza+" "+"Sexoanimal:"+sexo+" "+"Edad del animal: "+
                edad+" "+"Peso:"+peso+" "+"Observaciones:"+observaciones;
    }
            
   
 
            
    
   
}
