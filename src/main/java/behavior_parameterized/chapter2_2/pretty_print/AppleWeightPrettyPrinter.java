package behavior_parameterized.chapter2_2.pretty_print;

import behavior_parameterized.chapter2_1.Apple;

public class AppleWeightPrettyPrinter implements ApplePrettyPrinter{
    @Override
    public String prettyPrint(Apple apple) {
        String 무게 = "light";
        if (apple.getWeight() > 15) {
            무게 = "heavy";
        }
        return 무게 + " apple!";
    }
}
