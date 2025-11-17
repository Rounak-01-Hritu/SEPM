package com.student.main;

import com.student.validate.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentValidator validator = new StudentValidator();

        try {

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            validator.validateAge(age);

            sc.nextLine(); // clear buffer

            System.out.print("Enter Department (CSE/IT/EEE): ");
            String dept = sc.nextLine();
            validator.validateDept(dept);

            System.out.println("Validation Successful! Student Accepted.");

        } catch (AgeException ae) {
            System.out.println("AGE ERROR: " + ae.getMessage());

        } catch (DeptException de) {
            System.out.println("DEPARTMENT ERROR: " + de.getMessage());
        }
    }
}
