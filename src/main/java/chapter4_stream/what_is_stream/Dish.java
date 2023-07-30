package chapter4_stream.what_is_stream;

import java.util.Objects;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dish{" +
            "name='" + name + '\'' +
            ", vegetarian=" + vegetarian +
            ", calories=" + calories +
            ", type=" + type +
            '}';
    }

    public enum Type {
        MEAT,
        OTHER,
        FISH;
    }
}
