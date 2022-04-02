package com.register.university.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.register.university")
@PropertySource({"classpath:application.properties"})
public class AppConfig {


}
