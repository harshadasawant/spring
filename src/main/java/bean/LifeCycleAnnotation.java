package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleAnnotation {
    @Autowired(required = false)
    AutoClass autoClass;

    @PostConstruct
    public void init() {
        System.out.println("Inside init() method...");
       if(autoClass != null)  autoClass.setId(20);
    }

    @PreDestroy
    public void destroy() {
        System.out.println(autoClass!= null ? autoClass.getId():"");
        System.out.println("Inside destroy() method...");

    }
}
