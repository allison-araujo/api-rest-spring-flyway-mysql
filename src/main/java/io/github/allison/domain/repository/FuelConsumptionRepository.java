package io.github.allison.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.allison.domain.entity.FuelConsumption;

public interface FuelConsumptionRepository  extends JpaRepository<FuelConsumption, Integer>{
    
}
