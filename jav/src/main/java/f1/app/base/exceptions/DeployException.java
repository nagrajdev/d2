package f1.app.base.exceptions;

import f1.app.base.constant.Code;

public class DeployException extends BaseException {
    public DeployException(Code code, String msg) {
        super(code, msg);
    }
}
