
package interfaz;
import java.util.Scanner;
import modelo.Usuario.*;
import modelo.animal.*;
import modelo.fundacion.*;

public class UIFundacion {
    public Scanner sc;
    public modelo.fundacion.ConsultasRegistrosAdmin listas;

    public Usuario Validacion(String usuario, String contrasenia){


        for (Usuario Objusuario :listas.empleados){
            if (Objusuario.usuario==usuario && Objusuario.Getcontraseña()==contrasenia){
                System.out.println("credenciales validas");
                return Objusuario;
                   
                   
            }else {
                System.out.println("las credenciales son invalidas");
            }
        }
    return null;  
     }
    
    public boolean ValidacionUsuario(Usuario usuario){
        if (usuario instanceof Empleado){
            return true;
        }
    return false;    
    }
    

                           
        
    
   
    
    
           
      
      
    
}
