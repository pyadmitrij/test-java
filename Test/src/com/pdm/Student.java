package com.pdm;

public class Student extends Person {

    private int height;
    private int punctual; // from 1 to 10;
    private int friendly; // from 1 to 10;
    private String missing;
    private float rating; // (punctual + friendly) / 2;

    public Student(String family, String name, String surname, int height) {
        super(family, name, surname);
        this.height = height;
    }


    public int getPunctual() {
        return punctual;
    }

    public int getFriendly() {
        return friendly;
    }

    public float getRating() {
        return rating;
    }

    public void setPunctual(int punctual) {
        this.punctual = punctual;
    }

    public void setFriendly(int friendly) {
        this.friendly = friendly;
    }

    public String getMissing() {
        return missing;
    }

    public void setMissing(String missing) {
        this.missing = missing;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
