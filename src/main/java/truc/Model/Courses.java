package truc.Model;

import java.util.ArrayList;

public class Courses {

    public static ArrayList<String> courses;

    public Courses() {
        courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }
}
