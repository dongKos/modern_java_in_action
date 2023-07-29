package behavior_parameterized.chapter2_2;

import behavior_parameterized.chapter2_1.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 15;
    }
}
