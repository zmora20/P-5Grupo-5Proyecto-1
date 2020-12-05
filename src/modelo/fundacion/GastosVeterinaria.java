/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fundacion;
import modelo.animal.Animal;
import java.time.LocalDate;
/**
 *
 * @author zaida
 */
public class GastosVeterinaria {
    public LocalDate fechaAtencion;
    private double monto;
    public Animal animal;
    
    public double GetMonto(){
        return monto;
    }
    
    public GastosVeterinaria(LocalDate fecha,double monto,Animal animal){
        fechaAtencion=fecha;
        monto=monto;
        animal=animal;
        
    }
    public String toString(){
        return "Fecha de atencion : "+fechaAtencion +" "+"Monto: "+monto+" "+
                "Animal: "+animal.toString();
    }
    
    
}
