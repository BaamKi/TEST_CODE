import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class MccEncoder {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ArrayList<String> arrayList = new ArrayList<>();
        String encodeVal = "";


        arrayList.add("ïÙÝ¤Ü×??Ú±î¤Ðìöâò¢Û°ÝÂ?");





        for (int i = 0; i < arrayList.size(); i++) {
            encodeVal = URLEncoder.encode(arrayList.get(i), "utf-8");
            System.out.println("ÀÎÄÚµù[ "+(i+1)+" ] : " + encodeVal);
        }

    }
}
