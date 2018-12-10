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

    // 定义进来模拟的当天的看板 在构造函数中进行初始化
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    private void dataChange() {
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    /**
     * 模拟数据变化过程
     */
    public void setData(float temperature, float pressure, float humidity) {
        setTemperature(temperature);
        setPressure(pressure);
        setHumidity(humidity);

        dataChange();
    }

}
