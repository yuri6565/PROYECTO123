package com.proyecto.sistemajoseabel.ContextoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ContextoSpring1 implements ApplicationContextAware {

    private static ApplicationContext contexto;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        contexto = applicationContext;
    }

    public static ApplicationContext getContexto() {
        return contexto;
    }
    
    @Bean
    public boolean someBoolean() {
        return true;  // O el valor que necesites
    }
}