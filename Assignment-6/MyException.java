import java.util.*;

public class MyException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "\nChoose Error -\t1.ArithmeticExcepton\t2.NullPointerException\t3.NumberFormatException \t4.ArrayOutOfBoundsExcception");
        int choice;
        do {
            System.out.print("\nEnter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("\n------------ Enter two numbers to be divided ----------");
                        System.out.print("Enter Num1 :");
                        int a = sc.nextInt();
                        System.out.print("Enter Num2 :");
                        int b = sc.nextInt();
                        int c = a / b;
                        System.out.print("Division of two num: " + c);
                    } catch (ArithmeticException e) {
                        System.out.println("division not possible: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        String Null = null;
                        System.out.print(Null.length());
                    } catch (NullPointerException e) {
                        System.out.println("Null Pointer: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter Num1 :");
                        String p = sc.next();
                        System.out.print("Enter Num2 :");
                        String q = sc.next();
                        int a = Integer.parseInt(p);
                        int b = Integer.parseInt(q);
                        System.out.println("You Entered an Integer: " + a + " " + b);
                    } catch (NumberFormatException e) {
                        System.out.println("Incorrect Data Type: " + e.getMessage());
                    }
                    break;
                case 4:
                    int arr[] = { 1, 2, 3 };
                    System.out.print("Enter index to found Element: ");
                    int el = sc.nextInt();
                    System.out.print("Your array: ");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    try {
                        System.out.println("\nElement at index " + el + " is : " + arr[el - 1]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("\nIncorrect Data Type: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("EXit");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

    }
}
