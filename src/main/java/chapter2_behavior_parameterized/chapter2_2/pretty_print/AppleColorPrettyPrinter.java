package chapter2_behavior_parameterized.chapter2_2.pretty_print;

import chapter2_behavior_parameterized.chapter2_1.Apple;

public class AppleColorPrettyPrinter implements ApplePrettyPrinter{
    @Override
    public String prettyPrint(Apple apple) {
        StringBuilder builder = new StringBuilder();
        builder.append("Color of the apple : ");
        builder.append(apple.getColor().name());
        builder.append(" wow!!");
        return builder.toString();
    }
}
