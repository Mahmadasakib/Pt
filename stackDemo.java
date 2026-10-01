import java.util.LinkedList;
public class stackDemo {
    public static void main(String[] args) {
        LinkedList<String> bucket = new LinkedList<String>();
       bucket.push("Toy1");
       bucket.push("Toy2");
       bucket.push("Toy3");
       bucket.push("Toy4");
       bucket.push("Toy5");

       while(!bucket.isEmpty()){
           System.out.println(bucket.pop());
       }
    }
}