package ru.sofronov.springtest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan ("ru.sofronov.springtest")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

	
	
}
