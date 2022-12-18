package SpringBeansLearnerLab.Configuration;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
//@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {
    @Autowired
    StudentConfig studentConfig;

    @Test
    @Qualifier("students")
    void currentStudents() {
        assertEquals(studentConfig.currentStudents().size(), 5);
    }

    @Test
    @Qualifier("previousStudents")
    void previousStudents() {
        assertEquals(studentConfig.previousStudents().size(), 3);
    }
}