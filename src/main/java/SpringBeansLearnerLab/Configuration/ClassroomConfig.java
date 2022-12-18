package SpringBeansLearnerLab.Configuration;

import SpringBeansLearnerLab.models.Classroom;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(){
        return new Classroom(new StudentConfig().currentStudents(), new InstructorsConfig().instructors());
    }
    @Bean
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(){ return new Classroom(new StudentConfig().previousStudents(), new InstructorsConfig().instructors());
    }

}
