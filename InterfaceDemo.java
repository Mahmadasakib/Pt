public class InterfaceDemo {
    public static void main(String[] args) {
       InheritClass obj = new InheritClass();
       obj.printSomething();
    }
}
interface InterfaceDemo1 {
    public void printSomething();
}
interface InterfaceDemo2 {
    public void printSomething();
}
class InheritClass implements InterfaceDemo1 {
    public void printSomething() {
        System.out.println("hii.");
    }
}

class ParentParent{
    void printSomething() {
        System.out.println("hellow.");
    }
}
