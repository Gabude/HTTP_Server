package Online_Space.HTTP_Server.http;

public class HttpParsingException extends Exception {
    private final HttpStatusCode errorCode;

    public HttpParsingException(HttpStatusCode errorCode)  {
        super(errorCode.MESSAGE);
        this.errorCode = errorCode;
    }
    public HttpStatusCode getErrorCode() {
        return errorCode;
    }

}
