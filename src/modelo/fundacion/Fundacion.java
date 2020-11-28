/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fundacion;
import java.util.ArrayList;
import modelo.Usuario.Usuario;
/**
 *
 * @author Fabricio
 */
public class Fundacion {
    public ArrayList <Usuario> empleados;
    
    
    public void agregarEmpleado(Usuario usu){
        for (int i= 0;i<empleados.size();i++){
            String s=usu.usuario;
            Usuario sus=empleados.get(i);           
            if (s==sus.usuario){
                empleados.add(usu);
            }else{
                System.out.println("el usuario ya existe ");
            }
             
        }
      
    }    
        
}
