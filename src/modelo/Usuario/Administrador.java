/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Usuario;
import Fundacion.*;


/**
 *
 * @author zaida
 */
public class Administrador extends Usuario {
    private int numeroCuenta;
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
    public boolean registrarVeterinaria(Veterinaria v){
        if (!veterinarias.contains(v)){
            veterinarias.add(v);
            return true;   
        }
        return false;
             
    }      
    
    public void consultarVeterinarias(){
        
    }
        

}

