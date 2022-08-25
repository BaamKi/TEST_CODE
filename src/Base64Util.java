import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Base64Util {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String val = "?í®ßÂù¡£º?éÄïïßí£¨êý?ð¶èâ)";
        String encodeVal = "?í®ßÂù¡£º?éÄïïßí£¨êý?ð¶èâ)";
        String decodeVal = "%E6%95%B0%E5%AD%97%E5%95%86%E5%93%81%EF%BC%9A%E5%BA%94%E7%94%A8%E7%A8%8B%E5%BA%8F%EF%BC%88%E6%B8%B8%E6%88%8F%E9%99%A4%E5%A4%96%EF%BC%89";

        encodeVal = URLEncoder.encode(val, "utf-8");
        decodeVal = URLDecoder.decode(encodeVal, "utf-8");

        System.out.println("ÀÎÄÚµù=>" + encodeVal);
        System.out.println("µðÄÚµù=>" + decodeVal);
    }
}