package de.dhiller.spring.bugs.original;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("de.dhiller.spring.bugs.original")
public class OriginalConfiguration {

    @Bean
    public MyBean originalBean() {
        return new OriginalBean();
    }
    
    @Bean
    public MyBean originalBean2() {
        return new OriginalBean();
    }
    
    @Bean
    public MyBean originalBean3() {
        return new OriginalBean();
    }

}
