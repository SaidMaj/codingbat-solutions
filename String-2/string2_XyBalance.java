class string2_XyBalance{
    public static void main(String[] args) {
        System.out.println(xyBalance("xyx"));
    }
    
    public static boolean xyBalance(String str) {
      // y-balanced if for all the 'x' chars in the string, there exists a 'y'
      
      boolean isYExists = true; 
      boolean isXExists = true; 
      
      for(int i = 0 ; i < str.length() ; i++)
      {
          
        if(i > 0 && str.charAt(i) == 'y' && isXExists)
        {
          isYExists = true;
        }
        
        if( str.charAt(i) == 'x' && !isYExists)
        {
          isXExists = true;
        }
        else if(str.charAt(i) == 'x' && isYExists)
        {
          isYExists = false;
        }
    
          
      }
          
          return isYExists && isXExists;
    
    }
}