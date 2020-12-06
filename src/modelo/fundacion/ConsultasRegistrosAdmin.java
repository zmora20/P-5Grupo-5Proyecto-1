/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fundacion;
import java.util.Properties;

import java.util.ArrayList;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import modelo.Usuario.*;
import modelo.animal.*;
import modelo.fundacion.*;
import java.time.LocalDate;


 
/**
 *
 * @author Fabricio
 */

public class ConsultasRegistrosAdmin {
    public static ArrayList <Usuario> empleados;
    public static ArrayList<Veterinaria> veterinarias;
    public static ArrayList<GastosVeterinaria> gastosdeVeterinarias;
    public static ArrayList<Animal> animal;
    public static ArrayList<PersonaAdopta> personas;
    public static ArrayList<Adopcion>animalesAdoptados;
    
    
    public ConsultasRegistrosAdmin(){
     empleados=new ArrayList<>();
     
     veterinarias=new ArrayList<>();
     gastosdeVeterinarias=new ArrayList<>();
     personas=new ArrayList<>();
     animal=new ArrayList<>();
     animalesAdoptados=new ArrayList<>();
     inicializarDatos();
             
    }
 
    
    
            
            
    public void inicializarDatos(){
    LocalDate fecha=LocalDate.now(); 
   
    Animal pe = new Perro(fecha,"rene","poodle",Sexo.MACHO,12,1.45,
                "blanco",Size.PEQUENIO);
     animal.add(pe);
     pe.aumentarCodigo();
    pe.toString();
    Animal g = new Gato(fecha,"toby","poodle",Sexo.MACHO,12,1.45,
                "gris");
    g.aumentarCodigo();
    Usuario emp =new Empleado("Zaida","Norte","125785733",
            "sara12mora@gmail.com",fecha,  54.78,"zmo","123");
    empleados.add(emp);
    Usuario admi=new Administrador("Fabricio","Sur","05485857",
            "fquimis@espol.edu.ec",fecha,46.75,"frq","123",456);
    empleados.add(admi);
    
    Veterinaria vet=new Veterinaria("CaTDog",456,"zmora@espol.edu.ec");
    veterinarias.add(vet);
    PersonaAdopta per1=new PersonaAdopta("Leon", "096478","Centro","06313", 
            "lfvargas@espol.edu.ec", "gato,macho,10");
    personas.add(per1);
    PersonaAdopta per2=new PersonaAdopta("lala", "76476","Centro","06313", 
            "lv657s@espol.edu.ec", "gato,10 años");
    //personas.add(per2);
     Adopcion r =new Adopcion(fecha,g,per1);
     animalesAdoptados.add(r);
     r.AumentarCodigoAdopcion();
    
    }
    
    
    
    public boolean agregarEmpleado(Usuario usu){
        for (Usuario comUsu: empleados){
            String s=usu.usuario;         
            if (s==comUsu.usuario){
                System.out.println("el usuario ya existe pruebe con otro ");
                
            }else{
               empleados.add(usu);
                return true; 
            }
             
        }
        return false;
      
    } 
    public boolean registrarVeterinaria(Veterinaria v){
        if (!veterinarias.contains(v)){
            veterinarias.add(v);
            return true;   
        }
        return false;
             
    }      
    
    public void consultarVeterinarias(){
        for (Veterinaria ve : veterinarias ){
            System.out.println(ve);
        }
            
        
    }
    public boolean reagistrarGastoVeterinaria (GastosVeterinaria gv){
        if (!gastosdeVeterinarias.contains(gv)){
            gastosdeVeterinarias.add(gv);
            return true;
        }
        return false;    
    }
    public void consultarGastoVeterinarias(){
        for (GastosVeterinaria g : gastosdeVeterinarias ){
            System.out.println(g);
        }
            
        
    }
    public double calcularGastoMensual(){
        double gastoAdministrativo=0;
        double montoVeterinaria=0;
        double montoAnimales=0;
        for (Usuario u : empleados){
            double sueldoempleado= u.GetSueldo();
            gastoAdministrativo=gastoAdministrativo+sueldoempleado;                 
        }
        for (GastosVeterinaria vete : gastosdeVeterinarias){
            double dineroVeterinaria= vete.GetMonto();
            montoVeterinaria=montoVeterinaria+dineroVeterinaria;
        }
        for (Animal ani: animal){
            if (ani instanceof Gato){
                double montoPorAnimal=ani.calcularGasto();
                montoAnimales= montoAnimales+montoPorAnimal;
            }else{
                double montoPorAnimal=ani.calcularGasto();
                montoAnimales= montoAnimales+montoPorAnimal;
                
            }
        }
        return gastoAdministrativo+montoVeterinaria+montoAnimales;
    }

    /**
     *
     * @param destinatario
     * @param asunto
     * @param mensaje
     */
    public void enviarCorreo(String destinatario, String asunto, 
                String mensaje ){
            
            /* Configuracion de la cuenta */
            final String correoEmisor = "fundacion4patas20@gmail.com";
            final String claveEmisor = "poob2020";
            
            Properties propiedad = new Properties();
            propiedad.put("mail.smtp.host", "smtp.gmail.com");
            propiedad.put("mail.smtp.port", "587");
            propiedad.put("mail.smtp.auth", "true");
            propiedad.put("mail.smtp.starttls.enable", "true");
            propiedad.put("mail.smtp.user", correoEmisor);
            propiedad.put("mail.smtp.clave", claveEmisor);
            
            Session sesion = Session.getDefaultInstance(propiedad);
            MimeMessage mail = new MimeMessage(sesion);
            
            System.out.println("Procesando envio de mensaje...");
            /* Verifica que el correo se cree de forma correcta */
            try {
                mail.addRecipient(Message.RecipientType.TO, 
                        new InternetAddress(destinatario));
                mail.setSubject(asunto);
                mail.setText(mensaje);
                
                Transport transporte = sesion.getTransport("smtp");
                transporte.connect("smtp.gmail.com", correoEmisor, claveEmisor);
                transporte.sendMessage(mail, mail.getAllRecipients());
                transporte.close();
                
                System.out.println("Mensaje enviado con exito, revise su "
                        + "bandeja de entrada");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
        

    
        

