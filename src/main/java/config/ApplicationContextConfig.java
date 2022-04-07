package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig {

    @Bean(name="nameTest")
    public String ByNameTest() {
       return "byName";
    }
}
