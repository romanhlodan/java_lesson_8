package ua.com.hrv;

public class WrongInputConsoleParametersException extends Exception{
    private String value;

    public WrongInputConsoleParametersException(String value) {
        super(value);
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
