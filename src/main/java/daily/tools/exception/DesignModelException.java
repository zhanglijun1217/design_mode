package daily.tools.exception;

import daily.tools.constant.BaseErrorCode;
import daily.tools.constant.IErrorCode;
import lombok.Getter;
import lombok.Setter;

/**
 * designMode异常 抽象类 供子类实现
 *
 * @author 夸克
 * @date 2019/1/24 00:30
 */
public abstract class DesignModelException extends RuntimeException{

    /**
     * errorCode
     */
    @Getter
    @Setter
    protected IErrorCode errCode;

    public DesignModelException(String errMessage) {
        super(errMessage);
        this.errCode = BaseErrorCode.SYS_ERROR;
    }

    public DesignModelException(String errMessage, Throwable e) {
        super(errMessage, e);
        this.errCode = BaseErrorCode.SYS_ERROR;
    }
}
