package W12;

public class W12_01_WhileTrue {
    public static void main(String[] args) {

        int i = 0;          // กำหนดค่าเริ่มต้น
        while(true){        // วนลูปไปเรื่อยๆ  ใช้ while (true) {
          i++;                                       // เพิ่มค่า i ทีละ 1
          System.out.print(i+" ");                   // แสดงค่า i
                            
         if(i>=1000){                              // ตรวจสอบเงื่อนไข ถ้ารอบมากกว่าหรือเท่ากับ 1000 ให้ออกจากลูป
          break;                                  // ออกจากลูป
         }
          //if(i>=1000) break;                        //เขียนลดรูป if ให้สั้นลง

        }
    }
}