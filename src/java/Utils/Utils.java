package Utils;

public class Utils {
    
    public static boolean validateStrings(String s) {
        return s != null && !s.trim().equals("");
    }
    
    public static Integer validateInts(String v) {
        try {
            int i = Integer.parseInt(v);
            if(i > 0) {
                return i;
            }
        } catch(NumberFormatException n) {}
        return null;
    }
    
}
