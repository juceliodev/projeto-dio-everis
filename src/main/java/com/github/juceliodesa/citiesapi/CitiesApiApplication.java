package com.github.juceliodesa.citiesapi;

import com.github.juceliodesa.citiesapi.cities.CityRepository;
import com.github.juceliodesa.citiesapi.distances.service.DistanceResource;
import com.github.juceliodesa.citiesapi.distances.service.DistanceService;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CitiesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitiesApiApplication.class, args);


	}


}
