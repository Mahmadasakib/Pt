public class Abstract {
    public static void main(String[] args) {
        Implementcal cal = new Implementcal();
        cal.calculate(10, 2);
    }
}

abstract class Calc1 {
    abstract int divide(int a, int b);
}

class Implementcal extends Calc1 {

    int divide(int a, int b) {
        return a / b;
    }

    void calculate(int a, int b) {
        System.out.println(divide(a, b));
    }
}


