package behavior_parameterized.chapter2_2;

import behavior_parameterized.chapter2_1.Apple;
import behavior_parameterized.chapter2_1.Color;

public class AppleRedAndHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.RED) && apple.getWeight() > 15;
    }
}
