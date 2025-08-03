class string2_PlusOut{
    public static void main(String[] args) {
        String result = plusOut("12xy34", "xy");
        System.out.println(result);
    }
    
    
    public static String plusOut(String str, String word) {
       int strLength = str.length();
       int wordLength = word.length();
       String result = "";
       
       for(int i = 0 ; i < strLength  ;  )
       {
          if( i + wordLength <= strLength  &&  str.substring(i , i + wordLength).equals(word))
          {
            result += word;
            i += wordLength;
            continue;
          }
          else
          {
            result += "+";
          }
          i++;
       }
       
    
       return result;
    }


}
