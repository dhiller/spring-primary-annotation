package de.dhiller.spring.bugs;

import de.dhiller.spring.bugs.overriding_bean.OverridingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("de.dhiller.spring.bugs")
public class OverridingConfiguration {

    private MyBean myBean = new OverridingBean();

    @Primary
    @Bean(name = "myBean")
    public MyBean myBean() {
        return myBean;
    }

}
