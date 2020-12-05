/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Usuario;
import modelo.fundacion.*;
import modelo.animal.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Collections;


/**
 *
 * @author zaida
 */
public class Empleado extends Usuario {
    public ArrayList<Animal> animales=ConsultasRegistrosAdmin.animal ;
    public ArrayList<PersonaAdopta> persona=ConsultasRegistrosAdmin.personas;
    public static ArrayList<Adopcion>animalesAdoptados;
    Scanner sc = new Scanner(System.in);

        
    
    
    
    public Empleado(String nombre,String direccion,int telefono, String correo,
          LocalDate fechainicio,double sueldo,String usuario,String contraseña){
        super(nombre,direccion,telefono,correo,fechainicio,sueldo,usuario,
                contraseña);
    }
    
    public void consultarAnimal(){
        System.out.println("Ingrese tipo de animal (Gato/Perro):");
        String tipoAnimal = sc.nextLine().toUpperCase();
        System.out.println("Ingrese sexo del animal (Macho/Hembra):");
        String sexoAnimal = sc.nextLine().toUpperCase();
        System.out.println("Ingrese edad del animal(0 si no quiere filtrar):");
        int edadAnimal ;
        edadAnimal= Integer.parseInt(sc.nextLine());
        //CONDICIONAL O FUNCION COMPARAR POR SEXO SOBRECARGA
        if (tipoAnimal!=""){
            if(tipoAnimal=="GATO" ){
                for (Animal ani: animales){
                    if (ani instanceof Perro){
                        System.out.println(ani);
                    }
                }    
            }else{
                for (Animal ani: animales){
                    if (ani instanceof Gato){
                        System.out.println(ani);
                    }          
                }
            }
            
        }else if (sexoAnimal!=""){
            if(tipoAnimal=="MACHO" ){
                for (Animal ani: animales){
                    if (ani.sexo.MACHO.name()=="MACHO"){
                        System.out.println(ani);
                    }
                }    
            }else{
                for (Animal ani: animales){
                    if (ani.sexo.HEMBRA.name()=="HEMBRA"){
                        System.out.println(ani);
                    }          
                }
            }
            
        }else if (edadAnimal!=0){
            if(edadAnimal>=0 && edadAnimal<5){
                for (Animal ani: animales){
                    if (ani.edad>=0 && ani.edad<5){
                        System.out.println(ani);
                    }
                }
            }else if (edadAnimal>=5 && edadAnimal<10){
                for (Animal ani: animales){
                    if (ani.edad>=5 && ani.edad<10){
                        System.out.println(ani);
                    }
                }
                
            }else{
                for (Animal ani: animales){
                    if (ani.edad>=10 && ani.edad<15){
                        System.out.println(ani);
                    }
                }
            }
            
        }else if (sexoAnimal!=""&& edadAnimal!=0){
            consultarAnimal(tipoAnimal, edadAnimal);
            
            
        }else if(tipoAnimal!="" && sexoAnimal!=""){
            consultarAnimal(tipoAnimal,sexoAnimal);
            
        }else{
    }
           
        
    }
    
    public void consultarAnimal(String tipoAnima,String sexo){
        if(tipoAnima=="GATO" ){
                for (Animal ani: animales ){
                    if (ani instanceof Gato && ani.sexo.MACHO.name()==sexo){
                        System.out.println(ani);
                    }
                }    
        }else if(tipoAnima=="GATO" && sexo=="Hembra"){
            for (Animal ani: animales){
                if (ani instanceof Perro && ani.sexo.name()==sexo){
                    System.out.println(ani);
                    }
                        
                }
        }else if(tipoAnima=="PERRO" && sexo=="MACHO"){
            for (Animal ani: animales ){
                    if (ani instanceof Perro && ani.sexo.MACHO.name()==sexo){
                        System.out.println(ani);
                    }
                }
        
        }else{
            for (Animal ani: animales ){
                    if (ani instanceof Perro && ani.sexo.MACHO.name()==sexo){
                        System.out.println(ani);
                    }
                }
            
        }
           
        
    }
    public void consultarAnimal(String tipoAnima,int edad){
        if(tipoAnima=="GATO"){
                for (Animal ani: animales ){
                    if (ani instanceof Gato ){
                        if(edad>=0 && edad<5){
                            if (ani.edad>=0 && ani.edad<5){
                            System.out.println(ani);
                            }
                        }
                        }else if (edad>=5 && edad<10){
                           
                            if (ani.edad>=5 && ani.edad<10){
                                System.out.println(ani);
                            }
                        }else{
                            
                            if (ani.edad>=10 && ani.edad<15){
                                System.out.println(ani);
                            }
                        }
                 
                }
        }else{
                for (Animal ani: animales ){
                    if (ani instanceof Perro ){
                        if(edad>=0 && edad<5){
                            if (ani.edad>=0 && ani.edad<5){
                            System.out.println(ani);
                            }
                        }
                        }else if (edad>=5 && edad<10){
                           
                            if (ani.edad>=5 && ani.edad<10){
                                System.out.println(ani);
                            }
                        }else{
                            
                            if (ani.edad>=10 && ani.edad<15){
                                System.out.println(ani);
                            }
                        }
                 
                }
        }  
        
    }
        
    
    public void consultaAdopcion(){
        
        Collections.sort(animalesAdoptados);
        //Collections.sort(ad.animalesAdoptados,Collections.reverseOrder());
        
        for (Adopcion adop:animalesAdoptados){
            System.out.println(adop);
        
        }
        System.out.println("Desea consultar una Adopcion"
                + " en especifico por codigo");
        int opcionA=0;
        opcionA = sc.nextInt();
        sc.nextLine();
        if (opcionA!=0){
            for (Adopcion adop1:animalesAdoptados){
                if (adop1.GetCodigoAdopcion()==opcionA){
                    System.out.println(adop1);
                    System.out.println(adop1.animal.toString());
                }        
            }
        }
        
            
        
        
    }
    
