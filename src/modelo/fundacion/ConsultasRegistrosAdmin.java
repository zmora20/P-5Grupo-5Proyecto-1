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
    
    public ConsultasRegistrosAdmin(){
     empleados=new ArrayList<>();
     veterinarias=new ArrayList<>();
     gastosdeVeterinarias=new ArrayList<>();
     personas=new ArrayList<>();
     animal=new ArrayList<>();
     inicializarDatos();
             
    }
    
            
            
    public void inicializarDatos(){
    LocalDate fecha=LocalDate.now(); 
   
     Animal pe = new Perro(fecha,"toby","poodle",Sexo.MACHO,12,1.45,
                "blanco",Size.PEQUENIO);
     animal.add(pe);
    Animal g = new Gato(fecha,"toby","poodle",Sexo.MACHO,12,1.45,
                "gris");
    animal.add(g);
    Usuario emp =new Empleado("Zaida","Norte",1,
            "sara12mora@gmail.com",fecha,  54.78,"zmo","123");
    empleados.add(emp);
    Usuario admi=new Administrador("Fabricio","Sur",054,
            "fquimis@espol.edu.ec",fecha,46.75,"frq","123",456);
    empleados.add(admi);
    
    Veterinaria vet=new Veterinaria("CaTDog",456,"zmora@espol.edu.ec");
    veterinarias.add(vet);
    PersonaAdopta per1=new PersonaAdopta("Leon", "096478","Centro","06313", 
            "lvargas@espol.edu.ec", "gato,10 años");
     personas.add(per1);
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
    public void enviarCorreo(PersonaAdopta per ){
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "mail.gmail.com");
	properties.put("mail.smtp.starttls.enable", "true");
	properties.put("mail.smtp.port",25);
	properties.put("mail.smtp.mail.sender","emisor@gmail.com");
	properties.put("mail.smtp.user", "usuario");
	properties.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties);
        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress((String)properties.get
                ("mail.smtp.mail.sender")));
            message.addRecipient(Message.RecipientType.TO, 
                    new InternetAddress("receptor@gmail.com"));
            message.setSubject("Prueba");
            message.setText("Texto");
            Transport t = session.getTransport("smtp");
            t.connect((String)properties.get("mail.smtp.user"), "password");
            t.sendMessage(message, message.getAllRecipients());
            t.close();
        }catch (MessagingException me){
            //Aqui se deberia o mostrar un mensaje de error o en lugar
            //de no hacer nada con la excepcion, lanzarla para que el modulo
            //superior la capture y avise al usuario con un popup, por ejemplo.
            return;
	}
        
    }
       
    
}
