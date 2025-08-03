class string3_MaxBlock{
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));
    }
    
    public static int maxBlock(String str) {
      int count = 1;
      int max = 0;
    
       
      if( str.length() <= 1 )
         return str.length() ;
      
      for(int i = 0 ; i < str.length() -1 ; i++)
      {
         if(str.charAt(i) ==  str.charAt(i + 1))
         {
           count++;
         }
         else
         {
            max = Math.max(count, max);
            count = 1;
         }
      }
      
      max = Math.max(count, max);
      
      return max;
    
    }

}