package school;

import java.util.Date;

public class Student extends Person {

    SClass sClass;

    public Student(int id, String name, Date dateOfBirth, Gender gender, SClass sClass) {
        super(id, name, dateOfBirth, gender);
        this.sClass = sClass;
    }

}