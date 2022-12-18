package SpringBeansLearnerLab.Configuration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class InstructorsConfigTest {
    @Autowired
    InstructorsConfig instructorsConfig;
    @Test
    void instructors() {
        assertEquals(instructorsConfig.instructors().size(), 3);
    }

    @Test
    void tcUsaInstructors() {
        assertEquals(instructorsConfig.tcUsaInstructors().size(), 2);
    }

    @Test
    void tcUkInstructors() {
        assertEquals(instructorsConfig.tcUkInstructors().size(), 3);
    }
}