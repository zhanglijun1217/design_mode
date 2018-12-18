package observer.jdk_inner_observer;

import lombok.Data;
import lombok.ToString;

import java.util.Observable;
import java.util.Observer;

/**
 * @author 夸克
 * @date 2018/12/19 01:10
 */
@Data
@ToString
public class ForcastConditions implements Observer {

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

    @Override
    public void update(Observable o, Object arg) {
        WeatherData.Data data = (WeatherData.Data) arg;

        setTemperature(data.getTemperature());
        setHumidity(data.getHumidity());
        setPressure(data.getPressure());

        display();
    }

    public void display() {
        System.out.println("*** forcast ***" + toString());
    }
}
