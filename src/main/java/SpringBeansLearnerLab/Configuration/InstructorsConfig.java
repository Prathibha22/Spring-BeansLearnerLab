package SpringBeansLearnerLab.Configuration;

import SpringBeansLearnerLab.models.Instructor;
import SpringBeansLearnerLab.models.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {
    @Bean
    @Primary
    public Instructors instructors(){
        List<Instructor> alInstructors = new ArrayList<>();
        alInstructors.add(new Instructor(1L, "Instructor1"));
        alInstructors.add(new Instructor(2L, "Instructor2"));
        alInstructors.add(new Instructor(3L, "Instructor3"));
        return new Instructors(alInstructors);
    }
    @Bean
    public Instructors tcUsaInstructors(){  List<Instructor> alInstructors = new ArrayList<>();
        alInstructors.add(new Instructor(1L, "UsaInstructor1"));
        alInstructors.add(new Instructor(2L, "UsaInstructor2"));
        return new Instructors(alInstructors);
    }
    @Bean
    public Instructors tcUkInstructors(){
        List<Instructor> alInstructors = new ArrayList<>();
        alInstructors.add(new Instructor(1L, "UkInstructor1"));
        alInstructors.add(new Instructor(2L, "UkInstructor2"));
        alInstructors.add(new Instructor(3L, "UkInstructor3"));
        return new Instructors(alInstructors);
    }
}
