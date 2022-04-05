package test;

import bean.Employee;
import bean.LifeCycle;
import bean.LifeCycleAnnotation;
import bean.LifeCycleXml;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
    public static void main(String[] args) {
        AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        LifeCycleXml lifeCyclexml = (LifeCycleXml) ctx.getBean("lifeCycleXml");
        LifeCycle lifeCycle = (LifeCycle) ctx.getBean("lifeCycle");
        LifeCycleAnnotation lifeCycleAnnotation = (LifeCycleAnnotation) ctx.getBean("lifeCycleAnnotation");


        ctx.registerShutdownHook();


    }
}
