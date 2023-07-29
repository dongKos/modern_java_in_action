package chapter2_behavior_parameterized.chapter2_1;

import java.util.Objects;

public class Apple {
    private Color color;
    private int weight;

    public Apple() {}

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
            "color=" + color +
            ", weight=" + weight +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return weight == apple.weight && color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight);
    }
}
