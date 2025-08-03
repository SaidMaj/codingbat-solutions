public class string2_RepeatSeparator{
    public static void main(String[] args) {

        System.out.println(repeatSeparator("Said", "2", 2));
    }
    
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        int numberOfSeparators = count - 1;

        for(int i = 0 ; i < count ; i++)
        {
            result += word;

            if(numberOfSeparators >= 1)
            {
                result += sep;
            }

            numberOfSeparators--;
        }

        return result;
    }
    
}