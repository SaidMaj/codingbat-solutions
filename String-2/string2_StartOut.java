public class string2_StartOut {
    public static void main(String[] args) {
        System.out.println(starOut("zapab*czap"));
    }
    public static String starOut(String str) {

        int stringLength = str.length();
        String result = "";

        for(int i = 0 ; i <= stringLength - 1 ; i++ )
        {
            if(str.charAt(i) =='*'
                    || (i <  stringLength - 1 && str.charAt(i + 1) =='*' )
                    ||(i >0 && str.charAt(i - 1) =='*'))
            {
                continue;
            }

            else
            {
                result += str.charAt(i);
            }

        }

        return result;
    }

}