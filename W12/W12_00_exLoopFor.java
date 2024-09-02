// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 

package W12;

public class W12_00_exLoopFor {
    public static void main(String[] args) {
            
        
        
        // โครงสร้างคำสั่งลูป for / while แบ่งออกเป็น 3 ส่วน
        // 1. ส่วนตัวแปรเริ่มต้น
        // 2. เงื่อนไข
        // 3. การเพิ่มค่า / การลดค่า
        
    // TODO 1
        System.out.println("TODO 1-For Loop");
        for(int i=1 ; i<=5 ; i++ ){
            // คำสั่งที่ต้องการให้ทำซ้ำ
            System.out.println("รอบที่ " +i);
        }
        System.out.println("---------------------------------------------");
        

        System.out.println("TODO 1-While Loop");
        int n1=1;
        while (n1<=5) {
             System.out.println("รอบที่ " +n1);
            n1++;
        }
        System.out.println("============================================");
        
// ======================================================================
        
// TODO 2
        //คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // รอบที่ 1 Hello World
        // รอบที่ 2 Hello World
        // รอบที่ 3 Hello World
        // รอบที่ 4 Hello World
        // รอบที่ 5 Hello World
        
        System.out.println("TODO 2-For Loop");
        for(int i=1 ; i<=5 ; i++ ){
            // คำสั่งที่ต้องการให้ทำซ้ำ
            System.out.println("รอบที่ " +i + " Hello World");
        }
        System.out.println("---------------------------------------------");
        
        
        System.out.println("TODO 2-While Loop");
        int n2=1 ;
        while (n2<=5) {
            System.out.println("รอบที่ " +n2 + " Hello World");
            n2++;
        }
        System.out.println("============================================");
           
 // ======================================================================
 
 // TODO 3
        //คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
        // ===============
        // 1 2 3 4 5 6 7 8 9 10
        
        System.out.println("TODO 3-For Loop");
        for(int j=1 ; j<=10 ; j++){
            System.out.print(j+" ");
        }
        System.out.println("\n---------------------------------------------");
        

        System.out.println("TODO 3-While Loop");
        int n3=1;
        while(n3<=10) {
            System.out.print(n3+" ");
            n3++;
        }
        System.out.println("\n============================================");

// ======================================================================


// TODO 4
    
    //คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
    // ===============
    // 1 2 3 4 5 6 7 8 9 10 = 55

    System.out.println("TODO 4-For Loop");
    System.out.println();
int sum = 0;
         for(int j=1 ; j<=10 ; j++){
            System.out.print(j + " ");
            sum = sum+j;
}
    System.out.println("= "+sum);
    System.out.println("\n---------------------------------------------");


    System.out.println("TODO 4-While Loop");
    sum = 0;
    int n4=1;
    while (n4<=10) {
        System.out.print(n4 + " ");
        sum += n4; 
        n4++;
    }
    System.out.println("="+sum);
    System.out.println("\n============================================");

// ======================================================================

// TODO 5

    //คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
    // ===============
    // 1+2+3+4+5+6+7+8+9+10 = 55

    System.out.println("TODO 5-For Loop");
    System.out.println();
    sum = 0;
         for(int j=1 ; j<=10 ; j++){
            System.out.print(j);
            if (j<10){
                System.out.print("+");
            }
            sum = sum+j;
}
    System.out.println(" = "+sum);
    System.out.println("\n---------------------------------------------");


    System.out.println("TODO 5-While Loop");
    sum = 0;
    int n5=1 ;
    while (n5<=10) {
         System.out.print(n5);
            if (n5<10){
            System.out.print("+");
            }
        sum += n5;
        n5++;
    }
    System.out.println(" = "+sum);
    System.out.println("\n============================================");







// ======================================================================

// TODO 6

    //คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
    // ===============
    // 10 9 8 7 6 5 4 3 2 1

    System.out.println("TODO 6-For Loop");
    for(int j = 10 ; j>=1 ; j-- ){
        System.out.print(j+" ");
    }
    System.out.println("\n---------------------------------------------");


    System.out.println("TODO 6-While Loop");
    int n6 = 10 ;
    while (n6>=1){
        System.out.print(n6+" ");
        n6--;
    }
    System.out.println("\n============================================");





    // ======================================================================

// TODO 7

    //คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
    // ===============
    // 1 3 5 7 9 11 13 15 17 19

System.out.println();
     for(int i=1 ; i<=19 ; i+=2){ //i=i+2 มีค่าเท่ากับ i+=2
            System.out.print(i+" ");
        }

// ======================================================================

// TODO 8

    //คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
    // ===============
    // 2 4 6 8 10 12 14 16 18 20



// ======================================================================

// TODO 9
    //คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
    // ===============
    // 1 4 9 16 25 36 49 64 81 100
    System.out.println("TODO 9-For Loop");
    System.out.println();
        for(int j = 1 ; j>=10 ; j++){
        System.out.print(j*j + " ");
    }
    System.out.println("\n---------------------------------------------");


    System.out.println("TODO 9-While Loop");
    int n9 = 2 ;
    while (n9<=10) {
        System.out.print(n9*n9 + " ");
        n9++;
    }
    System.out.println("\n============================================");







// ======================================================================

// TODO 10

//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่

System.out.println();
    for(int i=1; i<=5 ; i++){
        if(i%2==0){
            System.out.println("รอบที่ "+ i + " เลขคู่");
        } else{
            System.out.println("รอบที่ "+ i + " เลขคี่");
        }
        }

        

// ======================================================================
    }
}


