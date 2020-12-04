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

/**
 *
 * @author Fabricio
 */
public class ConsultasRegistrosAdmin {
    public modelo.Usuario.Empleado emple;
    public ArrayList <Usuario> empleados;
    public ArrayList<Veterinaria> veterinarias;
    public ArrayList<GastosVeterinaria> gastosdeVeterinarias;
    
    public boolean agregarEmpleado(Usuario usu){
        for (int i= 0;i<empleados.size();i++){
            String s=usu.usuario;
            Usuario sus=empleados.get(i);           
            if (s==sus.usuario){
                empleados.add(usu);
                return true;
            }else{
                System.out.println("el usuario ya existe pruebe con otro ");
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
        for (Animal ani: emple.animales){
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
