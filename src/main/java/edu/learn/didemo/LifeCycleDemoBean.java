package edu.learn.didemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Slf4j
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        log.info("## I'm in the LifeCycleBean Constructor");
    }

    @Override
    public void setBeanName(String name) {
        log.info("## My Bean Name is : " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("## Bean Factory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("## Application context has been set");
    }

    public void beforeInit() {
        log.info("## - Before Init - Called by Been Post Processor");
    }

    @PostConstruct
    public void postConstruct() {
        log.info("## The Post Construct annotated method has benn called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("## The LifeCycle bean has its Properties Set");
    }

    public void afterInit() {
        log.info("## - After Init - Called by Bean Post Processor");
    }

    @Override
    public void destroy() throws Exception {
        log.info("## The LifeCycle bean has its been terminated");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("## The Predestroy annotated method has been called");
    }


}
