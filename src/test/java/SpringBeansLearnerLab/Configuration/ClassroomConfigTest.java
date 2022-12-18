package SpringBeansLearnerLab.Configuration;

import SpringBeansLearnerLab.models.Classroom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClassroomConfigTest {

    @Autowired
    ClassroomConfig classroomConfig;

    @Test
    void currentCohort() {

    }

    @Test
    void previousCohort() {
    }
}