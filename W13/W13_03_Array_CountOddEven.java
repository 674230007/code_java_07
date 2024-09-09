package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        //ให้นับจำนวนเลขคู่เลขคี่ใน Array ด้านล่าง

        int [] numbers = {1, 5, 6, 16, 35, 42, 57, 64, 6, 11, 42, 34, 23, 49, 55};
        
        int countOdd = 0;
        int countEven = 0;

        for(int i=0; i < numbers.length; i++ ){
           System.out.print(numbers[i] + " / ");
           if (numbers[i] % 2 == 0){
               countEven++;
           }else{
               countOdd++;
           }
        }
         System.out.println("\n Amount of all Number : " + numbers.length);
         System.out.println("Amount of all Number : " + countOdd);
         System.out.println("Amount of all Number : " + countEven );
    }

    
}
