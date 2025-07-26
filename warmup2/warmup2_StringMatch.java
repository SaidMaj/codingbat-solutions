public class warmup2_StringMatch
{
    public static void main(String[] args)
    {
        System.out.println(stringMatch("", ""));
    }
    
 
    public static int stringMatch(String a, String b) {
      int count = 0;
      
      int lengthOfFirstString = a.length();
      int lengthOfSecondString = b.length();
      int minmumLength = Math.min(lengthOfFirstString, lengthOfSecondString);
      
      
            
      
      for(int i = 0 ; i < minmumLength -1   ; i++)
      {
        if(a.substring(i, i+2).equals(b.substring(i, i+2)))
          count++;
      }
    
      return count++;  
    }




}