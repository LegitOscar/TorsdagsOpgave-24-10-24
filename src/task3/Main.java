package task3;

import java.util.ArrayList;
/* Jeg prøvede virkelig at arbejde med det her og måtte også te til chatGPT i enden,
men kan simpelthen ikke finde ud af hvorfor den kommer tilbage som false.....
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> passedCourses1 = new ArrayList<>();
        passedCourses1.add("Java");
        passedCourses1.add("C#");
        passedCourses1.add("Python");
        passedCourses1.add("C++");

        ArrayList<String> currentCourses1 = new ArrayList<>();

        Student student1 = new Student("Bobby", passedCourses1, currentCourses1);

        ArrayList<String> passedCourses2 = new ArrayList<>();

        passedCourses2.add("Java Expanded");
        passedCourses2.add("C#####");
        passedCourses2.add("Pythons (There are many)");
        passedCourses2.add("C+++++-+-+-+");

        ArrayList<String> currentCourses2 = new ArrayList<>();

        Student student2 = new Student("Jimmson", passedCourses2, currentCourses2);

        ArrayList<String> canTeach1 = new ArrayList<>();
        canTeach1.add("Java");
        canTeach1.add("C#");


        ArrayList<String> teaching1 = new ArrayList<>();

        Teacher teacher1 = new Teacher("Miss.Thompson", canTeach1);

        ArrayList<String> canTeach2 = new ArrayList<>();
        canTeach2.add("Java Expanded");
        canTeach2.add("C#####");
        canTeach2.add("Pythons (There are many)");


        Teacher teacher2 = new Teacher("Mr.Knowledge", canTeach2);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);

        System.out.println("Bobby is " + student1.addCourse("Java Expanded")); // true
        System.out.println("Jimmson is " + student2.addCourse("Java Expanded")); // false, da kurset allerede er bestået

        System.out.println("Miss.Thompson is " + teacher1.addCourse("Java")); // true
        System.out.println("Mr.Knowledge is " + teacher2.addCourse("Python")); // false, da han ikke kan undervise det
    }

    }

