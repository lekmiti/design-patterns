package com.lekmiti.designpatterns.builder;

import java.util.List;

public class Student {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private List<String> courses;
    private String email;
    private String level;

    private Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.address = studentBuilder.address;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.age = studentBuilder.age;
        this.courses = studentBuilder.courses;
        this.level = studentBuilder.level;
        this.email = studentBuilder.email;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(id)
                .append(',')
                .append(firstName)
                .append(',')
                .append(lastName)
                .append(',')
                .append(age)
                .append(',')
                .append(address)
                .append(',')
                .append(email)
                .append(',')
                .append(courses)
                .append(',')
                .append(level)
                .toString();
    }

     public static class StudentBuilder {
        private Long id;
        private String firstName;
        private String lastName;
        private int age;
        private String address;
        private List<String> courses;
        private String level;
        private String email;

        public StudentBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public StudentBuilder setLevel(String level) {
            this.level = level;
            return this;
        }
        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setCourses(List<String> courses) {
            this.courses = courses;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

}
