package daily.tools.exception;

import daily.tools.constant.BaseErrorCode;
import daily.tools.constant.IErrorCode;

/**
 * 业务异常
 *
 * @author 夸克
 * @date 2019/1/24 00:23
 */
public class BizException extends DesignModelException {

    public BizException(String errMessage) {
        super(errMessage);
        this.setErrCode(BaseErrorCode.BIZ_ERROR);
    }

    public BizException(IErrorCode errCode, String errMessage) {
        super(errMessage);
        this.setErrCode(errCode);
    }

    public BizException(String errMessage, Throwable e) {
        super(errMessage, e);
        this.setErrCode(BaseErrorCode.BIZ_ERROR);
    }

}
