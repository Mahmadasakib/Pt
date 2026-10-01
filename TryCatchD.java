public class TryCatchD {
    public static void main(String[] args) {
        int solution = 0;
        try {
            solution = 2 / 0;
        
            System.out.println("Solution: " + solution);
        } catch (Exception e) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
