package com.example.project;

public class Horse  {
    private String name;
    private int weight;

    public Horse(String name1, int weight1) {
        name = name1;
        weight = weight1;
    }

    /** @return the horse's name */
    public String getName() {
        return name;
    }

    /** @return the horse's weight */
    public int getWeight() {
        return weight;
    }

    /** @return a printable String of the Horse -> name: Cathy weight: 1500*/
    public String horseInfo() {
        return "name: " + name + ", weight: " + weight;
    }
}

