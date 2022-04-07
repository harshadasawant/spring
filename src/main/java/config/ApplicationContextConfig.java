package config;

import bean.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationContextConfig {

    @Bean(name = "bean1")
    public SampleBean getBean()
    {
        return new SampleBean();
    }

}
