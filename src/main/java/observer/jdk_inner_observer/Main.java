package observer.jdk_inner_observer;

/**
 * 利用java内置的观察者模式接口去写气象站和看板这个项目
 *
 * @author 夸克
 * @date 2018/12/17 01:08
 */
public class Main {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        // 两个观察者，使用java内置观察者模式 通知顺序和注册顺序是相反的
        CurrentConditions currentConditions = new CurrentConditions();
        weatherData.addObserver(currentConditions);
        weatherData.addObserver(new ForcastConditions());

        // 这时模拟气候变动
        weatherData.setData(111f, 222f, 333f);

        System.out.println("移除一个观察者");

        // 移除一个观察者 注意这里要将上面同一个观察者对象 作为移除参数
        weatherData.deleteObserver(currentConditions);
        weatherData.setData(444f, 555f, 666f);
    }


}
