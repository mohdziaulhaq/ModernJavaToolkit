package data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    public static List<Student> getStudents() {

        Student student1 = new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "soccer"));
        Student student2 = new Student("Emily", 3, 3.9, "female", Arrays.asList("reading", "chess", "volleyball"));
        Student student3 = new Student("John", 3, 2.8, "male", Arrays.asList("video games", "running"));
        Student student4 = new Student("Sophia", 4, 3.5, "female", Arrays.asList("ballet", "painting", "cycling"));
        Student student5 = new Student("Mike", 4, 3.0, "male", Arrays.asList("football", "gaming"));
        Student student6 = new Student("Olivia", 3, 3.7, "female", Arrays.asList("writing", "music", "yoga"));
        Student student7 = new Student("Ethan", 2, 2.5, "male", Arrays.asList("skateboarding", "math club"));
        Student student8 = new Student("Ava", 4, 4.0, "female", Arrays.asList("robotics", "debate", "reading"));
        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6,student7,student8);
        return students;

    }
}
