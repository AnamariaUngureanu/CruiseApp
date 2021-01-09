package com.sda.spring.repositories;

import com.sda.spring.entities.ItineraryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItineraryRepository extends JpaRepository<ItineraryEntity,Integer> {
}
