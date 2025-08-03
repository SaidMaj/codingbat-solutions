class string3_GHappy{
    public static void main(String[] args) {
        System.out.println(gHappy("noisxxnotyynotxisi"));
    }
    
    public static boolean gHappy(String str) {
      
      int stringLength = str.length();
      
      if(stringLength == 1)
      {
        return false;
      }
      
      for(int i = 0 ; i < stringLength - 1 ; i++)
      {
        
        if(str.charAt(i) == 'g' && str.charAt(i+1) == 'g' || (i > 0 && str.charAt(i) == 'g' && str.charAt(i-1) == 'g') )
        {
            i++;
            continue;
        }
        
        if(str.charAt(i) == 'g' && str.charAt(i+1) != 'g' || ( (i + 1 == str.length() - 1)  &&  str.charAt(i) != 'g' && str.charAt(i+1) == 'g' ))
        {
            return false;  
        }
        
      }
      
      return true;
    }
}