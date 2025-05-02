package com.proyecto.sistemajoseabel;

import com.proyecto.sistemajoseabel.vista.Login11211;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.proyecto.sistemajoseabel")

public class SistemajoseabelApplication1 implements CommandLineRunner {

    @Autowired
    private Login11211 login11211;

    public static void main(String[] args) {
        new SpringApplicationBuilder(SistemajoseabelApplication1.class)
                .web(WebApplicationType.NONE)
                .headless(false)
                .bannerMode(Banner.Mode.OFF)
                .run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        login11211.setVisible(true);  
      
    }
}

