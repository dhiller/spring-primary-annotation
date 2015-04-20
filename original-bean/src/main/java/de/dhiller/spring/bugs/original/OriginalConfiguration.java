package de.dhiller.spring.bugs.original;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("de.dhiller.spring.bugs.original")
public class OriginalConfiguration {

    @Bean(name = "bean")
    public MyBean originalBean() {
        return new OriginalBean();
    }

}
