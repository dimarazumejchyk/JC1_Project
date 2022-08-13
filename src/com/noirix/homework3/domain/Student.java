package com.noirix.homework3.domain;

public class Student implements Comparable<Student> {
    private int number;
    private  String name;
    private  String lastName;

    public Student() {
    }

    public Student(int number, String name, String lastName) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName(String s) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName(String s) {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (number != student.number) return false;
        if (!name.equals(student.name)) return false;
        return lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        int result = number;
        result = 31 * result + name.hashCode();
        result = 31 * result + lastName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getNumber() - o.getNumber();
    }
}
