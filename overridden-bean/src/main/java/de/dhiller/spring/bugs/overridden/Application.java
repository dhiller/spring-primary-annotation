package de.dhiller.spring.bugs.overridden;

import de.dhiller.spring.bugs.original.MyBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        MyBean obj = context.getBean(MyBean.class);
        log.info("MyBean is a {}", obj.getClass().getCanonicalName());
        if (! obj.getClass().isAssignableFrom(OverridingBean.class))
            throw new IllegalStateException("Not an overriding bean!");
    }

}
