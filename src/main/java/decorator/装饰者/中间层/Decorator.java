package decorator.装饰者.中间层;

import decorator.主体.Drink;

/**
 * 装饰者的一个中间层 其实就是装饰者类  这里装饰的是主体咖啡， 而继承装饰者的都是咖啡中的调料
 *
 *      1. 装饰者类是要继承主体类
 *      2. 装饰者可以直接装饰主体，也可以是已经被装饰者包装过的，就是多个调料
 *      3. 装饰者要定义一个主体变量在其中
 *
 * 当要拓展 一个新的装饰者时，直接继承装饰者中间层类即可。
 * Created by zlj on 2019/3/3.
 */
public class Decorator extends Drink {

    /**
     * 被装饰的主体变量
     */
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    /**
     * 这里也去实现cost方法，因为本身装饰者也是有价格的
     * 这里的obj.cost() 如果obj是一个被装饰过的类，这里会进行递归计算
     * @return
     */
    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDesc() {

        return super.getDesc() + "&&" + obj.getDesc();
    }
}
