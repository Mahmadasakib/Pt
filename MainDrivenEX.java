import java.util.Scanner;

public class MainDrivenEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;

        while (userChoice != 5) {
            System.out.println("Enter your calculator choice: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1: {
                    Addition(sc);
                    break;
                }
                case 2: {
                    System.out.println("Enter num 1: ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter num 2: ");
                    int num2 = sc.nextInt();
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                }
                case 3: {
                    System.out.println("Enter num 1: ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter num 2: ");
                    int num2 = sc.nextInt();
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                }
                case 4: {
                    System.out.println("Enter num 1: ");
                    int num1 = sc.nextInt();
                    System.out.println("Enter num 2: ");
                    int num2 = sc.nextInt();
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / num2));
                    }
                    break;
                }
                case 5: {
                    System.out.println("Thank you for using our app.");
                    break;
                }
                default: {
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }
        sc.close();
    }

    private static void Addition(Scanner sc) {
        System.out.println("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
