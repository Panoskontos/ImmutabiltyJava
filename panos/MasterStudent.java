package panos;

import java.util.List;

public class MasterStudent extends Student{
    public MasterStudent(String name, List<String> courses) {
        super(name, courses);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public List<String> getCourses() {
        return super.getCourses();
    }
}
