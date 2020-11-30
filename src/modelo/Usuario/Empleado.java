/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Usuario;
import modelo.fundacion.PersonaAdopta;
import modelo.animal.Gato;
import modelo.animal.Perro;
import modelo.animal.Sexo;
import modelo.animal.Size;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author zaida
 */
public class Empleado extends Usuario {
    
    public void consultarAnimal(){
        
    }
    
    public void consultaAdopcion(){
        
    }
    
    public void consultaRegistro(){
    
    }
    
    public ArrayList<String> registrarAnimal(Perro pe,Gato g){
        pe = new Perro();
        g = new Gato();
        
        Scanner sc = new Scanner(System.in);
        
        LocalDate fechaIngreso = LocalDate.now();
        pe.SetFechaIngreso(fechaIngreso);
        
        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();
        pe.SetNombre(nombre);
        
        System.out.println("Ingrese raza");
        String raza = sc.nextLine();
        pe.SetRaza(raza);
        
        System.out.println("Ingrese sexo (macho/hembra):");
        String genero = sc.nextLine().toUpperCase();
        
        
        System.out.println("Ingrese peso:");
        double peso = sc.nextDouble();
        pe.SetPeso(peso);
        
        System.out.println("Ingrese edad:");
        int edad = sc.nextInt();
        pe.SetEdad(edad);
        
        System.out.println("Ingrese observaciones:");
        String observaciones = sc.nextLine();
        pe.SetObservaciones(observaciones);
        
        System.out.println("Ingrese tamanio de perro (pequenio/mediano/grande)");
        String altitud = sc.nextLine().toUpperCase();
        String tamanio = "";
        String datosPerro = "";
        String datosGato = "";
        
        
        
        if (Size.valueOf(altitud).equals(Size.GRANDE)){
            tamanio += "GRANDE";
        } else if (Size.valueOf(altitud).equals(Size.MEDIANO)){
            tamanio += "MEDIANO";
        } else if (Size.valueOf(altitud).equals(Size.PEQUENIO)){
            tamanio += "PEQUENIO";
        }else{
            tamanio +=" ";
        }
        
        
        
        
        ArrayList<String> animales = new ArrayList();
        
        if (tamanio.equals(" ")){
            datosGato = datosGato + pe.GetNombre();
            datosGato = datosGato +=",";
            datosGato = datosGato += pe.GetRaza();
            datosGato = datosGato +=",";
            
            if (Sexo.valueOf(genero).equals(Sexo.MACHO)){
                
                datosGato = datosGato + "MACHO";
            }else{
               
                datosGato = datosGato + "HEMBRA";
            }
            datosGato = datosGato + ",";
            datosGato = datosGato + pe.GetPeso();
            datosGato = datosGato + ",";
            datosGato = datosGato + pe.GetEdad();
            datosGato = datosGato + ",";
            datosGato = datosGato + "'";
            datosGato = datosGato + pe.GetObservaciones();
            datosGato = datosGato + "'";
            
            
            
        }else{
            datosPerro += pe.GetNombre();
            datosPerro +=",";
            datosPerro += pe.GetRaza();
            datosPerro +=",";
            
            if (Sexo.valueOf(genero).equals(Sexo.MACHO)){
                datosPerro = datosPerro + "MACHO";
            }else{
                String sexo = genero.replace("MACHO", "HEMBRA");
                datosPerro = datosPerro + "HEMBRA";
            datosPerro +=",";
            datosPerro +=pe.GetPeso();
            datosPerro +=",";
            datosPerro +=pe.GetEdad();
            datosPerro +=",";
            datosPerro +="'";
            datosPerro +=pe.GetObservaciones();
            datosPerro +="'";
            datosPerro +=",";
            datosPerro += tamanio;
        }
        
        ArrayList<String> perros = new ArrayList();
        ArrayList<String> gatos = new ArrayList();
        
        perros.add(datosPerro);
        gatos.add(datosGato);
        
        
        
                
        return perros;
        return gatos;
        
        
        
                
        
        
        
        }
    }    
    
    public ArrayList<String> registrarPersona(PersonaAdopta p){
        p = new PersonaAdopta();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese identificacion");
        String identificacion = sc.nextLine();
        System.out.println("Ingrese direccion");
        String direccion = sc.nextLine();
        System.out.println("Ingrese telefono:");
        String telefono = sc.nextLine();
        System.out.println("Ingrese correo electronico:");
        String correo = sc.nextLine();
        System.out.println("Ingrese tipo de animal de preferencia:");
        String animalPreferencia = sc.nextLine();
        System.out.println("Ingrese raza de preferencia del animal:");
        String razaPreferencia = sc.nextLine();
        System.out.println("Ingrese sexo de animal de preferencia:");
        String sexoDelAnimal = sc.nextLine();
        
        p.SetNombrePersona(nombre);
        p.SetIdentificacion(identificacion);
        p.SetDireccion(direccion);
        p.SetTelefono(telefono);
        p.SetCorreoElectro(correo);
        p.SetAnimalPreferencia(animalPreferencia);
        p.SetRazaPreferencia(razaPreferencia);
        p.SetSexoAnimalPreferencia(sexoDelAnimal);
        
        
        ArrayList<String> personas = new ArrayList();
        String persona = p.GetNombrePersona()+','+p.GetIdentificacion()+','+
                p.GetDireccion()+','+p.GetTelefono()+','+
                p.GetCorreoElectro()+','+p.GetAnimalPreferencia()+','+
                p.GetRazaPreferencia()+','+p.GetSexoAnimalPreferencia();
        
        personas.add(persona);
        
        return personas;
        
    }
    
    public void registrarAdopcion(Perro pe, Gato g, PersonaAdopta p){
        
        
        
    }
}
