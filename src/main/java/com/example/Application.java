package com.example;

import io.micronaut.context.ApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = ApplicationContext.run();
        BeanWithConstructor beanWithConstructor = context.getBean(BeanWithConstructor.class);
        beanWithConstructor.printThis();
        BeanWithConstructorByLombok beanWithConstructorByLombok = context.getBean(BeanWithConstructorByLombok.class);
        beanWithConstructorByLombok.printThis();
    }
}
