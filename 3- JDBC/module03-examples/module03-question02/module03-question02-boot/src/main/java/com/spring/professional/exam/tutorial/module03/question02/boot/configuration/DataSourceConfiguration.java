package com.spring.professional.exam.tutorial.module03.question02.boot.configuration;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    @Bean
    public DataSource dataSource() {
        HikariDataSource basicDataSource = new HikariDataSource();
        basicDataSource.setJdbcUrl("jdbc:mysql://localhost:3306/bookshop?useSSL=false");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("foo123123");
        basicDataSource.setMinimumIdle(30);
        return basicDataSource;
    }
}
