package org.amrendra;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.amrendra")
@PropertySource("classpath:/config/application.properties")
public class Config {
}
