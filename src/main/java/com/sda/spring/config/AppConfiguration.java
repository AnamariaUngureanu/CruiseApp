package com.sda.spring.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication//ne spune ca este o app spring
@ComponentScan("com.sda.spring")//ii spunem unde trb sa caute componentele
@Import({DbConfiguration.class})//ii spunem ce alte cls de configurare sa citeasca la pornire
public class AppConfiguration {
}
