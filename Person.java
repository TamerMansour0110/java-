package school;

import java.util.Date;

public class Person {
    enum Gender {
        Male , Female , Other
    }

    private int id;
    private String name;
    private Date dateOfBirth;
    private Gender gender;



    /**
     *
     * @param id
     * @param name
     * @param dateOfBirth
     * @param gender
     */
    public Person(int id, String name, Date dateOfBirth,  Gender gender) {

        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }
}