package com.pdm;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> listStudents1 = new ArrayList<>();
        Group groupA = new Group("A");

        Person professor = new Professor("Makarov", "Yuriy", "Viktorovich", "History");

        Person student0 = new Student("Piasetskyi", "Dmutro", "Mikolaiyovich", 173);
        Person student1 = new Student("Musienko", "Roman", "Stepanovich", 168);
        Person student2 = new Student("Karbovskiy", "Sergiy", "Volodumerovich", 178);
        Person student3 = new Student("Boykov", "Volodumer", "Sergiyovich", 175);
        Person student4 = new Student("Golub", "Leonid", "Vasulyovich", 172);
        Person student5 = new Student("Dyachuk", "Ivanna", "Vasulivna", 169);

        listStudents1.add((Student) student0);
        listStudents1.add((Student) student1);
        listStudents1.add((Student) student2);
        listStudents1.add((Student) student3);
        listStudents1.add((Student) student4);
        listStudents1.add((Student) student5);

        ((Professor) professor).printHello();
        groupA.setStudents(listStudents1);
        System.out.println(groupA.toString());
        groupA.sortListStudents();
        groupA.setFriendly();
        groupA.setPunctual();
        groupA.setRating();
        groupA.printListGroup();
        groupA.selectLeaderGroup();
        System.out.println();
        groupA.printNameLeader();
        groupA.setIsMissing();

        ((Professor) professor).callOver(listStudents1);

    }
}


