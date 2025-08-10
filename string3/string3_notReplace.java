class string3_NotReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is test"));
    }
    public static String notReplace(String str) {
      String Result = "" ;
    
      for(int i = 0; i < str.length(); i++)
      {
          if(str.charAt(i) == 'i' &&  str.charAt(i+1) == 's')
          {
            if( (i > 0 && Character.isLetter(str.charAt(i - 1))) || ((i + 2 < str.length()) && Character.isLetter(str.charAt(i + 2)) ))
            {
              Result += str.charAt(i);
              continue;
            }
            else
            {
               Result += "is not";
               i += 1;
               continue;
            }
          }
         Result += str.charAt(i);
      }
      
      return Result;
    }
}