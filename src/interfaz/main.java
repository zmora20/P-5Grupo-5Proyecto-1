/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Usuario.*;
import modelo.animal.*;
import modelo.fundacion.*;
import java.util.List;
import java.util.Arrays;


public class main {
    
    static UIFundacion pt;
    //static modelo.Usuario.Empleado xe;
    //static modelo.fundacion.PersonaAdopta pe;
    static modelo.fundacion.ConsultasRegistrosAdmin cr;
    static Scanner sc = new Scanner(System.in);
    static Empleado emp;
    static Administrador adm;
    
    
    
    public static void menuPrincipal(){
       cr=new ConsultasRegistrosAdmin();
       pt=new UIFundacion();
       
    
        String cond="";
        
        while(cond!="SI"){
        System.out.println("Bienvenido");    
        System.out.print("Ingrese Usuario: ");
        String usuario= sc.nextLine();
        System.out.println("Ingrese Contraseña: ");
        String contraseña=sc.nextLine();
        System.out.print("salir del programa(si/no)");
        cond= sc.nextLine().toUpperCase();
        String op = ""; 
            if (pt.Validacion(usuario,contraseña)!= null ){
                System.out.println("Credenciales validas");
                if (pt.ValidacionUsuario(pt.Validacion(usuario, contraseña))){
                    //empleado
                    emp= (Empleado) pt.Validacion(usuario, contraseña); 
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
                                opcion4();
                                break;
                            case "5":
                                opcion5();
                            break;
                            case "6":
                                opcion6();
                            break;
                            case "7":
                                System.out.println("Se cerro la sesion");
                                break;
                            
                            default:
                                System.out.println("Opcion invalida");
                            break;
                            
                        }
                        }while(!op.equals("7"));
                    
                }else{
                    //administrador
                     adm= (Administrador) pt.Validacion(usuario, contraseña);
                    
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
                                opcion11();
                                break;
                            case "5":
                                opcion12();
                            break;
                            case "6":
                                System.out.println("Se cerro la sesion");
                                break;
                            
                            default:
                                System.out.println("Opcion invalida");
                            break;
                            
                        }
                        }while(!op.equals("6"));
                }
            
            
            }else if(cond.equals("SI")){
                    break;
                    
            }else {
                
                System.out.println("Las credenciales son invalidas");
        }
        }
       
        
    }
    private static void opcion1(){
        System.out.println("Ingrese animal a registrar (Perro/Gato):");
        String tipo=sc.nextLine().toUpperCase();
        
        
        System.out.println("Escriba el nombre ");
        String nombre=sc.nextLine();
        System.out.println("Escriba la raza");
        String raza=sc.nextLine();
        System.out.println("Escriba sexo del animal (macho/hembra): ");
        //no se como llamar a un enum
        Sexo sexo=Sexo.valueOf(sc.nextLine().toUpperCase());
        
        System.out.println("Escriba el numero de edad del animal");
        int edad=sc.nextInt();
        sc.nextLine();
        
        System.out.println("Escriba el peso");
        double peso=Double.parseDouble(sc.nextLine());
       
        System.out.println("Escriba observaciones");
        String observaciones=sc.nextLine();
        
        LocalDate fecha=LocalDate.now();
        
        if (tipo.equals("PERRO")){
            System.out.println("el tamanio del perro");
            Size tamanio=Size.valueOf(sc.nextLine().toUpperCase());            
            Animal obj= new Perro(fecha,nombre,raza,sexo,edad,peso,observaciones,tamanio);
            emp.registrarAnimal(obj);
        }else if (tipo.equals("GATO")){
            Animal obj= new Gato(fecha,nombre,raza,sexo,edad,peso,observaciones);
            emp.registrarAnimal(obj);
        }else{
            System.out.println("No coincide ");
        }
        
    }
    private static void opcion2(){
        emp.consultarAnimal();
    }
    private static void opcion3(){
        System.out.println("Ingrese nombre");
        String nombre=sc.nextLine();
        
        System.out.println("Escriba su identificacion ");
        String id=sc.nextLine();
        System.out.println("Escriba su direccion");
        String direccion=sc.nextLine();
        System.out.println("Escriba su elefono ");
        //no se como llamar a un enum
        String telefono=sc.nextLine();
        
        System.out.println("Escriba su correo electronico");
        String correoElectronico=sc.nextLine();
        System.out.println("Escriba sus preferencias (tipo de animal,"
                + "sexo del animal, numero de edad del animal)");
        String Preferencias=sc.nextLine();
        
        PersonaAdopta per1=new PersonaAdopta(nombre,id,direccion,telefono,
                correoElectronico,Preferencias);
        emp.registrarPersona(per1);     
    }
    private static void opcion4(){
        System.out.println("Ingrese el codigo del animal");
        int codigo=Integer.parseInt(sc.nextLine());
        
        System.out.println("Escriba su identificacion ");
        String id=sc.nextLine();
        boolean cond1= emp.registrarAdopcion(id);
        boolean cond2= emp.registrarAdopcion(codigo);
        
        emp.registrarAdopcion(cond1, cond2, codigo, id);
        
        
    }
    private static void opcion5(){
        emp.consultaAdopcion();
    }
    private static void opcion6(){
        for (PersonaAdopta per :cr.personas){
            System.out.println(per);
            
        }
        System.out.println("Ingrese numero de cedula");
        String ced=sc.nextLine();
        if (!ced.equals("")){
        emp.consultaRegistro(ced);
        }
    }
    
    private static void opcion8(){
        System.out.println("Ingrese nombre completo: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese direccion: ");
        String direccion=sc.nextLine();
        System.out.println("Ingrese numero telefono: ");
        String telefono =sc.nextLine();
        System.out.println("Ingrese correo electronico:  ");
        String correo=sc.nextLine();     
        LocalDate fechainicio=LocalDate.now();
        System.out.println("Ingrese sueldo ganado:");    
        double sueldo=Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese usuario:");
        String usuario=sc.nextLine();
        System.out.println("Ingrese contraseña:");
        String contraseña=sc.nextLine();
        System.out.println("¿Es empleado? (SI/NO)");
        String cnd=sc.nextLine().toUpperCase();
        if (cnd.equals("SI")){
           Usuario e1=new Empleado(nombre,direccion,telefono,correo,fechainicio,
           sueldo,usuario,contraseña);
           cr.agregarEmpleado(e1);
        }else{
            System.out.println("Ingrese numero de cuenta ");
            int nC=Integer.parseInt(sc.nextLine());
            Usuario e2=new Administrador(nombre,direccion,telefono,correo,
               fechainicio,sueldo,usuario,contraseña,nC);
            cr.agregarEmpleado(e2);
        }
    }
    private static void opcion9(){
        
        System.out.println("Ingrese nombre veterinaria:");
         String nombreV= sc.nextLine();
         System.out.println("Ingrese telefono");
         int telefono = Integer.parseInt(sc.nextLine());
         System.out.println("Ingrese correo vetearinaria");
         String correo=sc.nextLine();
         Veterinaria vet1= new Veterinaria(nombreV,telefono,correo);
         cr.registrarVeterinaria(vet1);
         cr.consultarVeterinarias();
    }
    private static void opcion10(){
        LocalDate fecha=LocalDate.now();
        System.out.println("Ingrese monto gastado:");
        double mon=Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese codigo del animal tratado:");
        int cod=Integer.parseInt(sc.nextLine());
        for(Animal animBuscado:cr.animal){
            if(animBuscado.GetCodigo()==cod){
                GastosVeterinaria gvt1=new 
                GastosVeterinaria(fecha,mon,animBuscado);
                cr.reagistrarGastoVeterinaria(gvt1);
                cr.consultarGastoVeterinarias();
                
            }else{
                System.out.println("se esta aqui");
            }
        }
            
       
        
    }
    private static void opcion11(){
        System.out.println("El saldo mensual de la fundacion es :");
        double mensual=cr.calcularGastoMensual();
        System.out.println(mensual);
        
    }
    
    
        
    private static void opcion12(){
        
        //aqui se envian los correos 
        String asunto = "Informacion";
        ArrayList<PersonaAdopta> lista = modelo.fundacion.ConsultasRegistrosAdmin
            .personas;
    
    

    
        for (PersonaAdopta adt: lista){
            String[] preferencias = adt.preferencia.split(",");
            cr.enviarCorreo(adt.GetCorreoElectro(), asunto, preferencias);
        
//adt.preferencia
        
        
        }
    
    
    
    }
    
    
    public static void main( String[] args){  
      
        menuPrincipal();
        
    }
    
    
    
    }

    

  


    

