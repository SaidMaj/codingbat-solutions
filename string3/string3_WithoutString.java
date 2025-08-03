class string3_WithoutString{
    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
    }
    
    public static String withoutString(String base, String remove) {
      
      String result = "";
      int removeLength = remove.length();
      int indexToSkip =  0;
      
      // I have created these two deal to solve the case sentive problem
      String temp1 =  base.toLowerCase();
      String temp2=  remove.toLowerCase();
    
      for(int i = 0 ; i < base.length()  ; i++ )
      {
        indexToSkip = temp1.indexOf(temp2, i);
        
        if(indexToSkip != -1)
        {
          result += base.substring(i , indexToSkip);
          i = (indexToSkip + removeLength - 1 );
        }
        else
        {
            result += base.charAt(i);
        }
        
      }
      
    
      return result;
    
    }

}