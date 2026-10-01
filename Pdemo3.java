public class Pdemo3 {
    public static void main(String[] args) {
        Snacke snacke = new Snacke();
        snacke.makeSound();
    }
}
class Pdemo3Animal {
    int name;
    void makeSound() {
        System.out.println("Animal sound");
    }
}
class Snacke extends Pdemo3Animal {
    void makeSound() {
        System.out.println("SSssszzz!");
    }
}