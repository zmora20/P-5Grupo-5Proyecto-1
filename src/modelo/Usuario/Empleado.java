/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.Usuario;
import modelo.fundacion.*;
import modelo.animal.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author zaida
 */
public class Empleado extends Usuario {
    public ArrayList<Animal> animales ;
        
    
    LocalDate fecha=LocalDate.now();
    
    Animal pe = new Perro(fecha,"toby","poodle",Sexo.MACHO,12,4531,1.45,
                "hhlo",Size.PEQUENIO);
    Animal g = new Gato(fecha,"toby","poodle",Sexo.MACHO,12,4531,1.45,
                "hhlo");
    
    public void consultarAnimal(){
        
    }
    
    public void consultaAdopcion(){
        
    }
    
    public void consultaRegistro(){
    
    }
    
    public boolean registrarAnimal(Animal ani){
        if (!animales.contains(ani)){
            animales.add(ani);
            return true;
        }else {
            System.out.println("el animal ya esta registrado");
        }
        return false;
        
        
    
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
