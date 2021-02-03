package school;

import java.util.Date;

public class SchoolTest {

    public static void main(String args[]) {
        Date date = new Date(45 , 11 ,5);
        Person p = new Person(100, "Jack", date, Person.Gender.Male);
        Date Date = new Date(101 , 05 , 5);
        Admin a = new Admin(101, "John", Date, Person.Gender.Male);
Period period = new Period(Period.Day.Thursday,Period.Time.FORTH);
        SClass sClass = new SClass(123, 20, "Daisy");
        Date DaTe = new Date(99 , 3 , 4);
        Student student = new Student(102, "Riya", DaTe, Person.Gender.Female, sClass);

        Book book = new Book(101014, "Basic of AI", "W.R. William", 500, 1989);

        Lecture lecture = new Lecture(11114, "Henry", sClass, book, period );
        Date DatE = new Date(80 , 05 , 6);
        Instructor instructor = new Instructor(103, "Marie", DatE, Person.Gender.Female, lecture);

        Table table = new Table(1001, sClass);

        System.out.println("\n" + p.toString());
        System.out.println("\n" + student.toString());
        System.out.println("\n" + instructor.toString());
        System.out.println("\n" + table.toString());
        System.out.println("\n" + book.toString());
        System.out.println("\n" + table.toString() + "\n");
        System.out.println("\n\n\n\n"+ lecture.getPeriods().getDay() +" "+ lecture.getPeriods().getTime().startTheClassFirstTime(period.getTime()) +" / "+lecture.getPeriods().getTime().endTheClassFirstTime(lecture.getPeriods().getTime())+"\n");
        sClass.addTable(table);
        sClass.addStudent(student);
        sClass.addBook(book);
        table.addLectures(lecture);

        System.out.println();

    }
}
