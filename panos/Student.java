package panos;

import java.util.ArrayList;
import java.util.List;

public class Student {
    final private String name;
    final private List<String> courses;

    public Student(String name, List<String> courses){
        this.name = name;
        this.courses = new ArrayList<>(courses);
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return courses;
    }

    @Override
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
