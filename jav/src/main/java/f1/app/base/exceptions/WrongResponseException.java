package f1.app.base.exceptions;

import f1.app.base.constant.Code;

public class WrongResponseException extends BaseException {
    public WrongResponseException(Code code, String msg) {
        super(code, msg);
    }
}
