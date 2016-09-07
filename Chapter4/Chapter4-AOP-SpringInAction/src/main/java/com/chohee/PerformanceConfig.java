package com.chohee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Chohee on 9/6/16.
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class PerformanceConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Concert concert() {
        return new Concert();
    }

    @Bean
    public Movie movie() {
        return new Movie();
    }

    @Bean
    public StagePlay stagePlay() {
        return new StagePlay();
    }

}
