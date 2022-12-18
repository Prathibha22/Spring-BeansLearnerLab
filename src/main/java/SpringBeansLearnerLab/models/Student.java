package SpringBeansLearnerLab.models;

import SpringBeansLearnerLab.interfaces.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;
    public Student(long id, String name) {
        super(id, name);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {totalStudyTime=numberOfHours;}
}
