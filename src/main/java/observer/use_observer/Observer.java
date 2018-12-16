package observer.use_observer;

/**
 * 观察者接口
 *      要有update方法更新观察者自身的数据
 * @author 夸克
 * @date 2018/12/16 23:55
 */
public interface Observer {

    void update(Float currentTemperature, Float humidity, Float pressure);
}
