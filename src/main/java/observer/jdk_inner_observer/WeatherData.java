package observer.jdk_inner_observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.Observable;

/**
 * 使用java内置的观察者模式去做
 *   因为java内置的Observer 参数是一个Object arg 所以这里要把数据作为内部类封装一下
 *
 * @author 夸克
 * @date 2018/12/17 01:08
 */
@Data
public class WeatherData extends Observable {

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

    private void dataChange() {
        // 使用jdk内置Subject 即Observable类，通知观察者们的时候要
        super.setChanged();
        super.notifyObservers(new Data(getTemperature(), getHumidity(), getPressure()));
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

    /**
     * 通知观察者的数据类 这里要是适配JDK内置的Observer接口中的update方法
     */
    @AllArgsConstructor
    @Getter
    public class Data{
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


}
