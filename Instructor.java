package school;

import java.util.Date;

public class Instructor extends Person {

    Lecture lectures;

    public Instructor(int id, String name, Date dateOfBirth, Gender gender, Lecture lectures) {
        super(id, name, dateOfBirth, gender);
        this.lectures = lectures;
    }

}