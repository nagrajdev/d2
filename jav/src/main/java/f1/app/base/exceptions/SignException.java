package f1.app.base.exceptions;

import f1.app.base.constant.Code;

public class SignException extends BaseException {
    public SignException(Code code, String msg) {
        super(code, msg);
    }
}
