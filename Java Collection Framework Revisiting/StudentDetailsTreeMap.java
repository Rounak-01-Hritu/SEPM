// StudentDetailsTreeMap.java
// Stores student ID mapped to student details using TreeMap

import java.util.*;

class Student {
    String name;
    String dept;
    double cgpa;

    Student(String n, String d, double c) {
        name = n;
        dept = d;
        cgpa = c;
    }

    public String toString() {
        return name + " (" + dept + ", CGPA: " + cgpa + ")";
    }
}

public class StudentDetailsTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, Student> map = new TreeMap<>();

        map.put(101, new Student("Rounak", "CSE", 3.85));
        map.put(102, new Student("Hritu", "IT", 3.92));
        map.put(103, new Student("Siam", "EEE", 3.75));

        System.out.println("Student Details (Sorted by ID):");
        for (Map.Entry<Integer, Student> e : map.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }
    }
}
