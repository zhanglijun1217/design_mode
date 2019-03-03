package decorator.装饰者;

import decorator.主体.Drink;
import decorator.装饰者.中间层.Decorator;

/**
 * Created by zlj on 2019/3/3.
 */
public class Milk extends Decorator {

    public Milk(Drink obj) {
        super(obj);
        super.setDesc("Milk");
        super.setPrice(2.0f);
    }
}
