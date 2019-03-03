package decorator.装饰者;

import decorator.主体.Drink;
import decorator.装饰者.中间层.Decorator;

/**
 * 单个继承装饰者的调料类
 * 要在构造函数中将装饰的对象 设置进去
 *
 * Created by zlj on 2019/3/3.
 */
public class Chocolate extends Decorator {

     public Chocolate(Drink obj) {
         super(obj);
         super.setDesc("Chocolate");
         super.setPrice(1.0f);
     }
}
