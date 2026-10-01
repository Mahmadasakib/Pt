import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        scores.put("Charlie", 98); 
        System.out.println(scores);

        if(scores.containsKey("Bob")) {
            System.out.println("Bob is present");   
        }
        System.out.println();
    }
}
