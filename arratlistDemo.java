import java.util.ArrayList;

public class arratlistDemo {
    public static void main(String[] args) {

        String[] names = new String[10];

        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("m1");
        nameList.add("m2");
        nameList.add("m3");

        System.out.println(nameList.get(1));

        for(int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }
    }
}