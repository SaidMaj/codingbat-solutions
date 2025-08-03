class warmup2_Last2{
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
    }
    
    public static int last2(String str) {
      int count = 0 ;
      int stringLength = str.length();
      String subString = "";
    
      for(int i = 0 ; i < stringLength - 2 ; i++)
      {
        
        subString = str.substring(stringLength  - 2 );
        
        if(str.substring(i, i + 2).equals(subString))
        {
          count++;
        }
        
      }
      
      return count;
    }

}