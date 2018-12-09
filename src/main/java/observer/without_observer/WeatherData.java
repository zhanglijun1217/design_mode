package observer.without_observer;

import lombok.Getter;
import lombok.Setter;

/**
 *  不使用观察者模式 实现气象站和气象看板
 *      多个气象看板的数据依赖气象站
 *
 * @author 夸克
 * @date 2018/12/10 00:39
 */
@Getter
@Setter
public class WeatherData {

    /**
     * 温度
     */
    private float temperature;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 气压
     */
    private float pressure;

}
