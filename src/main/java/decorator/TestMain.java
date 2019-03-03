package decorator;

import decorator.主体.Drink;
import decorator.主体拓展出的单体.Espresso;
import decorator.主体拓展出的单体.LongBlack;
import decorator.装饰者.Chocolate;
import decorator.装饰者.Milk;
import decorator.装饰者.Soy;

/**
 * Created by zlj on 2019/3/3.
 */
public class TestMain {

    public static void main(String[] args) {

        /**
         * 只是点了一个单体咖啡
         */
        Drink order1;
        order1 = new Espresso();

        System.out.println(order1.getDesc());

        System.out.println("*******************************");


        /**
         * 点有调料的咖啡
         */
        Drink order2;

        // 先是一杯单体咖啡
        order2 = new LongBlack();
        // 加牛奶
        order2 = new Milk(order2);
        // 加巧克力
        order2 = new Chocolate(order2);
        // 加盐
        order2 = new Soy(order2);

        System.out.println(order2.getDesc() + "总共钱： " + order2.cost());
        
    }
}
