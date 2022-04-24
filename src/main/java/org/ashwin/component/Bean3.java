package org.ashwin.component;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;

//Using Spring InitializingBean and DisposableBean Interfaces - not recommended
@Data
@Component(value = "bean3")
public class Bean3 implements InitializingBean, DisposableBean {

    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean3 After Properties Set Method ");
        this.name = "bean3";
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean3 Disposable Bean Destroy Method ");
    }
}
