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
public class Animal {
    private LocalDate fechaIngreso;
    public String nombre;
    public String raza;
    public Sexo sexo;
    public int edad;
    private int codigo;
    public double peso;
    public String observaciones;
    
    
    public double calcularGasto(){
       int gasto =0;
       return gasto;
    }
    
    
    
}
