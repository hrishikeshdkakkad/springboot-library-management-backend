package com.app.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackageClasses = BookController.class)
public class LibraryApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class,args);
	}

}
