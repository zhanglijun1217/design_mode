package 日常记录.工具代码.abstract_template;

/**
 * 抽象业务方法执行 操作模板方法定义在其中
 *
 * @author 夸克
 * @date 2019/1/23 19:46
 */
public abstract class AbstractProocessor<T> implements DomainProcessor<T> {

    /**
     * 前置处理 主要做一些校验逻辑 编排的时候放在前边
     *
     * @param context
     * @return
     */
    protected boolean preHandle(T context){
        return true;
    }

    /**
     * 后置处理
     *
     * @param context
     */
    protected void postHandle(T context) {
    }

    /**
     * 异常处理
     *
     * @param context
     * @param e
     */
    protected void exceptionHandle(T context, Exception e) {
        // TODO 封装业务异常
    }

}
