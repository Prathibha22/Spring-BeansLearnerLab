package SpringBeansLearnerLab.models;

import java.util.List;

public class Instructors extends People<Instructor>{
    public Instructors(List<Instructor> personList) {
        super(personList);
    }
}