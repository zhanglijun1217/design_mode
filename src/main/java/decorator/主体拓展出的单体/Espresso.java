package decorator.主体拓展出的单体;

import decorator.主体拓展出的单体.中间层.Coffee;

/**
 * Created by zlj on 2019/3/3.
 * 一种单体咖啡
 */
public class Espresso extends Coffee {

    public Espresso() {

        super.setDesc("Espresso");
        super.setPrice(2.0f);
    }
}
