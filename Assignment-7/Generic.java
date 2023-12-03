/*
============================================================================
 *********** OOPL ASSIGNMENT 07 ************
 Name : Suraj B. Sakhare 
 College : P.E.S Modern Pune
 Class : SE-IT 
 Roll no: 25048 
 Assignment 7: Generic Template
============================================================================
*/
import java.util.*;
class Array {
    Scanner input = new Scanner(System.in);
    int count = 0;

    void isPalindrome(String s) {
        StringBuilder s1 = new StringBuilder(s);
        if (s.equals(s1.reverse().toString())) {
            count++;
        } 
    }

    void isEvenOrOdd(int s, int choice) {
        if (s % 2 == 0) {
            count++;
        } else {
        }
    }

    void checkString(int choice) {
        ArrayList<String> str = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter Array Size : ");
        int size = input.nextInt();
        String n;
        System.out.print("\nEnter " + size + " array strings : ");
        for (int i = 0; i < size; i++) {
            n = input.next();
            str.add(n);
        }
        Iterator<String> it = str.iterator();
        while (it.hasNext()) {
            isPalindrome((String) it.next());
        }
        System.out.print("\nNo. of Palindrome in ArrayList : " + count + "\nNo. of Non Palindrome in ArrayList : "
                + (size - count));

    }

    void checkInteger(int choice) {
        ArrayList<Integer> in = new ArrayList<Integer>();
        System.out.print("\nEnter Array Size : ");
        int size = input.nextInt();
        int n;
        count = 0;
        System.out.print("\nEnter " + size + " array strings : ");
        for (int i = 0; i < size; i++) {
            n = input.nextInt();
            in.add(n);
        }
        Iterator<Integer> it = in.iterator();

        while (it.hasNext()) {
            isEvenOrOdd((Integer) it.next(), choice);
        }
        System.out.print("\nNo. of Even elements in ArrayList : " + count + "\nNo. of Odd elements in ArrayList : "
                + (size - count));

    }

}

public class Generic {
    public static void main(String[] args) throws Exception {
        Array obj = new Array();
        Scanner input = new Scanner(System.in);
        System.out.println("\n 1.Even Number 2.odd Number 3.Palindrome 4.Exit");
        int choice;
        do {
            System.out.print("\nEnter Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    obj.checkInteger(choice);
                    break;
                case 2:
                    obj.checkInteger(choice);
                    break;
                case 3:
                    obj.checkString(choice);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid Choice");
            }
        } while (choice != 4);
    }

}