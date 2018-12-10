package observer.without_observer;

import lombok.ToString;

/**
 * 模拟一个当天的看板 里面的数据
 * 这样要建立更新关系，就只能去在weatherData中定义一个这样的字段
 *
 * @author 夸克
 * @date 2018/12/10 23:16
 */
@ToString
public class CurrentConditions {

    private float currentTemperature;

    private float currentPressure;

    private float currentHumidity;

    /**
     * 进行更新看板中的数据 并且打印
     * @param currentTemperature
     * @param currentPressure
     * @param currentHumidity
     */
    public void update(float currentTemperature, float currentPressure, float currentHumidity) {
        this.currentTemperature = currentTemperature;
        this.currentPressure = currentPressure;
        this.currentHumidity = currentHumidity;

        display();

    }

    public void display() {
        System.out.println("*** Today ***" + toString());
    }

}
