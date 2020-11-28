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
public class ConsultasRegistros {
    public ArrayList <Usuario> empleados;
    public ArrayList<Veterinaria> veterinarias;
    public ArrayList<GastosVeterinarias> gastosdeVeterinarias;
    
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
        for (Usuario u : empleados ){
            System.out.println(u);
        }
            
        
    }
    public boolean reagistrarGastoVeterinaria (GastosVeterinarias gv){
        if (!gastosdeVeterinarias.contains(gv)){
            gastosdeVeterinarias.add(gv);
            return true;
        }
        return false;    
    }
       
    
}
