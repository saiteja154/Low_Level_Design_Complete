package org.example.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// A simple class that implements Comparable
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement the compareTo method
    @Override
    public int compareTo(Person other) {
        // Compare by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

