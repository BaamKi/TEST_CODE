package alipayplus;

import java.util.HashMap;

public class AlipayPlusTest {

    public static void main(String[] args) {

        String lang ="CN";

        HashMap<String, String> aliPayPlusMap = new HashMap<>();
//        aliPayPlusMap.put("C061","Alipay Plus(ALIPAY_CN)");
        aliPayPlusMap.put("C062","Alipay Plus(ALIPAY_HK)");
        aliPayPlusMap.put("C063","Alipay Plus(TRUEMONEY)");
        aliPayPlusMap.put("C064","Alipay Plus(TNG)" );
        aliPayPlusMap.put("C066","Alipay Plus(DANA)");
        aliPayPlusMap.put("C068","Alipay Plus(ALIPAY_MO)");
        aliPayPlusMap.put("C069","Alipay Plus(PAYTM)" );
        aliPayPlusMap.put("C070","Alipay Plus(EASYPAISA)");
        aliPayPlusMap.put("C071","Alipay Plus(BKASH)");

        if (lang.equals("CN") && aliPayPlusMap.containsKey("C061"))
        {
            System.out.println("있습니다.");
        }
        else{
            System.out.println("없습니다.");
        }


    }
    
}
