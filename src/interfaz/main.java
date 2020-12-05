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
       
    
        System.out.println("Bienvenido");    
        System.out.print("Ingrese Usuario: ");
        String usuario= sc.nextLine();
        System.out.println("Ingrese Contraseña: ");
        String contraseña=sc.nextLine();
        String op = ""; 
        int i=0;
        
        while(i <2){
            if (pt.Validacion(usuario,contraseña)!= null){
                System.out.println("credenciales validas");
                i ++;
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
                                System.out.println("Adios");
                                break;
                            case "5":
                                opcion5();
                            break;
                            case "6":
                                opcion6();
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
                                System.out.println("se cerro la sesion");
                                break;
                            
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
    private static void opcion1(){
        System.out.println("Ingrese animal a registrar:Perro/Gato");
        String tipo=sc.nextLine().toUpperCase();
        
        System.out.println("escriba el nombre ");
        String nombre=sc.nextLine();
        System.out.println("raza");
        String raza=sc.nextLine();
        System.out.println("sexo del animal (macho/hembra) ");
        //no se como llamar a un enum
        Sexo sexo=Sexo.valueOf(sc.nextLine().toUpperCase());
        
        System.out.println("edad");
        int edad=sc.nextInt();
        sc.nextLine();
        
        System.out.println("peso");
        double peso=Double.parseDouble(sc.nextLine());
       
        System.out.println("escriba observaciones");
        String observaciones=sc.nextLine();
        
        LocalDate fecha=LocalDate.now();
        if (tipo=="PERRO"){
            System.out.println("el tamanio del perro");
            Size tamanio=Size.valueOf(sc.nextLine().toUpperCase());            
            Animal obj= new Perro(fecha,nombre,raza,sexo,edad,peso,observaciones,tamanio);
            emp.registrarAnimal(obj);
        }else{
            //Animal obj= new Animal(fecha,nombre,raza,sexo,edad,peso,observaciones);
            //emp.registrarAnimal(obj);
        }
        
    }
    private static void opcion2(){
        emp.consultarAnimal();
    }
    private static void opcion3(){
        System.out.println("Ingrese nombre");
        String nombre=sc.nextLine();
        
        System.out.println("escriba su id ");
        String id=sc.nextLine();
        System.out.println("escriba su direccion");
        String direccion=sc.nextLine();
        System.out.println("telefono ");
        //no se como llamar a un enum
        String telefono=sc.nextLine();
        
        System.out.println("correo electronico");
        String correoElectronico=sc.nextLine();
        System.out.println("sus preferencias");
        String Preferencias=sc.nextLine();
        
        PersonaAdopta per1=new PersonaAdopta(nombre,id,direccion,telefono,
                correoElectronico,Preferencias);
        emp.registrarPersona(per1);     
    }
    private static void opcion4(){
        System.out.println("Ingrese el codigo del animal");
        int codigo=sc.nextInt();
        
        System.out.println("Escriba su id ");
        String id=sc.nextLine();
        emp.registrarAdopcion(id, codigo);
        
        
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
        
        emp.consultaRegistro(ced);
     
    }
    
    private static void opcion8(){
        System.out.println("Ingrese nombre completo: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese direccion: ");
        String direccion=sc.nextLine();
        System.out.println("Ingrese numero telefono: ");
        int telefono =Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese correo electronico:  ");
        String correo=sc.nextLine();     
        LocalDate fechainicio=LocalDate.now();
        System.out.println("Ingrese sueldo ganado:");    
        double sueldo=Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese Usuario:");
        String usuario=sc.nextLine();
        System.out.println("Ingrese Contraseña:");
        String contraseña=sc.nextLine();
        System.out.println("Es Empleado: SI/NO");
        String cnd=sc.nextLine().toUpperCase();
        if (cnd=="SI"){
           Usuario e1=new Empleado(nombre,direccion,telefono,correo,fechainicio,
           sueldo,usuario,contraseña);
           cr.agregarEmpleado(e1);
        }else{
            System.out.println("ingrese numero de cuenta ");
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
        System.out.println("Ingrese codigo animal tratado:");
        int cod=Integer.parseInt(sc.nextLine());
        for(Animal animBuscado: emp.animales){
            if(animBuscado.GetCodigo()==cod){
                GastosVeterinaria gvt1=new 
                GastosVeterinaria(fecha,mon,animBuscado);
                cr.reagistrarGastoVeterinaria(gvt1);
                cr.consultarGastoVeterinarias();
                
            }
        }
            
       
        
    }
    private static void opcion11(){
        System.out.println("el saldo mensual de la fundacion es :");
        double mensual=cr.calcularGastoMensual();
        System.out.println(mensual);
        
    }
    private static void opcion12(){
    //aqui se envian los correos 
    }
    
    public static void main( String[] args){
        menuPrincipal();
        
    }
    
    
    
    }

    

  


    

