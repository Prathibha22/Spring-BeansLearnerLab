package SpringBeansLearnerLab.Configuration;

import SpringBeansLearnerLab.models.Classroom;
import SpringBeansLearnerLab.models.Student;
import SpringBeansLearnerLab.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class StudentConfig {

    @Bean(name = "students")  //Bean will have name "students"
    public Students currentStudents(){
        ArrayList<Student> alStudents=new ArrayList<Student>();
        alStudents.add(new Student(1,"Prathibha"));
        alStudents.add(new Student(2,"Prathibha2"));
        alStudents.add(new Student(3,"Prathibha3"));
        alStudents.add(new Student(4,"Prathibha4"));
        alStudents.add(new Student(5,"Prathibha5"));

        return new Students(alStudents);
    }
    @Bean       //Bean will have name "previousStudents"
    public Students previousStudents(){
        ArrayList<Student> alStudents=new ArrayList<Student>();
        alStudents.add(new Student(1,"PreviousPrathibha"));
        alStudents.add(new Student(2,"PreviousPrathibha2"));
        alStudents.add(new Student(3,"PreviousPrathibha3"));

        return new Students(alStudents);}
}
