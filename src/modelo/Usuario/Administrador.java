
package modelo.Usuario;
import modelo.fundacion.Veterinaria;
import modelo.fundacion.GastosVeterinaria;
import modelo.fundacion.ConsultasRegistrosAdmin;
import java.time.LocalDate;


/**
 *
 * @author zaida
 */
public class Administrador extends Usuario {
    private int numeroCuenta;
    public ConsultasRegistrosAdmin sc;

 public Administrador(String nombre,String direccion,int telefono, String correo,
          LocalDate fechainicio,double sueldo,String usuario,String contraseña,
          int cuenta){
     super(nombre,direccion,telefono,correo,fechainicio,sueldo,usuario,
                contraseña);
     this.numeroCuenta=cuenta;
     
 }
 //public String toString(){
     //return 
 //}
 
        

}

