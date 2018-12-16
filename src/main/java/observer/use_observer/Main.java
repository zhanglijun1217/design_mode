package observer.use_observer;

import java.util.ArrayList;

/**
 * 使用观察者模式增强扩展性的demo
 *      观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为subject，依赖的对象为Observer，Subject通知Observer变化。拥有比较强的拓展性
 *
 *
 * @author 夸克
 * @date 2018/12/11 01:02
 */
public class Main {

    public static void main(String[] args) {

        // 两个气象看板 去 订阅天气的变化
        Observer cuerrent = new CurrentConditions();
        Observer forcast = new ForcastConditions();

        // 两个观察者订阅主题
        WeatherData weatherData = new WeatherData();

        ArrayList<Observer> list = new ArrayList<Observer>(){{
            add(cuerrent);
            add(forcast);
        }};
        weatherData.setObserverArrayList(list);

        // 模拟天气变化
        System.out.println("=============天气变化1=============");
        weatherData.dataChange(111f, 222f, 333f);
        System.out.println("=============天气变化2=============");
        weatherData.dataChange(333f, 444f, 555f);

        System.out.println("=============添加一个观察者=============");
        weatherData.registerObserver(new ForcastConditions());

        // 再次模拟天气变化
        weatherData.dataChange(555f, 666f, 777f);
    }
}
