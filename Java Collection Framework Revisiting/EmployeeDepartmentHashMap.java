// EmployeeDepartmentHashMap.java
// Uses HashMap to store employee ID to department mapping

import java.util.*;

public class EmployeeDepartmentHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> empDept = new HashMap<>();

        empDept.put(1001, "HR");
        empDept.put(1002, "Finance");
        empDept.put(1003, "IT");
        empDept.put(1004, "Marketing");

        System.out.println("Employee Department Mapping:");
        for (Map.Entry<Integer, String> e : empDept.entrySet()) {
            System.out.println("ID: " + e.getKey() + " → " + e.getValue());
        }
    }
}
