package daily.tools.abstract_template;

import daily.tools.exception.BizException;

/**
 * 抽象业务方法执行 操作模板方法定义在其中 子类实现biz和其中的方法即可
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
     * 业务处理
     * @param context
     */
    protected abstract void bizHandle(T context);

    /**
     * 后置处理
     *
     * @param context
     */
    protected void postHandle(T context) {
    }

    /**
     * last 操作
     * @param context
     */
    protected void finallyHandle(T context) {
    }

    /**
     * 异常处理
     *
     * @param context
     * @param e
     */
    protected void exceptionHandle(T context, Exception e) {
        // TODO 打印error或者warn级别日志
        throw new BizException(e.getMessage(), e);
    }

    @Override
    public void process(T context) {
        /**
         * 编排流程
         */
        try {
            if (!preHandle(context)) {
//                log.warn("处理器前置处理失败，退出。context:{}", context);
                return;
            }
            // 业务方法
            bizHandle(context);
            // 后置操作
            postHandle(context);
        } catch (Exception e) {
            exceptionHandle(context, e);
        } finally {
            finallyHandle(context);
        }
    }

}
