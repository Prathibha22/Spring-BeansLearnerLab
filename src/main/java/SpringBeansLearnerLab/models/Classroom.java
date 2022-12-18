package SpringBeansLearnerLab.models;

import SpringBeansLearnerLab.interfaces.Teacher;

public class Classroom {
    Students students;
    Instructors instructors;

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }
    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(this.students,numberOfHours);

    }
}
