package observer.use_observer;

/**
 * 观察值们 订阅的主题接口
 * @author 夸克
 * @date 2018/12/16 23:55
 */
public interface Subject {

    /**
     * 观察者订阅接口
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者方法
     * @param observer
     */
    void removerObserver(Observer observer);

    /**
     * 通知所有的观察者方法
     */
    void notifyObservers();
}
