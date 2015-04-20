package de.dhiller.spring.bugs.overridden;

import de.dhiller.spring.bugs.original.MyBean;
import de.dhiller.spring.bugs.original.OriginalBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class OverridingConfiguration {

    @Bean
    @Primary
    public MyBean overridingBean() {
        return new OverridingBean();
    }
    
    @Bean
    public MyBean overridingBean2() {
        return new OriginalBean();
    }

}
