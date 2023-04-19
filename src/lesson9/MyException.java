package lesson9;

public class MyException extends Exception {
private String er;

    public MyException(String er) {
        this.er = er;
    }

    public MyException(String message, String er) {
        super(message);
        this.er = er;
    }

    public MyException(String message, Throwable cause, String er) {
        super(message, cause);
        this.er = er;
    }

    public MyException(Throwable cause, String er) {
        super(cause);
        this.er = er;
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String er) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.er = er;
    }
}
