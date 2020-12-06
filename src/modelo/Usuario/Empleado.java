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
    public ArrayList<Adopcion>animalesAdoptad=
            ConsultasRegistrosAdmin.animalesAdoptados;
    Scanner sc = new Scanner(System.in);

        
    
    
    
    public Empleado(String nombre,String direccion,String telefono, String correo,
          LocalDate fechainicio,double sueldo,String usuario,String contraseña){
        super(nombre,direccion,telefono,correo,fechainicio,sueldo,usuario,
                contraseña);
    }
    
    public void consultarAnimal(){
        System.out.println("Ingrese tipo de animal (Gato/Perro):");
        String tipoAnimal = sc.nextLine().toUpperCase();
        System.out.println("Ingrese sexo del animal (Macho/Hembra):");
        String sexoAnimal = sc.nextLine().toUpperCase();
        
        System.out.println("Ingrese numero de edad del animal(0 si no quiere "
                + "filtrar):");
        int edadAnimal ;
        edadAnimal= Integer.parseInt(sc.nextLine());
        //CONDICIONAL O FUNCION COMPARAR POR SEXO SOBRECARGA
        if (!tipoAnimal.equals("")&&sexoAnimal.equals("")&&edadAnimal==0){
            if(tipoAnimal.equals("GATO") ){
                for (Animal ani: animales){
                    if (ani instanceof Gato){
                        System.out.println(ani.toString());
                    }
                }    
            }else{
                for (Animal ani: animales){
                    if (ani instanceof Perro){
                        System.out.println(ani.toString());
                    }          
                }
            }
            
        }else if (!sexoAnimal.equals("")&&tipoAnimal.equals("")&&edadAnimal==0){
            
            if(sexoAnimal.equals("MACHO") ){
                
                for (Animal ani: animales){
                    if (ani.sexo.name().equals("MACHO")){
                        System.out.println(ani.toString());
                    }
                }    
            }else{
                for (Animal ani: animales){
                    if (ani.sexo.name().equals("HEMBRA")){
                        System.out.println(ani.toString());
                    }          
                }
            }
            
        }else if (edadAnimal!=0&&sexoAnimal.equals("")&&tipoAnimal.equals("")){
            if(edadAnimal>=0 && edadAnimal<5){
                for (Animal ani: animales){
                    if (ani.edad>=0 && ani.edad<5){
                        System.out.println(ani.toString());
                    }
                }
            }else if (edadAnimal>=5 && edadAnimal<10){
                for (Animal ani: animales){
                    if (ani.edad>=5 && ani.edad<10){
                        System.out.println(ani.toString());
                    }
                }
                
            }else{
                for (Animal ani: animales){
                    if (ani.edad>=10 && ani.edad<15){
                        System.out.println(ani.toString());
                    }
                }
            }
            
        }else if (!sexoAnimal.equals("")&& edadAnimal!=0&&sexoAnimal.equals("")){
            consultarAnimal(tipoAnimal, edadAnimal);
            
            
        }else if(!tipoAnimal.equals("") && !sexoAnimal.equals("")&&edadAnimal==0){
            consultarAnimal(tipoAnimal,sexoAnimal);
            
        }else if (!tipoAnimal.equals("") && !sexoAnimal.equals("") &&edadAnimal!=0){
            consultarAnimal(tipoAnimal,sexoAnimal,edadAnimal);
            
        }else if(tipoAnimal.equals("") && sexoAnimal.equals("")&& edadAnimal==0) {
            for (Animal ani: animales){
                System.out.println(ani.toString());
            }
            
        }
           
        
    }
    
    public void consultarAnimal(String tipoAnima,String sexo){
        if(tipoAnima.equals("GATO")){
            if(sexo.equals("MACHO")){
                for (Animal ani: animales ){
                    if (ani instanceof Gato && ani.sexo.name().equals(sexo)){
                        System.out.println(ani.toString());
                    }
                }
            }else{
                for (Animal ani: animales){
                    if (ani instanceof Gato && ani.sexo.name().equals(sexo)){
                        System.out.println(ani.toString());
                    }
                
                }
            }
        
        }else if(tipoAnima.equals("PERRO")){
             if(sexo.equals("MACHO")){
                for (Animal ani: animales ){
                    if (ani instanceof Perro && ani.sexo.name().equals(sexo)){
                        System.out.println(ani.toString());
                    }
                }
            }else{
                for (Animal ani: animales){
                    if (ani instanceof Perro && ani.sexo.name().equals(sexo)){
                        System.out.println(ani.toString());
                    }
                
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
                            System.out.println(ani.toString());
                            }
                        }
                        }else if (edad>=5 && edad<10){
                           
                            if (ani.edad>=5 && ani.edad<10){
                                System.out.println(ani.toString());
                            }
                        }else{
                            
                            if (ani.edad>=10 && ani.edad<15){
                                System.out.println(ani.toString());
                            }
                        }
                 
                }
        }else{
                for (Animal ani: animales ){
                    if (ani instanceof Perro ){
                        if(edad>=0 && edad<5){
                            if (ani.edad>=0 && ani.edad<5){
                            System.out.println(ani.toString());
                            }
                        }
                        }else if (edad>=5 && edad<10){
                           
                            if (ani.edad>=5 && ani.edad<10){
                                System.out.println(ani.toString());
                            }
                        }else{
                            
                            if (ani.edad>=10 && ani.edad<15){
                                System.out.println(ani.toString());
                            }
                        }
                 
                }
        }  
        
    }
    public Animal consultarAnimal(String tipoAnima,String sexo,int edad){
        if(tipoAnima.equals("GATO")){
            if(sexo.equals("MACHO")){
                for (Animal ani: animales ){
                    if (ani instanceof Gato && ani.sexo.name().equals(sexo)){
                        if(edad>=0 && edad<5){
                            if (ani.edad>=0 && ani.edad<5){
                            System.out.println(ani.toString());
                            return ani;
                            
                            }
                        
                        }else if (edad>=5 && edad<10){
                           
                            if (ani.edad>=5 && ani.edad<10){
                                System.out.println(ani.toString());
                                return ani;
                            }
                        }else{
                            
                            if (ani.edad>=10 && ani.edad<15){
                                System.out.println(ani.toString());
                                return ani;
                            }
                        }
                    }
                }
                
            }else{
                for (Animal ani: animales){
                    if (ani instanceof Gato && ani.sexo.name().equals(sexo)){
                        if(edad>=0 && edad<5){
                            if (ani.edad>=0 && ani.edad<5){
                            System.out.println(ani.toString());
                            return ani;
                            }
                        
                        }else if (edad>=5 && edad<10){
                           
                            if (ani.edad>=5 && ani.edad<10){
                                System.out.println(ani.toString());
                                return ani;
                            }
                        }else{
                            
                            if (ani.edad>=10 && ani.edad<15){
                                System.out.println(ani.toString());
                                return ani;
                            }
                        }
                    }
                
                }
            }
        
        }else if(tipoAnima.equals("PERRO")){
            if(sexo.equals("MACHO")){
                for (Animal ani: animales ){
                    if (ani instanceof Perro && ani.sexo.name().equals(sexo)){
                        if(edad>=0 && edad<5){
                            if (ani.edad>=0 && ani.edad<5){
                            System.out.println(ani.toString());
                            return ani;
                            }
                        
                        }else if (edad>=5 && edad<10){
                           
                            if (ani.edad>=5 && ani.edad<10){
                                System.out.println(ani.toString());
                                return ani;
                            }
                        }else{
                            
                            if (ani.edad>=10 && ani.edad<15){
                                System.out.println(ani.toString());
                                return ani;
                            }
                        }
                    }
                }
            }else{
                for (Animal ani: animales){
                    if (ani instanceof Perro && ani.sexo.name().equals(sexo)){
                        if(edad>=0 && edad<5){
                            if (ani.edad>=0 && ani.edad<5){
                            System.out.println(ani.toString());
                            return ani;
                            }
                        
                        }else if (edad>=5 && edad<10){
                           
                            if (ani.edad>=5 && ani.edad<10){
                                System.out.println(ani.toString());
                                return ani;
                            }
                        }else{
                            
                            if (ani.edad>=10 && ani.edad<15){
                                System.out.println(ani.toString());
                                return ani;
                            }
                 
                        }
                    }
                }
                
            }
        }
        return null;
        
        
        
        
    }
    
    
        
    
    public void consultaAdopcion(){
        
        Collections.sort(animalesAdoptad);
        //Collections.sort(ad.animalesAdoptados,Collections.reverseOrder());
        
        for (Adopcion adop:animalesAdoptad){
            System.out.println(adop);
        }
        System.out.println("Desea consultar una Adopcion"
                + " en especifico por codigo");
        int opcionA=0;
        opcionA = sc.nextInt();
        sc.nextLine();
        if (opcionA!=0){
            for (Adopcion adop1:animalesAdoptad){
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
                for(Adopcion aad:animalesAdoptad){
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
        
        if (!persona.contains(per)){
            persona.add(per);
            return true;
        }
        return false;
    }
    
    public void registrarAdopcion(boolean condicion1,boolean condicion2,int codigoAnimal, String ID){
        

        if (condicion1 && condicion2){
            
            LocalDate fechaAdopcio=LocalDate.now();
            for (Animal c:animales){
                for (PersonaAdopta pet:persona){
                    if(ID.equals(pet)){
                        if(c.GetCodigo()==codigoAnimal){
                            Adopcion nuevaAdopcion=new Adopcion(fechaAdopcio,c,pet);
                            animalesAdoptad.add(nuevaAdopcion);
                            animales.remove(c);
                                nuevaAdopcion.AumentarCodigoAdopcion();
                    
                  
                        }
                    }
                        
                }        
            }
        }
        
        
    }
    public boolean registrarAdopcion(String cedula){
        for (PersonaAdopta pp:persona){
            if (pp.GetIdentificacion().equals(cedula)){
                
                pp.animalesAdoptados++;
                return true;
            }else{
                    System.out.println("la persona no esta registrada");
            }
        }
        return false;
    }
    public boolean registrarAdopcion(int codigoAnimal){
        for (Adopcion ado: animalesAdoptad){
            if(codigoAnimal==ado.animal.GetCodigo()){
                System.out.println("El animal ha sido adoptado");
                return false;
            }
        }
        return true;
    }

    
}
