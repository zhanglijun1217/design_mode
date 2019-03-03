package decorator.主体拓展出的单体;

import decorator.主体拓展出的单体.中间层.Coffee;

/**
 * Created by zlj on 2019/3/3.
 * 一种单体咖啡
 */
public class Decaf extends Coffee {

    public Decaf() {
        super.setDesc("Decaf");
        super.setPrice(4.0f);
    }
}
