package bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleAnnotation {
    @PostConstruct
    public void init() {
        System.out.println("Inside init() method...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Inside destroy() method...");

    }
}
