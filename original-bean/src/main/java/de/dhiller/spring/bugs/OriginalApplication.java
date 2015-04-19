package de.dhiller.spring.bugs;

import de.dhiller.spring.bugs.original_bean.OriginalBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OriginalApplication {

    private static final Logger log = LoggerFactory.getLogger(OriginalApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(OriginalConfiguration.class);
        MyBean obj = (MyBean) context.getBean("myBean");
        log.info("MyBean is a {}", obj.getClass().getCanonicalName());
        if (! obj.getClass().isAssignableFrom(OriginalBean.class))
            throw new IllegalStateException("Not an original bean!");
    }

}
