package daily.tools.abstract_template;

/**
 * 业务处理方法
 *
 * @author 夸克
 * @date 2019/1/23 19:43
 */
public interface DomainProcessor<T> {

    /**
     * 处理业务的方法 返回值现在是void的 也可以自己定义一个通用的类似于上下文的返回值
     *
     * @param context
     */
    void process(T context);
}
