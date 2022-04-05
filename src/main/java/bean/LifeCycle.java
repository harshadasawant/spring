package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class LifeCycle implements InitializingBean,  DisposableBean, BeanPostProcessor {

    public LifeCycle(){
        System.out.println("from constructor");
    }
    @Override
    // It is the init() method
    public void afterPropertiesSet()
            throws Exception
    {
        System.out.println(
                "After Properties Set");
    }

    @Override
    // This method is invoked just after the container is closed
    public void destroy() throws Exception
    {
        System.out.println(
                "Container has been closed and I'm the destroy() method");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {

//        System.out.println("BeforeInitialization : " + beanName);
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {

//        System.out.println("AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}