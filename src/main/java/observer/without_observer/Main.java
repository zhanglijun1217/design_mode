package observer.without_observer;

/**
 * @author 夸克
 * @date 2018/12/11 00:57
 */
public class Main {

    public static void main(String[] args) {

        // 新建一个 当天天气的公告板
        CurrentConditions currentConditions = new CurrentConditions();

        WeatherData weatherData = new WeatherData(currentConditions);

        // 模拟气象变化
        weatherData.setData(300f, 100f, 22f);

        // 再次变化
        weatherData.setData(200f, 111f, 222f);

        /**
         * 但是可以想到这种方式是只有一种当天天气的公告板
         * 但是如果有很多公告板 再接入的时候就要在WeatherData中定义这个公告板，在changeData中调用update
         * 扩展性很差
         *
         * 要用观察值模式去增强这个demo的观察者，把变得部分做抽象和接口设计
         * 看use_observer package
         */

    }
}
