import java.util.Scanner;
public class W04_02_ifElse_CompareNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();

        int result = 0;
        
        if(num1>num2) {
            
            result = num1-num2;
            System.out.println("The number 1 is greater than the number 2");
        } else {
            
            result = num1+num2;
            System.out.println("The number 1 is less than or equal the number 2");
             
        }
        System.out.println("The result is: "+ result);
    }
} 