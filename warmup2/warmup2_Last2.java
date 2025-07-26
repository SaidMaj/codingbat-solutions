public class warmup2_Last2
{
    public static void main(String[] args)
    {
        System.out.println(last2("axxxaaxx"));
    }
    
   public static int last2(String str) {
      int count = 0 ;
      int stringLength = str.length();
      String subString = "";
      
      if(stringLength > 2)
       {
           subString = str.substring(stringLength - 2 ,stringLength);
           
       }
      
      
      
      for(int i = 0 ; i < str.length() - 2; i++)
      {
        if(str.substring(i, i + 2).equals(subString))
          {
              count++;
              
          }
      }
      
      return count;
    }

}