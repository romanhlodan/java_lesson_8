package lesson9;

public class Methods {
    private int a;
    private int b;

    public Methods() {
    }

    public void add(int a, int b) throws MyException {
        if (a<0 && b<0){
            System.err.println("IllegalArgumentException");
        }if (a==0 && b!=0 || a!=0 && b==0){
            System.err.println("ArithmeticException");
        }if (a==0 && b==0){
            System.err.println("IllegalAccessException");
        }if (a>0 && b>0){
            String s = "Error";
            throw new MyException(s);
        }
        else {
            System.out.println(a+b);
        }
    }

    public void minus(int a, int b) throws MyException {
        if (a<0 && b<0){
            System.err.println("IllegalArgumentException");
        }if (a==0 && b!=0 || a!=0 && b==0){
            System.err.println("ArithmeticException");
        }if (a==0 && b==0){
            System.err.println("IllegalAccessException");
        }if (a>0 && b>0){
            String s = "Error";
            throw new MyException(s);
        }
        else {
            System.out.println(a-b);
        }
    }

    public void multip(int a, int b) throws MyException {
        if (a<0 && b<0){
            System.err.println("IllegalArgumentException");
        }if (a==0 && b!=0 || a!=0 && b==0){
            System.err.println("ArithmeticException");
        }if (a==0 && b==0){
            System.err.println("IllegalAccessException");
        }if (a>0 && b>0){
            String s = "Error";
            throw new MyException(s);
        }
        else {
            System.out.println(a*b);
        }
    }

    public void divis(int a, int b) throws MyException {
        if (a<0 && b<0){
            System.err.println("IllegalArgumentException");
        }if (a==0 && b!=0 || a!=0 && b==0){
            System.err.println("ArithmeticException");
        }if (a==0 && b==0){
            System.err.println("IllegalAccessException");
        }if (a>0 && b>0){
            String s = "Error";
            throw new MyException(s);
        }
        else {
            System.out.println(a/b);
        }
    }

}
