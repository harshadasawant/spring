package config;

import bean.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @Scope(value = "prototype")
    public SampleBean getBean()
    {
        return new SampleBean();
    }

}
