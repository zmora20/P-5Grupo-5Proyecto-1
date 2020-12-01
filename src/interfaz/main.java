/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import java.util.Scanner;
/**
 *
 * @author Fabricio
 */
//zaida le toca esto psdata todo es culpa de Zhala
/*public class main {
    //*public void menuPrincipal(){
                System.out.println("Bienvenido");
        
        System.out.print("Ingrese Usuario: ");
        String usuario= sc.nextLine();
        System.out.print("Ingrese Contraseña: ");
        String contraseña=sc.nextLine();
       
        String op = "";
        
        
        
        if (validacion){
        do{
            
            System.out.println("1. Registrar Empleado");
            System.out.println("2. Registrar Venta");
            System.out.println("3. Mostrar Nomina");
            System.out.println("4. Salir");
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
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(!op.equals("3")); //cambiar equals por == y ver que pasa.
        
    }
    }
    

    private void opcion1(){
        System.out.println("Opcion Registrar Empleado");
        System.out.println("Ingrese nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese cedula");
        String ci = sc.nextLine();
        System.out.println("Ingrese sueldo base");
        Double sueldo = sc.nextDouble();
        sc.nextLine();//limpio el buffer
        System.out.println("Ingrese tipo (empleado ó vendedor):");
        String tipo = sc.nextLine();
        Empleado emp;
        //si tipo es empleado cree une instancia de Empleado con los datos 
        //si tipo es vendedor cree una instancia de Vendedor con los datos 
        //agregue al empleado a la nomina
        if (tipo.equals("empleado")){
          emp=new Empleado(nombre, ci, sueldo);  
          boolean c =th.agregarEmpleado(emp);
          if (c){
             System.out.println("la operacion fue exitosa");

          }else{
            System.out.println("la operacion no fue exitosa");
          }     
        }
        else if (tipo.equals("vendedor")){
          emp=new Vendedor(nombre, ci, sueldo);
          th.agregarEmpleado(emp);
          String mensaje=(th.agregarEmpleado(emp))?"operacion exitosa":"operacion no exitosa";

          System.out.println(mensaje);    
        }


    }
   
    private void opcion2(){
        System.out.println("Opcion Registrar Venta");
        System.out.println("ingrese cedula");
        String dni=sc.nextLine();
        sc.nextLine();
        System.out.println("ingrese numero de articulos");
        int arti=sc.nextInt();
        Vendedor ve1=th.consultarVendedor(dni);
        th.registrarVenta(ve1,arti);
    }

    private void opcion3(){
        System.out.println("Opcion Mostrar Nomina");
        th.mostrarNomina();
        //recorrer el arreglo de empleados y por cada empleado llamar
        //al metodo calcularSalarioMensual
    }/*/
    


    

