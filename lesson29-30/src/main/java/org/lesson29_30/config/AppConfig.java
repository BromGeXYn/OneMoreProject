package org.lesson29_30.config;

import org.lesson29_30.Crew;
import org.lesson29_30.Horse;
import org.lesson29_30.Rider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    Horse horse1() {
        return new Horse("horse1");
    }
    @Bean
    Horse horse2() {
        return new Horse("horse2");
    }
    @Bean
    Horse horse3() {
        return new Horse("horse3");
    }
    @Bean
    Rider rider1() {
        return new Rider("rider1");
    }
    @Bean
    Rider rider2() {
        return new Rider("rider2");
    }
    @Bean
    Rider rider3() {
        return new Rider("rider3");
    }
    @Bean
    Crew crew1 () {
        return new Crew("crew1", rider1(), horse1());
    }
    @Bean
    Crew crew2 () {
        return new Crew("crew2", rider2(), horse2());
    }
    @Bean
    Crew crew3 () {
        return new Crew("crew3", rider3(), horse3());
    }

}
