package test;

import bean.Singleton;
import bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Singleton sobj= (Singleton) ctx.getBean("single");
        sobj.msg();
    }
}
