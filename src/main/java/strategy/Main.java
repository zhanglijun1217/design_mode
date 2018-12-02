package strategy;

/**
 * 策略模式：分别封装行为接口，实现算法族，超类里放行为接口对象，在子类里具体设定行为对象。
 *      原则就是：分离变化接口，封装接口，基于接口编程各种功能。从模式让行为算法的变化独立于算法的使用者。
 *
 * @author 夸克
 * @date 2018/12/2 18:26
 */
public class Main {

    public static void main(String[] args) {

        /**
         * GreenDuck 和 RedDuck中通过构造函数确定飞行和叫对应的策略实现
         * 分析接口中变化的部分做成策略，这样解耦了飞和叫这两个行为的具体实现，新增加的策略直接去实现策略的接口即可。
         * 也可以将抽象类DUCK中的两个策略接口提供set方法，在外边调用处set进要实现的策略
         *
         * 优化想法 {@link strategy.behavior_strategy.context.StrategyContext}
         * 在一些容器内 其实应该把 子类和要实现的策略放入一个策略字典（context）中，而不是在子类的构造函数中初始化。比如一个map
         * 这样更能去解耦这个策略的变化和具体的调用
         */
        GreenDuck greenDuck = new GreenDuck();
        greenDuck.fly();
        greenDuck.quack();

        System.out.println("==========================");

        RedDuck redDuck = new RedDuck();
        redDuck.fly();
        redDuck.quack();
    }
}
