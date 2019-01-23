package daily.tools.constant;

/**
 * ErrorCode接口
 *
 * @author 夸克
 * @date 2019/1/24 00:33
 */
public interface ErrorCode extends IErrorCode {

    default boolean isRetry() {
        return false;
    }
}
