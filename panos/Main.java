package panos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> my_classes = new ArrayList<String>();
        my_classes.add("math");
        my_classes.add("ai");
        Student s1 = new Student("Panos",my_classes);
        my_classes.add("rdfsdkfhs");


        System.out.println(s1);


    }
}