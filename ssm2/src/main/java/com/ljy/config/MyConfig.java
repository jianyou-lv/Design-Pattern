package com.ljy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.ljy","com.ljy.mapper"})
public class MyConfig {
}
