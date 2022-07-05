package by.itstep.vikvik.javalessons.lesson22.controller;

import by.itstep.vikvik.javalessons.lesson22.model.entity.Student;

public class Task02 {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 4, true);
        student.setMark(8);
        System.out.println(student.getInfo());

        student.setMark(20);
        System.out.println(student.getInfo());

        student.setMark(-50);
        System.out.println(student.getInfo());
    }
}
