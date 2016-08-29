package com.chohee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

/**
 * Created by Chohee on 8/28/16.
 */

@Configuration
@PropertySource("app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public CompactDisc disc() {
        System.out.println(env.getProperty("disc.title") + " " +  env.getProperty("disc.artist"));
        return new BlankDisc( env.getProperty("disc.title"), env.getProperty("disc.artist"));
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
