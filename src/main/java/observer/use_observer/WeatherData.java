package observer.use_observer;

import lombok.Data;

import java.util.ArrayList;

/**
 * @author 夸克
 * @date 2018/12/17 00:25
 */
@Data
public class WeatherData implements Subject {

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

    /**
     * 观察者集合
     */
    private ArrayList<Observer> observerArrayList;

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        if (observerArrayList.contains(observer)) {
            observerArrayList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        // 这里的通知 参数是写死的三个 拓展性较差
            // java内置的观察者中有拓展参数 动态去取的

        // 循环观察者去更新
        observerArrayList.forEach(e -> e.update(getTemperature(), getHumidity(), getPressure()));
    }

    /**
     * 模拟参数的变化
     */
    public void dataChange(float temperature, float humidity, float pressure) {
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);

        // 这里去通知所有的观察者即可
        notifyObservers();

    }
}
