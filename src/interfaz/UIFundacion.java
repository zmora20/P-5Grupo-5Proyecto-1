
package interfaz;
import java.util.Scanner;
import modelo.Usuario.*;
import modelo.animal.*;
import modelo.fundacion.*;
import java.time.LocalDate;

public class UIFundacion {
    public Scanner sc;
    public ConsultasRegistrosAdmin listas;

  public UIFundacion(){
  listas=new ConsultasRegistrosAdmin();
  }
    
    
    public Usuario Validacion(String usuario, String contrasenia){
        for (Usuario Objusuario :listas.empleados){
         if (Objusuario.usuario.equals(usuario) &&
                 Objusuario.Getcontraseña().equals(contrasenia)){
                
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
