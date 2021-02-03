package school;

public class Lecture {
   /* public enum period{
        sunday,Monday,tuesday,Wednesday,Thursday

    }
    enum timePeriods{
        am_8,am_9,am_10,am_11,pm_12,pm_1,pm_2
    }*/

    private int id;
    private String name;
    private SClass sClass;
    private Book book;
    private Period periods;
    //private timePeriods timePeriods;

    public Lecture(int id, String name, SClass sClass, Book book, Period periods) {

        this.id = id;
        this.name = name;
        this.sClass = sClass;
        this.book = book;
        this.periods = periods;
        //this.timePeriods=timePeriods ;
    }

    public int getId() {
        return id;
    }

    public Period getPeriods() {
        return periods;
    }


    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeriods(Period periods) {
        this.periods = periods;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sClass=" + sClass +
                ", book=" + book +
                ", periods=" + periods.getDay()+periods.getTime() +
                '}';
    }
}



