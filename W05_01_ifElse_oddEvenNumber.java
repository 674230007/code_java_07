import java.util.Scanner;

public class W05_01_ifElse_oddEvenNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kb.nextInt();

        int result = number % 2;

        // // Case1
        // if (result != 0) {
        // System.out.println(number + " is an odd number. ");
        // } else {
        // System.out.println(number + " is an even number. ");
        // }

        // Case2
        if (result == 1) {
            System.out.println(number + " is an odd number. ");
        } else {
            System.out.println(number + " is an even number. ");
        }

        // // Case3
        // if (result == 0) {
        // System.out.println(number + " is an even number. ");
        // } else {
        // System.out.println(number + " is an odd number. ");
        // }

        // // Case4
        // if (result = 1) {
        // System.out.println(number + " is an even number. ");
        // } else {
        // System.out.println(number + " is an odd number. ");
        // }

    }
}
