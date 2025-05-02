package com.proyecto.sistemajoseabel.Servicios;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ServicioCorreo {

    @Autowired
    private JavaMailSender mailSender;
 private Map<String, String> codigosRecuperacion = new HashMap<>();
public boolean enviarCodigoRecuperacion(String correo) {
 try {
        String Codigo = generarCodigo();
        codigosRecuperacion.put(correo, Codigo);

        String asunto = "Recuperación de contraseña";
        String mensaje = "Tu código de verificación es: " + Codigo;
        enviarCorreo(correo, asunto, mensaje); 

        return true; 
    } catch (Exception e) {
        e.printStackTrace();
        return false; 
    }
}


    public void enviarCorreo(String para, String asunto, String mensaje) {
        SimpleMailMessage correoMensaje = new SimpleMailMessage();
        correoMensaje.setTo(para);
        correoMensaje.setSubject(asunto);
        correoMensaje.setText(mensaje);
        correoMensaje.setFrom("carpinteriajoseabel2025@gmail.com");

        mailSender.send(correoMensaje);
    }
    
    public String generarCodigo() {
    int codigo = (int) (Math.random() * 900000) + 100000;
    return String.valueOf(codigo);
}
       public boolean verificarCodigo(String correo, String codigoIngresado) {
        String codigoGuardado = codigosRecuperacion.get(correo);
        return codigoGuardado != null && codigoGuardado.equals(codigoIngresado);
    }
    
  

}


    

