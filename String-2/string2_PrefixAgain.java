public class string2_PrefixAgain{
    public static void main(String[] args) {

        System.out.println(prefixAgain("Said", 2));
    }

    public static boolean prefixAgain(String str, int n) {
        String substring = str.substring(0, n);

        for(int i = 1 ; i <= str.length() - n; i++)
        {
            if(str.substring(i, i+n).equals(substring))
            {
                return  true;
            }

        }

        return false;
    }

}