package strategy;

import strategy.behavior_strategy.impl.GagaQuackBehavior;
import strategy.behavior_strategy.impl.GoodFlyBehavior;

/**
 * @author 夸克
 * @date 2018/12/2 18:22
 */
public class GreenDuck extends Duck {

    // 在构造函数中初始化父类中飞和叫 behavior
    public GreenDuck() {
        // 父类构造函数中可以通过context设置对应的策略
        super();
//        flyBehavior = new GoodFlyBehavior();
//        quackBehavior = new GagaQuackBehavior();
    }

}
