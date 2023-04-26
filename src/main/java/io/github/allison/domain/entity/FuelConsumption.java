package io.github.allison.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.var;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_consume")
public class FuelConsumption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;


    private String carrier;


    private Integer capacity;


    private Double liters = 0.0;

    

    public FuelConsumption(String carrier, Integer capacity) {
        this.carrier = carrier;
        this.capacity = capacity;
    }


    public void toFuel(Integer value) {     
        if(value < this.capacity - liters){
            System.out.println(value + " Value is greater than the capacity of the tank");

        }
        this.liters += value;
        System.out.println(value + "Liters Filled");


    }


    public void rotate(Integer km) {
        Double consumerPerKm = 0.3; 
        Double litersUsed = km * consumerPerKm;
        if (this.liters == 0) {
            System.out.println("Not Fuel Available");
            return;
        }
               
        
        if (litersUsed <= this.liters) {
            this.liters -= litersUsed;
            System.out.println(litersUsed + " Liters Used!");
        } else {
            System.out.println("Not Fuels Available!");
        }
    }



}
