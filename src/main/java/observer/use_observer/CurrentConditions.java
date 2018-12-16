package observer.use_observer;

import lombok.Data;
import lombok.ToString;

/**
 * 应该去实现观察者接口
 * @author 夸克
 * @date 2018/12/17 00:21
 */
@Data
@ToString
public class CurrentConditions implements Observer{

    private float currentTemperature;

    private float currentPressure;

    private float currentHumidity;

    @Override
    public void update(Float currentTemperature, Float humidity, Float pressure) {
        this.currentHumidity = humidity;
        this.currentPressure = pressure;
        this.currentTemperature = currentTemperature;

        display();
    }

    public void display() {
        System.out.println("*** Today ***" + toString());
    }
}
