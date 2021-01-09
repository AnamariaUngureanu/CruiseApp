package com.sda.spring.repositories;

import com.sda.spring.entities.PortsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortsRepository extends JpaRepository<PortsEntity,Integer> {
}
