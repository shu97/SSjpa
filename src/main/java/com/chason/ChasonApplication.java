package com.chason;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

/**
 * Created by yangyibo on 17/1/17.
 */


@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages ={"com.chason"})
public class ChasonApplication {
		public static void main(String[] args) {
		ConfigurableApplicationContext run = run(ChasonApplication.class, args);
	}

}