package com.example.mapstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class MapstructDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructDemoApplication.class, args);
    }

}
