public class string2_RepeatFront
{
    public static void main(String[] args) {

        System.out.println(repeatFront("Said", 2));
    }

    public static String repeatFront(String str, int n) {
        String result = "";

        for(int i = n ; i != 0; i--)
        {
            result += str.substring(0, i);
        }

        return result;
    }
    
}