package io.github.allison.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.github.allison.domain.entity.FuelConsumption;
import io.github.allison.domain.repository.FuelConsumptionRepository;



@RestController
@RequestMapping("/v1/consumption")
public class FuelController {

    @Autowired
    private final FuelConsumptionRepository repository;

    public FuelController(FuelConsumptionRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<FuelConsumption> getConsume(FuelConsumption fuelConsumption){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FuelConsumption save(@RequestBody FuelConsumption fuelConsumption){          
        
        return repository.save(fuelConsumption);

    }


    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id){
        repository.findById(id)
            .map(fuel -> {
                repository.delete(fuel);
                return fuel;
            }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Not exists Consume Serial" ));
        
    }


    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@PathVariable Integer id, @RequestBody FuelConsumption fuelConsumption){
        repository
            .findById(id)
            .map(existsConsume -> {
                fuelConsumption.setId(existsConsume.getId());
                repository.save(fuelConsumption);
                return existsConsume;
            }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Carrier not Exists;"));
    }

 
    
}
