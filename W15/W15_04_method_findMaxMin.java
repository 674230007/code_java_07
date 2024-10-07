package W15;

public class W15_04_method_findMaxMin {
    // 1) Method สำหรับหาค่ามากที่สุด
        static int findMax(int a , int b){
        //     if ( a > b){
        //         return a;
        //      }else{
        //          return b;
        //      }
        return (a > b) ? a : b; // ใช้เงื่อนไขแบบ ternary operator
    }

    // 2) Method สำหรับหาค่าน้อยที่สุด
        static int findMin(int a , int b){
        //     if ( a < b){
        //         return a;
        //      }else{
        //          return b;
        //      }
        return (a < b) ? a : b; // ใช้เงื่อนไขแบบ ternary operator
    }


    // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
        static int findMax(int a , int b , int c){
            int max = a;
            if(b > max){
              max = b;
            }
            if ( c > max){
                max = c;
            }
            return max;
        }

    // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
        static int findMin(int[] numbers){
            disPlayArray(numbers);
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++ ){
                if (numbers[i] < min){
                    min =  numbers[i];
                }
            }
            return min;
        }


    // 5) Method สำหรับแสดงค่าใน array ทั้งหมด
        static void disPlayArray(int[] numbers){
            for (int i = 0; i < numbers.length; i++ ){
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }




    public static void main(String[] args) {
        // 1) Method สำหรับหาค่ามากที่สุด
            System.out.println("ค่ามากสุด [20,13] คือ: " + findMax(20,13) );

        // 2) Method สำหรับหาค่าน้อยที่สุด
            System.out.println("ค่าน้อยสุด [20,13] คือ: " + findMin(20,13) );

        // 3) Method สำหรับหาค่ามากที่สุด โดยรับค่า 3 ตัว
            System.out.println("ค่ามากสุด[20 ,13, 7] คือ: " + findMax(20 ,13, 7) );

        // 4) Method สำหรับหาค่าน้อยที่สุด โดยรับค่าเป็น array
            int[] numbers = {10, 20, 30, 40, 50};
            //  disPlayArray(numbers);
            System.out.println("Min number in array is " + findMin(numbers) );
    }
}

// method ที่มีชื่อเดียวกัน แต่มีพารามิเตอร์ต่างกันได้ เรียกว่า Method Overloading
// การเรียกใช้ method ที่มีชื่อเดียวกัน จะขึ้นอยู่กับพารามิเตอร์ที่ส่งเข้าไป
// ถ้ามี method ที่มีชื่อเดียวกัน และมีพารามิเตอร์ต่างกัน จะต้องมีการส่งพารามิเตอร์ตามที่ method ต้องการ