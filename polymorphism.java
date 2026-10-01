public class polymorphism {
    public static void main(String[] args) {
        polyOverload poly = new polyOverload();
        poly.welcome();
        poly.welcome("John");
    }
}
class polyOverload {
    void welcome() {
        System.out.println("Welcome to the VVIT");
    }

    void welcome(String name) {
        System.out.println("Welcome, " + name );
    }
}
