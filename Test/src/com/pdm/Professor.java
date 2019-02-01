package com.pdm;

import java.util.List;

public class Professor extends Person {

    private String nameSubject;

    public Professor (String family, String name, String surname, String nameSubject) {
        super(family, name, surname);
        this.nameSubject = nameSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void printHello() {
        System.out.println("Hello! My name " + this.toString());
        System.out.println("I am professor of " + nameSubject + "\n");
    }

    public void callOver(List<Student> students) {
        System.out.println("Call-over!\n");
        for (Student student : students) {
            System.out.println(student.toString() + student.getMissing());
        }
    }

}
