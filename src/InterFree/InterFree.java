package InterFree;

import java.util.HashMap;
import java.util.Iterator;

public class InterFree {
    public static void main(String[] args) {

        HashMap<String, String> InterFreeMidTypeMap = new HashMap<>();

        InterFreeMidTypeMap.put("CC00", "M101");
        InterFreeMidTypeMap.put("CC01", "M101");
        InterFreeMidTypeMap.put("CC02", "M100");
        InterFreeMidTypeMap.put("CC03", "M103");
        InterFreeMidTypeMap.put("CC04", "M100");
        InterFreeMidTypeMap.put("CC05", "M102");
        InterFreeMidTypeMap.put("CC06", "M100");

//        Iterator<String> keys = InterFreeMidTypeMap.keySet().iterator();
//        while (keys.hasNext()) {
//            String key = keys.next();
//            if ("M100".equals(InterFreeMidTypeMap.get(key)) || "M101".equals(InterFreeMidTypeMap.get(key))) {
//                System.out.println(key + "는 일반 가맹점입니다.");
//            } else if ("M102".equals(InterFreeMidTypeMap.get(key)) || "M103".equals(InterFreeMidTypeMap.get(key))) {
//                System.out.println(key + "는 특수 가맹점입니다.");
//            }
//        }

        Iterator<String> keys = InterFreeMidTypeMap.keySet().iterator();
        while ( keys.hasNext() ) {
            String key = keys.next();
            if ("M100".equals(InterFreeMidTypeMap.get(key)) || "M101".equals(InterFreeMidTypeMap.get(key))) {
	System.out.println(key + "는 일반 가맹점입니다.");
            } else if("M102".equals(InterFreeMidTypeMap.get(key)) || "M103".equals(InterFreeMidTypeMap.get(key))) {
                System.out.println(key + "는 특수 가맹점입니다.");
            }
        }
    }













}
