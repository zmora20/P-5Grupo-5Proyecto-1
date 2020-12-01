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
public  class  Animal {
    private LocalDate fechaIngreso;
    public String nombre;
    public String raza;
    public Sexo sexo;
    public int edad;
    private int codigo;
    public double peso;
    public String observaciones;
    
    
    public double calcularGasto(){
        double gasto=0;
        return gasto;
    }
    
    public int GetCodigo(){
        return codigo;
    }
    
    public LocalDate GetFechaIngreso(){
        return fechaIngreso;
    }
    
    public Animal(LocalDate fecha, String nombre,String raza,Sexo sexo,
            int edad,int codigo,
            double peso,String obser){
        this.fechaIngreso=fecha;
        this.nombre=nombre;
        this.raza=raza;
        this.sexo=sexo;
        this.edad=edad;
        this.codigo=codigo;
        this.peso=peso;
        this.observaciones=obser;
        
    } 
    
    
}
