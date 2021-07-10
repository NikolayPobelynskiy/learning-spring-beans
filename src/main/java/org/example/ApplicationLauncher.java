package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationLauncher {
    public static void main(String[] args) {
        useBeanExample();
        createBeanUsingAnnotation();
    }

    /**
     * Ручное создание бина из xml
     */
    private static void useBeanExample() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FirstBean beanExample = context.getBean("firstBeanId", FirstBean.class);
        System.out.println(beanExample.getConstructorArg());
        System.out.println(beanExample.getTextField());
        context.close();
    }

    /**
     * Создание бина используя аннотацию
     */
    private static void createBeanUsingAnnotation() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SecondBean secondBeanExample = context.getBean("secondBeanId", SecondBean.class);
        // secondBeanExample.setTextField("Second Bean Text Field");
        System.out.println(secondBeanExample.getTextField());
        context.close();
    }
}
