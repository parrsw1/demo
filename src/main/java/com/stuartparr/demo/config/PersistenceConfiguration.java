package com.stuartparr.demo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
//    @Bean
//    public DataSource dataSource(){
//        DataSourceBuilder builder = DataSourceBuilder.create();
//        builder.url("jdbc:postgresql://192.168.99.100:5432/conference_app");
//        builder.username("postgres");
//        builder.password("Welcome");
//
//        System.out.println("custom datasource bean has been initialized and set");
//        return builder.build();
//    }
}
