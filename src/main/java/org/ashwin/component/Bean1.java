package org.ashwin.component;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

//Using javax.annotation.api  @PostConstruct and @PreDestroy - recommended 1
@Data
@Component(value = "bean1")
@Scope("prototype")
public class Bean1 implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {

    private String name;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext:: Bean1 :: Definition Names= "
                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("setBeanName:: Bean1 Name defined in context= "
                + beanName);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory::  Bean1 singleton= "
                + beanFactory.isSingleton("bean1"));
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("Bean1 Post Construct Annotation Method ");
        this.name = "bean1";
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean1 Pre Destroy Annotation Method");
    }
}
