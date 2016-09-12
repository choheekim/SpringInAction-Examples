package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.context.annotation.ComponentScan.*;

/**
 * Created by Chohee on 9/11/16.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"spittr"}, excludeFilters ={@Filter(type = FilterType.ANNOTATION, value= EnableWebMvc.class)})
public class RootConfig {
}
