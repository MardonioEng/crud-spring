package com.mardonio;

import com.mardonio.model.Course;
import com.mardonio.repositoy.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final CourseRepository courseRepository;

    public MyRunner(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        courseRepository.deleteAll();

        Course c = new Course();
        c.setName("Angular com Spring");
        c.setCategory("front-ent");

        courseRepository.save(c);
    }
}
