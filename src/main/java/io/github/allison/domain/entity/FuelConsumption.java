package io.github.allison.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_fuelconsumption")
public class FuelConsumption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "carrier")   
    private String carrier;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "liters")

    private Double litersAvailable = 0.0;

    

    public FuelConsumption(String carrier, Integer capacity) {
        this.carrier = carrier;
        this.capacity = capacity;
    }


    public void toFuel(Integer value) {     
        if(value < this.capacity - litersAvailable){
            System.out.println(value + " Value is greater than the capacity of the tank");

        }
        this.litersAvailable += value;
        System.out.println(value + "Liters Filled");


    }


    public void rotate(Integer km) {
        var consumerPerKm = 0.3; 
        var litersUsed = km * consumerPerKm;
        if (this.litersAvailable == 0) {
            System.out.println("Not Fuel Available");
            return;
        }
               
        
        if (litersUsed <= this.litersAvailable) {
            this.litersAvailable -= litersUsed;
            System.out.println(litersUsed + " Liters Used!");
        } else {
            System.out.println("Not Fuels Available!");
        }
    }
    

      
}
