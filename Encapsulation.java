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
    String bred;
    int age;
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