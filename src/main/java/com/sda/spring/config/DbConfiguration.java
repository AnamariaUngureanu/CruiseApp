package com.sda.spring.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.sda.spring.entities")//ii spunem unde gaseste entity
@EnableJpaRepositories("com.sda.spring.repositories")//ii spunem unde gaseste repositories
public class DbConfiguration {
}
