package com.company;
public class Human {
    int Age, Weight, Height;
    String Name;
    boolean Male;

    public int getAge() {
        return Age;
    }

    public int getWeight() {
        return Weight;
    }

    public int getHeight() {
        return Height;
    }

    public String getName() {
        return Name;
    }

    public boolean isMale() {
        return Male;
    }

    public Human(int age, int weight, int height, String name, boolean male) {
        Age = age;
        Weight = weight;
        Height = height;
        Name = name;
        Male = male;
    }
}
