package strategy.behavior_strategy.impl;

import strategy.behavior_strategy.FlyBehavior;

/**
 * @author 夸克
 * @date 2018/12/2 18:11
 */
public class GoodFlyBehavior implements FlyBehavior {

    public void fly() {
        System.out.println("good fly");
    }
}
