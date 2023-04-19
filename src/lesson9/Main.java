package lesson9;

public class Main {
    public static void main(String[] args) throws MyException {
        Methods methods = new Methods();
        methods.add(5, 1);
        methods.minus(0, 8);
        methods.multip(5, -5);
        methods.divis(1, 0);

    }
}
