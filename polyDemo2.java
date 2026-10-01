public class polyDemo2 {
    public static void main(String[] args) {
       Calculator calc = new Calculator();
       System.out.println(calc.divide(65, 5));
       System.out.println(calc.divide(65l, 5l));
    }
}
class Calculator {
    int divide(int a, int b) {
        return a / b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}