    public void consultaRegistro(String cedula){
        for (PersonaAdopta per: persona){
            if(per.GetIdentificacion().equals(cedula) && 
                    per.animalesAdoptados != 0 ){
                for(Adopcion aad:animalesAdoptados){
                    if(aad.persona.GetIdentificacion().equals(cedula)){
                        System.out.println(per);
                        System.out.println("Los animales que adopto son:");
                        System.out.println(aad.animal);
                    }
                    
                        
                }
            }else{
                System.out.println("No ha adoptado a ningun animal");
                System.out.println(per);
            }
        }
        System.out.println("¿Desea actualizar datos? (Si/No)");
        String respuesta = sc.nextLine();
        switch (respuesta){
            case "Si":
                System.out.println("Ingrese su nombre:");
                String nom = sc.nextLine();
                for (PersonaAdopta per: persona){
                    if (per.GetNombrePersona().equals(nom)){
                        System.out.println("Ingrese nueva direccion:");
                        String dir = sc.nextLine();
                        if (per.GetDireccion().equals(dir)){
                            System.out.println("La direccion es la misma");
                        }else{
                            per.SetDireccion(dir);
                            System.out.println("Se ha actualizado la "
                                    + "direccion");
                            
                        }
                        
                        System.out.println("Ingrese nuevo telefono:");
                        String tel = sc.nextLine();
                        if (per.GetTelefono().equals(tel)){
                            System.out.println("El telefono es el mismo");
                        }else{
                            per.SetTelefono(tel);
                            System.out.println("Se ha actualizado el telefono");
                        
                            
                        }
                        
                        System.out.println("Ingrese nuevo correo electronico:");
                        String corEl = sc.nextLine();
                        if (per.GetCorreoElectro().equals(corEl)){
                            System.out.println("El correo electronico es el "
                                    + "mismo");
                        }else{
                            per.SetDireccion(corEl);
                            System.out.println("Se ha actualizado el correo "
                                    + "electronico");
                        }
                        
                        
                        System.out.println("Ingrese nueva preferencia:");
                        String pref = sc.nextLine();
                        if (per.GetPreferencia().equals(pref)){
                            System.out.println("La preferencia es la misma");
                        }else{
                            per.SetPreferencia(pref);
                            System.out.println("Se ha actualizado la "
                                    + "preferencia ");
                        }
                        
                        
                        
                    }
                }
                
                
                break;
            case "No":
                System.out.println("Los datos no se han actualizado");
                break;
        }
        
        
    
    }
    
    public boolean registrarAnimal(Animal ani){
        if (!animales.contains(ani)){
            animales.add(ani);
            ani.aumentarCodigo();
            return true;
        }else {
            System.out.println("el animal ya esta registrado");
        }
        return false;
        
    }
    public boolean registrarPersona(PersonaAdopta per){
        
        if (persona.contains(per)){
            persona.add(per);
            return true;
        }
        return false;
    }
    
    public void registrarAdopcion(String cedula,int codigoAnimal){
        boolean condicion1 = true;
        boolean condicion2 = false;
        for (Adopcion ado: animalesAdoptados){
            if (ado.animal.GetCodigo()==codigoAnimal){
                condicion1=false;
                System.out.println("El animal ha sido adoptado");              
            }
        }
        for (PersonaAdopta pp:persona){
         if (pp.GetIdentificacion()==cedula){
             
             condicion2=true;
             pp.animalesAdoptados++; 
         }
        }
      if (condicion1 && condicion2){
          LocalDate fechaAdopcio=LocalDate.now();
          for (Animal c:animales){
              if(c.GetCodigo()==codigoAnimal){
                  Adopcion nuevaAdopcion=new Adopcion(fechaAdopcio,c);
                  animalesAdoptados.add(nuevaAdopcion);
                  animales.remove(c);
                  nuevaAdopcion.AumentarCodigoAdopcion();
                  
              }
          }
      }
        
        
    }
    
}
