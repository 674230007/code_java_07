public class W15_HW_Factoriale {
    static int factorial(int n) {
        int result =1;
        for (int i = 1; i <=n; i++) {
         result *= i;
        } 
        return result;
    }

    public static void main(String[] args) {
        int number =5;
        int fact = factorial(number);
        System.out.println("factorial of " + number + " is: " + fact );
    }
}
