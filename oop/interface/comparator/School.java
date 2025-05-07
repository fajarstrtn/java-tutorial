
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jamie Lucas", 15),
                new Student("Ashley Young", 11),
                new Student("Oscar Milano", 10),
                new Student("Aurelia Bradford", 12),
                new Student("Sammy Sochin", 13)
        );

        iterate("Before sorting by roll number: ", students);

        // Sort student by roll number using SortByRoll Comparator.
        Collections.sort(students, new SortByRoll());

        iterate("After sorting by roll number: ", students);
    }

    private static void iterate(String message, List<Student> students) {
        System.out.println(message);

        for (var student : students) {
            System.out.println(student.toString());
        }
    }

}

class Student {

    private String name;
    private int rollNumber;

    public Student() {
    }

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return name + ": " + rollNumber;
    }

}

class SortByRoll implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRollNumber() - s2.getRollNumber();
    }

}
