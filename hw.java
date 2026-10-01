public class hw {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.makeSound();

        dog.name = "Buddy";
        System.out.println("Dog's name: " + dog.name);

        dog.breed = "Golden Retriever";
        System.out.println("Dog's breed: " + dog.breed);

        dog.age = 9;
        System.out.println("Dog's age: " + dog.age);


        Cat cat = new Cat();

        cat.makeSound();

        cat.name = "Whiskers";
        System.out.println("Cat's name: " + cat.name);

        cat.breed = "Siamese";
        System.out.println("Cat's breed: " + cat.breed);

        cat.age = 8;
        System.out.println("Cat's age: " + cat.age);
    }
}

class Animal {
    String name;
    String breed;
    int age;
}

class Dog extends Animal {

    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {

    void makeSound() {
        System.out.println("Meow!");
    }
}