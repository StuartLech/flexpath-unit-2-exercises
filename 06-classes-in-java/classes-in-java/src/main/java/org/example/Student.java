package org.example;

/**
 * Student class to represent a student
 */
public class Student {
    private String firstName;
    private String lastName;
    private int classNumber;
    private String className;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(String firstName, String lastName, int classNumber, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classNumber = classNumber;
        this.className = className;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + classNumber + " - " + className + ")";
    }
}
