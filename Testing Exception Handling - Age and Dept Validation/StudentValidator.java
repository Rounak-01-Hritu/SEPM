package com.student.validate;

public class StudentValidator {

    public void validateAge(int age) throws AgeException {
        if (age < 18 || age > 30) {
            throw new AgeException("Invalid Age! Age must be between 18 to 30.");
        }
    }

    public void validateDept(String dept) throws DeptException {
        if (!(dept.equalsIgnoreCase("CSE") ||
                dept.equalsIgnoreCase("IT") ||
                dept.equalsIgnoreCase("EEE"))) {

            throw new DeptException("Invalid Department! Allowed: CSE, IT, EEE");
        }
    }
}
