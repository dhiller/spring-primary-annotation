package de.dhiller.spring.bugs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("de.dhiller.spring.bugs")
public class OriginalConfiguration {

    @Autowired
    private MyBean myBean;

    @Bean(name = "bean")
    public MyBean bean() {
        return myBean;
    }

}
