package f1.app.base.exceptions;

import f1.app.base.constant.Code;

public class QueryDataException extends BaseException {

    public QueryDataException(Code code) {
        super(code);
    }

    public QueryDataException(Code code, String msg) {
        super(code, msg);
    }
}
