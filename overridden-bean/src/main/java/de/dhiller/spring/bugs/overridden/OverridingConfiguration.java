package de.dhiller.spring.bugs.overridden;

import de.dhiller.spring.bugs.original.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class OverridingConfiguration {

    @Bean(name = "bean")
    @Primary
    public MyBean overridingBean() {
        return new OverridingBean();
    }

}
