package observer.use_observer;

import lombok.Data;
import lombok.ToString;

/**
 * @author 夸克
 * @date 2018/12/17 00:24
 */
@Data
@ToString
public class ForcastConditions implements Observer {
    private float currentTemperature;

    private float currentPressure;

    private float currentHumidity;

    @Override
    public void update(Float temperature, Float humidity, Float pressure) {
        this.currentHumidity = humidity;
        this.currentPressure = pressure;
        this.currentTemperature = temperature;

        display();
    }

    public void display() {
        System.out.println("*** Forcast ***" + toString());
    }

}
