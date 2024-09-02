package W12;

import java.util.Scanner;

public class W12_02_WhileTrue_KB {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        while (true){
            System.out.print("Enter number : ");  // แสดงข้อความ Enter Number :
            int number = kb.nextInt();              // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร number
            if (number == 0) break;                 // ตรวจสอบเงื่อนไข ถ้า number เท่ากับ 0 ให้ออกจากลูป
        }
    }
}
