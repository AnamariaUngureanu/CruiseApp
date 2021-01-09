package com.sda.spring.repositories;

import com.sda.spring.entities.SalesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesRepository extends JpaRepository<SalesEntity,Integer> {
}
