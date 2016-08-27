package com.chohee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Chohee on 8/26/16.
 */

@Configuration
//@ComponentScan allows Spring to scan automatically the same package to see if there is any @component
public class CDPlayerConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPepeers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
