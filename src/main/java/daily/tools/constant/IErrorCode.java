package daily.tools.constant;

/**
 * 错误设计通用接口
 *
 * @author 夸克
 * @date 2019/1/24 00:28
 */
public interface IErrorCode {
    /**
     * 错误码
     *
     * @return
     */
    public int getCode();

    /**
     * 错误消息
     *
     * @return
     */
    public String getMessage();
}
