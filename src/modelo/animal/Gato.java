/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.animal;

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
    
    
    
}
