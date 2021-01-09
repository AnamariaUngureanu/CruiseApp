package com.sda.spring.repositories;

import com.sda.spring.entities.ShipsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipsRepository extends JpaRepository<ShipsEntity, Integer> {
}
