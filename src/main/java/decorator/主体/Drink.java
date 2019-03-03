package decorator.主体;

import lombok.Getter;
import lombok.Setter;

/**
 * 装饰者模式：动态的将新功能附加到对象上，在对象扩展方面，它比继承更有弹性
 *      咖啡和调料这么一个项目
 *      饮料作为装饰者模式的一个主体 定义一些饮料都有的方法 同时主体也要作为变量在装饰者中定义，装饰者也要继承主体
 *
 *      Drink是一个超类
 * @author 夸克
 * @date 2019/3/2 17:53
 */
@Setter
public abstract class Drink {

    private String desc;

    @Getter
    private float price=0f;


    public String getDesc() {
        return desc + "-" + this.getPrice();
    }

    /**
     * 供子类去实现计算价格的方法
     * @return
     */
    public abstract float cost();
}
