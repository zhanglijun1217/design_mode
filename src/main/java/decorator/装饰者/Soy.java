package decorator.装饰者;

import decorator.主体.Drink;
import decorator.装饰者.中间层.Decorator;

/**
 * Created by zlj on 2019/3/3.
 */
public class Soy extends Decorator {

    public Soy(Drink obj) {

        super(obj);
        super.setDesc("Soy");
        super.setPrice(3.0f);

    }
}
