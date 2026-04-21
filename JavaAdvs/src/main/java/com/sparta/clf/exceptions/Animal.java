package com.sparta.clf.exceptions;

import java.util.Date;

public class Animal {
    private String name;
    private int age;
    private Date vaccinationDate;

    public Animal() {}

    public Animal(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setAge(int newAge) {
        if (newAge >= 0) {
            age = newAge;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", vaccinationDate=" + vaccinationDate +
                '}';
}
}
