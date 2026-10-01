public class primeNonPrimitive{
    public static void main(String[] args) {
        int passingNum = 5;
        callingVariable(passingNum);
        System.out.println("After method calling");
        System.out.println(passingNum);
    }
    static void callingVariable(int num){
        num++;
        System.out.println( num);
    }
    
}
