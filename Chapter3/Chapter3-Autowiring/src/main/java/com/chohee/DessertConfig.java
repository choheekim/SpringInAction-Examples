package com.chohee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Chohee on 8/28/16.
 */

@Configuration
@ComponentScan
public class DessertConfig {

   @Bean
    public DessertShop dessertShop() {
       return new DessertShop();
   }

}
