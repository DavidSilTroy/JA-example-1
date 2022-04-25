package com.example.examplemvc2.model;

public class Dish {

    private String name;
    private int calories;
    private boolean vegetarian;

    public Dish(String name, int calories, boolean vegetarian) {
        this.name = name;
        this.calories = calories;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
}

