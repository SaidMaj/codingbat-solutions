public class string2_XyzMiddle{
    
    public static void main(String[] args) {
        System.out.println(xyzMiddle("xyz"));
    }

    public  static boolean xyzMiddle(String str) {
        int stringLength = str.length();
        int mid =  (stringLength / 2) - 1;

        if(stringLength <= 2)
            return false;

        return str.substring(mid, mid + 3).equals("xyz") || ( stringLength % 2 == 0 && str.substring(mid-1, mid-1 + 3).equals("xyz"));
    }
    
}