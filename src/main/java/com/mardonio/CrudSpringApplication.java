package com.mardonio;

import com.mardonio.model.Course;
import com.mardonio.repositoy.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication{

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

}
