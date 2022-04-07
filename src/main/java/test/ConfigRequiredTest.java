package test;

import bean.SampleBean;
import config.ApplicationContextConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigRequiredTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ApplicationContextConfig.class);
        ctx.refresh();

        SampleBean bean1 = ctx.getBean(SampleBean.class);
        System.out.println(bean1.hashCode());

        SampleBean bean2 = ctx.getBean(SampleBean.class);
        System.out.println(bean2.hashCode());
        ctx.close();

    }
}
