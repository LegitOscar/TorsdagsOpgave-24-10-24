package task3;


import java.util.ArrayList;

public class Student extends Person {


    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    private ArrayList<String> passedCourses;
    private ArrayList<String>  currentCourses;

    @Override
    public boolean addCourse(String course) {

        if(passedCourses.contains(course)){
        return false;
    }
        if(currentCourses.contains(course)){
        currentCourses.add(course);
        return true;
        }
        return false;
    }
}
