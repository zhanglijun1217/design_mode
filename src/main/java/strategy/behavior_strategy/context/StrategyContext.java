package strategy.behavior_strategy.context;

import strategy.Duck;
import strategy.GreenDuck;
import strategy.RedDuck;
import strategy.behavior_strategy.FlyBehavior;
import strategy.behavior_strategy.QuackBehavior;
import strategy.behavior_strategy.impl.BadFlyBehavior;
import strategy.behavior_strategy.impl.GagaQuackBehavior;
import strategy.behavior_strategy.impl.GegeQuackBehavior;
import strategy.behavior_strategy.impl.GoodFlyBehavior;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 *
 * @author 夸克
 * @date 2018/12/2 18:37
 */
public class StrategyContext {

    /**
     * 定义两个策略字典
     * 根据class 对应 fly和quack的策略
     */

    static Map<Class<? extends Duck>, FlyBehavior> flyBehaviorMap = new HashMap<Class<? extends Duck>, FlyBehavior>(){{
        put(GreenDuck.class, new GoodFlyBehavior());
        put(RedDuck.class, new BadFlyBehavior());
    }};

    static Map<Class<? extends Duck>, QuackBehavior> quackBehaviorMap = new HashMap<Class<? extends Duck>, QuackBehavior>() {{
        put(GreenDuck.class, new GegeQuackBehavior());
        put(RedDuck.class, new GagaQuackBehavior());
    }};

    /**
     * 从字典中拿对应的策略
     * @param duck
     */
    public static void creator(Duck duck) {
        duck.flyBehavior = flyBehaviorMap.get(duck.getClass());
        duck.quackBehavior = quackBehaviorMap.get(duck.getClass());
    }
}
