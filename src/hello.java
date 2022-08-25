import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hello {


    public static void main(String[] args) {


        Map<String, String> map = new HashMap<String, String>();
        map.put("key01", "value01");
        map.put("key02", "value02");
        map.put("key03", "value03");
        map.put("key04", "value04");
        map.put("key05", "value05");

//        System.out.println(map.values().toArray()[0]);
//        System.out.println(map.keySet().toArray()[0]);

        List<String> list_a = new ArrayList<>();
        for (int i = 0; i < map.size(); i++) {
            list_a.add((String) map.values().toArray()[i]);
        }

        System.out.println(list_a.toString());



    }
}
