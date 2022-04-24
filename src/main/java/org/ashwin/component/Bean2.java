package org.ashwin.component;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

//@Bean definition in configuration class - recommended 2
@Data
public class Bean2 {

    private String name;

    public void init() {
        System.out.println("Spring @Bean Initialization Method Call - Bean2");
        this.name = "bean2";
    }
    public void destroy() {
        System.out.println("Spring @Bean Destroy Method - Bean2");
    }
}
