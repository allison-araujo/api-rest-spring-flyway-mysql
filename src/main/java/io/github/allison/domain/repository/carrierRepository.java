package io.github.allison.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.allison.domain.entity.Carrier;

public interface carrierRepository extends JpaRepository<Carrier, Integer> {
    

}
