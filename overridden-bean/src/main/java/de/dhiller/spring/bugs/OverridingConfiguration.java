package de.dhiller.spring.bugs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("de.dhiller.spring.bugs")
public class OverridingConfiguration {

    @Autowired
    private MyBean myBean;

    @Primary
    @Bean(name="myBean")
    public MyBean myBean() {
        return myBean;
    }

}
