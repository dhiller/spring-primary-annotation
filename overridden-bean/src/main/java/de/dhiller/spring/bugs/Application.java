package de.dhiller.spring.bugs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(OverridingConfiguration.class);
        MyBean obj = (MyBean) context.getBean("myBean");
        log.info("MyBean is a {}", obj.getClass().getCanonicalName());
    }

}
