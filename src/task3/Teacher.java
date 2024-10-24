package task3;

import java.util.ArrayList;

public class Teacher extends Person {

    public Teacher(String name, ArrayList<String> canTeach) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>();

    }

    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) {

            if (!currentCourses.contains(course)) {
                currentCourses.add(course);
                System.out.println("Teacher IS suitable for the course: ");
                return true;


            }
        }
        System.out.println("Teacher is NOT suitable for the course: ");
return false;
    }
}


