public class string2_ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zapabczap"));
    }
    public static String zipZap(String str) {
        String subString = "";
        String result = "";
        int stringLength = str.length() ;

        if(stringLength <= 2)
        {
            return str;
        }

        for(int i = 0 ; i <= stringLength - 3; )
        {
            subString = str.substring(i, i + 1) + str.substring(i+ 2, i + 3) ;

            if(subString.equals("zp"))
            {
                result += subString;
                i += 3;
            }
            else
            {
                result += str.charAt(i);
                i++;
            }
        }

        if( !(subString.equals("zp")) )
        {
            result += str.substring((stringLength -2 ));
        }

        return result;
    }

}