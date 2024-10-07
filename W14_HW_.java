//  6 แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
//         มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
//         มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
//         มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
public class W14_HW_ {
    public static void main(String[] args) {
        String [] codes = {"123TH","124EN","125EN","126TH","127EN"};
        int count =0;

        //แสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        System.out.println("จำนวนพัสดุทั้งหมด : " +codes.length + " ชิ้น");
        System.out.println("====================================");

        //มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
        for(String code : codes){
            if(code.endsWith("TH")){
            count++;
            }
        }
        System.out.println("จำนวนพัสดุที่มาจากไทย : " + count);
        System.out.println("====================================");

        //จำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
        count =0;
        for(String code : codes){
            if(code.endsWith("EN")){
            count++;
            }
        }
        System.out.println("จำนวนพัสดุที่มาจากต่างประเทศ : " + count );
        System.out.println("====================================");

           int countAll =0;
           int countTH =0;
           int countEN =0;
        for(int j=0; j <codes.length; j++){
            if(codes[j].endsWith("TH")){
                System.out.println((j+1) + ". " + codes[j] + " เป็นพัสดุที่มาจากไทย");
                countTH++;
            }else{
                System.out.println((j+1) + ". " + codes[j] + " เป็นพัสดุที่มาจากต่างประเทศ");
                countEN++;
            }
            countAll++;
        }
        System.out.println("====================================");

        //แสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        System.out.println("จำนวนพัสดุทั้งหมด = " + countAll + "ชิ้น" );
        //จำนวนพัสดุที่มาจากไทยเท่าไหร่
        System.out.println("จำนวนพัสดุที่มาจากTH = " + countTH + "ชิ้น" );
        //จำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
        System.out.println("จำนวนพัสดุที่มาจากEN = " +  countEN + "ชิ้น" );
    }
}