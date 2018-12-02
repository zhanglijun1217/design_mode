package strategy;

import strategy.behavior_strategy.impl.BadFlyBehavior;
import strategy.behavior_strategy.impl.GegeQuackBehavior;

/**
 * @author 夸克
 * @date 2018/12/2 18:23
 */
public class RedDuck extends Duck{

    // 在构造函数中初始化父类中飞和叫 behavior
    public RedDuck() {
        // 父类构造函数中可以通过context设置对应的策略
        super();
//        flyBehavior = new BadFlyBehavior();
//        quackBehavior = new GegeQuackBehavior();
    }
}
