package com.tht;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*开启组件扫描和自动配置，融合了@configuration、@ComponentScan、@EnableAutoConfiguration*/
@SpringBootApplication
public class ModelAndAlgrithmApplication {

	public static void main(String[] args) {
		/*负责启动引导应用程序*/
		SpringApplication.run(ModelAndAlgrithmApplication.class, args);
	}
}
