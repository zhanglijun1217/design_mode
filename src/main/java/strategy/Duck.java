package strategy;

import strategy.behavior_strategy.FlyBehavior;
import strategy.behavior_strategy.QuackBehavior;
import strategy.behavior_strategy.context.StrategyContext;

/**
 * @author 夸克
 * @date 2018/12/2 18:04
 */
public abstract class Duck {

    /**
     * 通过接口 注入飞和叫的策略  由子类去实现使用哪个具体的策略
     */
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;



    public Duck() {
        StrategyContext.creator(this);
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swim");
    }
}
