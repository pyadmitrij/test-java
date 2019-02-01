package com.pdm;

import java.util.Comparator;
import java.util.List;

public class Group {

    private String name;
    private List<Student> students;
    private String leaderGroup;

    public Group(String name) {
        this.name = name;
    }

    public void sortListStudents(){
        students.sort(Comparator.comparing(Student::getFamily));
    }

    public void setPunctual() {
        int a = 1, b = 10;
        for (Student student : students) {
            int random = a + (int) (Math.random() * b);
            student.setPunctual(random);
        }
    }

    public void setFriendly() {
        int a = 1, b = 10;
        for (Student student : students) {
            int random = a + (int) (Math.random() * b);
            student.setFriendly(random);
        }
    }

    public void setRating () {
        for (Student student: students) {
            student.setRating((student.getFriendly() + student.getPunctual()) / 2f);
        }
    }

    public void selectLeaderGroup() {
        float max = 0;
        for (Student student : students) {
            if(student.getRating() > max) {
                max = student.getRating();
                leaderGroup = student.toString();
            }
        }
    }

    public void setIsMissing() {
        int a = 1, b = 2;
        for (Student student : students) {
            int random = a + (int) ( Math.random() * b );
            if(random == 1) student.setMissing(" - missing");
            else student.setMissing(" - present");
        }
    }

    public void printListGroup() {
        for (Student list: students) {
            System.out.println(list.toString() +" - rating: "+ list.getRating());
        }
    }

    public void printNameLeader () {
        System.out.println("Leader group '" + name + "' : " + leaderGroup +"\n");
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "There is group name: '" + name + "'";
    }
}
