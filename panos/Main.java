package panos;

import java.util.ArrayList;
import java.util.List;


//KEY LESSON
/*
1. Remove Setters
2. Add all args constructor to the class
3. Mark class as final to prevent inheritance
4. Initialize all non-primitive mutable fields via constructor ONLY by performing deep copy(!!!)
5. For all non-primitive mutable fields getter methods, perform cloning
6. Mark all class attributes as final (optional, be careful)
        */




public class Main {
    public static void main(String[] args) {


        List<String> my_classes = new ArrayList<String>();
        my_classes.add("math");
        my_classes.add("ai");
        MasterStudent m1 = new MasterStudent("ALex", new ArrayList<>(my_classes));
        System.out.println(m1.getCourses());






//        System.out.println(s1);


    }
}