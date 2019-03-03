package decorator.主体拓展出的单体.中间层;

import decorator.主体.Drink;

/**
 * 单体的一个中间层，这里实现了cost方法
 *      这里coffee单体 继承了Drink超类，其实cost的计算就是计算他们给price赋值的价格
 *
 *      引入新的单体咖啡时，不会修改之前的单体咖啡代码，只需要继承这个中间层类即可
 *
 * Created by zlj on 2019/3/3.
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
