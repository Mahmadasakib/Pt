public class Encapsulation {
    public static void main(String[] args) {
        User obj = new User();
        obj.bred = "Persian";
        obj.setName("Shero");
        System.out.println(obj.getName());
        obj.petSound();
        obj.age = 5;
        System.out.println(obj.age);
    }
}
class User{
    String name;
    int age;    String bred;

    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name = name;
    }
    void petSound(){
        System.out.println("Meow!");
    }
}