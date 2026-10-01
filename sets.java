import java.util.HashSet;

public class sets {
    public static void main(String[] args) {
        HashSet<String> movies = new HashSet<String>();
        movies.add("nothing");
        movies.add("KGF2");
        movies.add("RRR");
        movies.add("KGF2");

        System.out.println(movies);
    }
}               