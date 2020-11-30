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
        
    
    public boolean registrarPersona(PersonaAdopta per){
        
        if (per.personas.contains(per)){
            per.personas.add(per);
        }
        return false;
    }
    
    public void registrarAdopcion(String cedula,int codigoAnimal){
      ;

        
        
        
    }
}
