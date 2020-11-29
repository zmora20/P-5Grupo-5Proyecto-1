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
public class Perro extends Animal {
    public Size size;
    
    
    @Override
    public double calcularGasto(){
        
        double kilo=0;       
        if(size!=null){
            switch(size){
                case GRANDE:
                    kilo =40;
                    break;
                case MEDIANO:
                     kilo =30;
                     break;
                case PEQUENIO:
                    kilo =20;
                    break;
                default:
                    return -1;                       
            }
            return kilo+1;
        }
        return -1;
        
    }
    
}
