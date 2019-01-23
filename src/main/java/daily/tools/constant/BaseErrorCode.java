package daily.tools.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 基础错误码
 *
 * @author 夸克
 * @date 2019/1/24 00:32
 */
@AllArgsConstructor
public enum BaseErrorCode implements ErrorCode {
    /**
     *
     */
    PARAM_ERROR(1000, "请求参数校验错误", false),
    BIZ_ERROR(2000, "业务逻辑错误", false),
    INFRA_ERROR(3000, "基础设施(数据库，缓存，消息等)错误", true),
    SYS_ERROR(4000, "未知的其它系统错误", true)
    ;

    /**
     * errorCode
     */
    private int errCode;
    /**
     * error描述
     */
    private String errDesc;
    /**
     * 是否重试
     */
    @Getter
    private boolean retry;

    @Override
    public int getCode() {
        return this.errCode;
    }

    @Override
    public String getMessage() {
        return this.errDesc;
    }
}
