package config;

import bean.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationContextConfig {

    @Bean
    public SampleBean getBean()
    {
        return new SampleBean();
    }

}
