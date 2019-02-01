package com.pdm;

public class Person {

    protected String family;
    protected String name;
    protected String surname;

    public Person (String family, String name, String surname) {
        this.family = family;
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return family + " " + name + " " + surname;
    }
}
