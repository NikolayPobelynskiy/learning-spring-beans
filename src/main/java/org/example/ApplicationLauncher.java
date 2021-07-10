package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationLauncher {
    public static void main(String[] args) {
        useBeanExample();
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
}
