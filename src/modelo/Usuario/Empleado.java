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
    public ArrayList<Animal> animales ;
    public modelo.fundacion.PersonaAdopta pers;
    public modelo.fundacion.Adopcion ad;
    Scanner sc = new Scanner(System.in);

        
    
    LocalDate fecha=LocalDate.now();
    
    Animal pe = new Perro(fecha,"toby","poodle",Sexo.MACHO,12,1.45,
                "hhlo",Size.PEQUENIO);
    Animal g = new Gato(fecha,"toby","poodle",Sexo.MACHO,12,1.45,
                "hhlo");
    
    public Empleado(String nombre,String direccion,int telefono, String correo,
          LocalDate fechainicio,double sueldo,String usuario,String contraseña){
        super(nombre,direccion,telefono,correo,fechainicio,sueldo,usuario,
                contraseña);
    }
    
    public void consultarAnimal(){
        System.out.println("Ingrese tipo de animal (Gato/Perro):");
        String tipoAnimal = sc.nextLine();
        System.out.println("Ingrese sexo del animal (Macho/Hembra):");
        String sexoAnimal = sc.nextLine().toUpperCase();
        System.out.println("Ingrese edad del animal:");
        int edadAnimal = sc.nextInt();
        
        switch (tipoAnimal) {
            case "Gato":
                for (Animal ani: animales){
                    if (ani instanceof Gato){
                        System.out.println(ani);
                    }
                }
            case "Perro":
                for (Animal ani: animales){
                    if (ani instanceof Perro){
                        System.out.println(ani);
                    }
                }    
            default:
                for (Animal ani: animales){
                    System.out.println(ani);
                
                }
                
                
        }
        
        switch (sexoAnimal){
            case "MACHO":
                for (Animal ann: animales){
                    if (ann.sexo.MACHO.name().equals("MACHO")){
                        System.out.println(ann);
                    }
                }
                break;
            case "HEMBRA":
                for (Animal ann: animales){
                    if (ann.sexo.HEMBRA.name().equals("HEMBRA")){
                        System.out.println(ann);
                    }
                }  
                break;
            default:
                for (Animal ann: animales){
                    System.out.println(ann);
                
                }
            
        }
        
        switch (edadAnimal){
            case 1: case 2: case 3: case 4: case 5:
                for (Animal ann: animales){
                    if (ann.edad<=5) {
                        System.out.println(ann);
                    }
                }
                
            case 6: case 7: case 8: case 9: case 10:
                for (Animal ann: animales){
                    if (ann.edad >= 6 && ann.edad<=10) {
                        System.out.println(ann);
                    }
                }
                
            case 11: case 12: case 13: case 14: case 15:
                for (Animal ann: animales){
                    if (ann.edad>= 10 && ann.edad<=15) {
                        System.out.println(ann);
                    }
                }
        }
        
    //for (Animal ann: animales){
                    //if (ann.edad==edadAnimal) {
                        //System.out.println(ann);
                    //}
        
    }
    
    public void consultaAdopcion(){
        
        Collections.sort(ad.animalesAdoptados);
        //Collections.sort(ad.animalesAdoptados,Collections.reverseOrder());
        
        for (Adopcion adop: ad.animalesAdoptados){
            System.out.println(adop);
        
        }
        System.out.println("Desea consultar una Adopcion"
                + " en especifico por codigo");
        int opcionA=0;
        opcionA = sc.nextInt();
        sc.nextLine();
        if (opcionA!=0){
            for (Adopcion adop1: ad.animalesAdoptados){
                if (adop1.GetCodigoAdopcion()==opcionA){
                    System.out.println(adop1);
                }        
            }
        }
        
            
        
        
    }
    
    public void consultaRegistro(){
        for (PersonaAdopta per: pers.personas){
            System.out.println(per);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cedula: ");
        String cedula = sc.nextLine();
        for (PersonaAdopta per: pers.personas){
            if(per.GetIdentificacion().equals(cedula) && 
                    per.animalesAdoptados != 0 ){
                for(Adopcion aad: ad.animalesAdoptados){
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
                for (PersonaAdopta per: pers.personas){
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
        
        if (pers.personas.contains(per)){
            pers.personas.add(per);
            return true;
        }
        return false;
    }
    
    public void registrarAdopcion(String cedula,int codigoAnimal){
        boolean condicion1 = true;
        boolean condicion2 = false;
        for (Adopcion ado: ad.animalesAdoptados){
            if (ado.animal.GetCodigo()==codigoAnimal){
                condicion1=false;
                System.out.println("El animal ha sido adoptado");              
            }
        }
        for (PersonaAdopta pp: pers.personas){
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
                  ad.animalesAdoptados.add(nuevaAdopcion);
                  animales.remove(c);
                  nuevaAdopcion.AumentarCodigoAdopcion();
                  
              }
          }
      }
        
        
    }
}
