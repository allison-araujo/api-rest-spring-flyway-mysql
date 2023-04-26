package io.github.allison;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.allison.domain.entity.FuelConsumption;

@SpringBootApplication
public  class FuelconsumptionApplication {


	public static void main(String[] args) {
		SpringApplication.run(FuelconsumptionApplication.class, args);

	


			FuelConsumption carOne = new FuelConsumption("Mario", 50);
			FuelConsumption carsThow = new FuelConsumption("Jose", 55);
			FuelConsumption carTree = new FuelConsumption("Matheus", 60);
			carOne.toFuel(30);
			carOne.rotate(200);
			System.out.println(carOne.getId() + "\n O carro de número de série " + carOne.getLiters() + " litros disponíveis.\n");

			carsThow.toFuel(40);
			carsThow.rotate(300);
			System.out.println("\n O carro de número de série " + carsThow.getLiters() + " litros disponíveis.\n");

			carTree.toFuel(50);
			carTree.rotate(400);
			System.out.println(carTree.getLiters() + "\n litros disponíveis\n");




	}

}
