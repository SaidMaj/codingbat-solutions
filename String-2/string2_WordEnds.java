public class string2_WordEnds{
    public static void main(String[] args) {
        System.out.println(wordEnds("abb1aa1e", "1"));
    }
    public static String wordEnds(String str, String word) {
        String result = "";
        int index = 0;
        int wordLength  = word.length();
        int stringLength  = str.length();

        for(int i = 0 ; i < stringLength  ; i++ )
        {
            index = str.indexOf(word, i);
            if(index != -1)
            {
                if((index > 0))
                {
                    result += str.charAt(index - 1);
                }
                if((index < stringLength - wordLength ))
                {
                    result += str.charAt(index + wordLength);
                }
                i = index;
            }
        }

        return result;
    }
}