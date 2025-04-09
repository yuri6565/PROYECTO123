package com.proyecto.sistemajoseabel.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class ServicioCorreo {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarCodigoRecuperacion(String correo) {
        String Codigo = generarCodigo();
        String asunto = "Recuperación de contraseña";
        String mensaje = "Tu código de verificación es:" + Codigo; // aquí podrías generar uno

        enviarCorreo(correo, asunto, mensaje); // llamada interna, y válida
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
    int codigo = (int) (Math.random() * 900000) + 100000; // genera del 100000 al 999999
    return String.valueOf(codigo);
}

}


    

