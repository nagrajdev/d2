package f1.app.base.exceptions;

import f1.app.base.constant.Code;

public class InvokeException extends BaseException {
    public InvokeException(Code code, String msg) {
        super(code, msg);
    }
}
