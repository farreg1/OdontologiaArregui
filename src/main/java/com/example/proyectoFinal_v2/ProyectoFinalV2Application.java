package com.example.proyectoFinal_v2;

import com.example.proyectoFinal_v2.bd.BD;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoFinalV2Application {

	public static void main(String[] args) {
		BD.crearTablas();
		SpringApplication.run(ProyectoFinalV2Application.class, args);
	}

}
