package de.dhiller.spring.bugs;

import de.dhiller.spring.bugs.original_bean.OriginalBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("de.dhiller.spring.bugs")
public class OriginalConfiguration {

    private MyBean myBean = new OriginalBean();

    @Bean(name = "myBean")
    public MyBean bean() {
        return myBean;
    }

}
