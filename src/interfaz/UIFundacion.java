
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
                
                return Objusuario;                                   
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
