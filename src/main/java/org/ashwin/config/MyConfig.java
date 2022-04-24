package org.ashwin.config;

import org.ashwin.component.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.ashwin")
public class MyConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bean2 getBean2() {
        return new Bean2();
    }
}
