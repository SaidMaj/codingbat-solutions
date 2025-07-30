public class string2_MixString {
    public static void main(String[] args) {

        System.out.println(mixString("aaxbb", "Max"));
    }

    public static String mixString(String a, String b) {

        int aStringLength =  a.length();
        int bStringLength = b.length();
        int minLength     = Math.min(aStringLength, bStringLength);
        String result = "";

        for(int i = 0 ; i < minLength ; i++ )
        {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        return aStringLength > bStringLength ?  result + a.substring(minLength) : result + b.substring(minLength);
    }

}