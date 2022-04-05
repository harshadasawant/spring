package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import bean.Student;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Student sobj= (Student) ctx.getBean("st");

        System.out.println(sobj.getId());
        System.out.println(sobj.getName());

    }
}
