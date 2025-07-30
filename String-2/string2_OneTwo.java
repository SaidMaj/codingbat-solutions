public class string2_OneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
    }
    public static String oneTwo(String str) {
        String result = "" ;
        String subString = "" ;
        int stringLength = str.length();

        for(int i = 0; i < stringLength - (stringLength % 3); i+=3)
        {
            subString = str.substring(i+1, i+3);
            result += (subString + str.substring(i, i+1 ));
        }

        return result;
    }
}