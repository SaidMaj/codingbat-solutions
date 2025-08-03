public class string2_SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("x*x"));
    }
    public static boolean sameStarChar(String str) {

        int stringLength = str.length();

        for(int i = 0 ; i < stringLength - 1; i++ )
        {
            if((i > 0 && str.charAt(i) == '*') &&  (  str.charAt(i-1) != str.charAt(i+1) ))
                return false;
        }
        
        return true;
    }
    
}