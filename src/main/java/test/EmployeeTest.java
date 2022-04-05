package test;

import bean.Employee;
import bean.EmployeeWithSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
        Employee s=(Employee)ctx.getBean("emp");
        s.show();

        EmployeeWithSetter s1=(EmployeeWithSetter) ctx.getBean("emp1");
        s1.show();
    }
}
