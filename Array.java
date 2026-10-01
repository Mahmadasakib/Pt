public class Array {

    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 9, 4, 6};
        int target = 3;

        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println("Target found: " + arr[i] + " + " + arr[j]);
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                break;
            }
        }

        if (!isFound) {
            System.out.println("Target not found");
        }
    }
}