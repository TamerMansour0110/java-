package school;

import java.util.ArrayList;

public class Table {

    private int id;
    private ArrayList<Lecture> lectures;
    private SClass sClass;
    private int arraylecture;

    public Table(int id, SClass sClass) {

        this.id = id;
        this.sClass = sClass;

        lectures = new ArrayList<Lecture>();
        arraylecture = 0;
    }

    public void addLectures(Lecture lecTures) {
        lectures.add(lecTures);
    }

    public int getId() {
        return id;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public SClass getSClass() {
        return sClass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLectures(ArrayList<Lecture> lecture) {
        this.lectures = lecture;
    }

    public void setSClass(SClass sClass) {
        this.sClass = sClass;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", lectures=" + lectures +
                ", sClass=" + sClass +
                ", arraylecture=" + arraylecture +
                '}';
    }
}