package org.ashwin;

import org.ashwin.component.Bean1;
import org.ashwin.component.Bean2;
import org.ashwin.component.Bean3;
import org.ashwin.config.MyConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Bean1 bean1 = context.getBean(Bean1.class);
        System.out.println(bean1.getName());

        Bean1 bean11 = context.getBean(Bean1.class);
        System.out.println(bean11.getName());

        Bean2 bean2 = context.getBean(Bean2.class);
        System.out.println(bean2.getName());

        Bean3 bean3 = context.getBean(Bean3.class);
        System.out.println(bean3.getName());

        ((AbstractApplicationContext) context).registerShutdownHook();

    }
}