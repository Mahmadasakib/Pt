public class Pdemo3 {
    public static void main(String[] args) {
        Snacke snacke = new Snacke();
        snacke.makeSound();
    }
}
class Animal {
    int name;
    void makeSound() {
        System.out.println("Animal sound");
    }
}
class Snacke extends Animal {
    void makeSound() {
        System.out.println("SSssszzz!");
    }
}