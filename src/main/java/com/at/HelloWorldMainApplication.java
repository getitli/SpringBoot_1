package com.at;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * SpringBootApplication 来标注一个主程序类，说明这是一个spring boot应用
 * @author 木兮
 *
 */
@SpringBootApplication
public class HelloWorldMainApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldMainApplication.class, args);
	}
}
