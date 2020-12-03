/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import java.time.LocalDate;
import java.util.Scanner;
import modelo.Usuario.*;
import modelo.animal.*;
import modelo.fundacion.*;


public class main {
    UIFundacion pt;
    Scanner sc;
    
    public main(){
    sc =new Scanner(System.in);
    
    pt =new UIFundacion(); 
    }
    public void menuPrincipal(){
        
               
    
        System.out.println("Bienvenido");    
        System.out.print("Ingrese Usuario: ");
        String usuario= sc.nextLine();
        System.out.println("Ingrese Contraseña: ");
        String contraseña=sc.nextLine();
        String op = ""; 
        int i=0;
        
        while(i <2){
            if (pt.Validacion(usuario, contraseña)!=null){
                System.out.println("credenciales validas");
                i ++;
                if (pt.ValidacionUsuario(pt.Validacion(usuario, contraseña))){
                    //empleado
                    do{
            
                        System.out.println("1. Registrar nuevo Animal");
                        System.out.println("2. Consultar"
                                + " animales en fundacion");
                        System.out.println("3. Registrar "
                                + "interesado en Adopcion");
                        System.out.println("4. Registrar Adopcion");
                        System.out.println("5. Consultar Adopcion");
                        System.out.println("6. Consultar Adoptantes");
                        System.out.println("7. Cerrar sesion");
                        
                        System.out.println("Ingrese opcion");
                        op = sc.nextLine();
            
                        switch(op){
                            case "1":
                                opcion1();

                            break;
                            case "2":
                                opcion2();
                            break;
                            case "3":
                                opcion3();
                            break;
                            case "4":
                                System.out.println("Adios");
                                break;
                            case "5":
                                opcion5();
                            break;
                            case "6":
                                opcion6();
                            break;
                            case "7":
                                opcion7();
                            break;
                            default:
                                System.out.println("Opcion invalida");
                            break;
                            
                        }
                        }while(!op.equals("7"));
                    
                }else{
                    //administrador
                    do{
            
                        System.out.println("1. Registrar Empleados");
                        System.out.println("2. Consultar y Regist"
                                + "rar Veterinarias");
                        System.out.println("3. Consultar y regi"
                                + "strar Gastos Veterinarios");
                        System.out.println("4. Consultar Presupuesto Mensual");
                        System.out.println("5. Enviar correo a interesados");
                        System.out.println("6. Cerrar sesion");
                        
                        System.out.println("Ingrese opcion");
                        op = sc.nextLine();
            
                        switch(op){
                            case "1":
                                opcion8();

                            break;
                            case "2":
                                opcion9();
                            break;
                            case "3":
                                opcion10();
                            break;
                            case "4":
                                System.out.println("Adios");
                                break;
                            case "5":
                                opcion11();
                            break;
                            case "6":
                                opcion12();
                            
                            default:
                                System.out.println("Opcion invalida");
                            break;
                            
                        }
                        }while(!op.equals("6"));
                }
            }else {
                i ++;
                System.out.println("Las credenciales son invalidas");
        }
        }
       
        
    }
    private void opcion1(){
        System.out.println("Ingrese animal a registrar:Perro/Gato");
        String tipo=sc.nextLine().toUpperCase();
        
        System.out.println("escriba el nombre ");
        String nombre=sc.nextLine();
        System.out.println("raza");
        String raza=sc.nextLine();
        System.out.println("sexo del animal (macho/hembra) ");
        System.out.println("edad");
        int edad=sc.nextInt();
        sc.nextLine();
        System.out.println("peso");
        double pezo=sc.nextDouble();
        sc.nextLine();
        System.out.println("escriba observaciones");
        String observaciones=sc.nextLine();
        LocalDate fecha=LocalDate.now();
        if (tipo=="PERRO"){
            
        }
        
           }
    }
    

  


    

