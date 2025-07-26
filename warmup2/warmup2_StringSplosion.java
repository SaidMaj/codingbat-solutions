public class warmup2_StringSplosion
{
    public static void main(String[] args)
    {
        System.out.println(stringSplosion("ab"));
    }
    
    public static String stringSplosion(String str) {
      int stringLength = str.length();
      String result = "";
      
      /*
            The logic I used to solve this problem is like want to print the sub string I will use Code Word to explain my soluation
            In the First Itreation result string equal to noting ""
                    result += str.substring(0,i);
            now result = "C"
            
            in TheSecondItreation
            
                    result += str.substring(0,i);
            now result = "CCo"
            
            in TheThirdItreation
            
                    result += str.substring(0,i);
            now result = "CCoCod"
            
            in TheFourthItreation
            
                    result += str.substring(0,i);
            now result = "CCoCodCode"
            
            
      */
          
          
          
      for(int i = 0 ; i <= stringLength; i++)
      {
        result += str.substring(0,i);
      }
      
      return result;
    }

}