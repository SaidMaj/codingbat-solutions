class string3_MirrorEnds{
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
    }
    
    public static String mirrorEnds(String string) {
      String suffix ="";
      String prefix = "";
      String result = "";
      int stringLength = string.length();
      
    
      for(int i = 0 ; i < stringLength; i++)
      {
        prefix = string.substring(i,i+1);
        suffix = string.substring(stringLength - 1 - i, stringLength - i);
        
        
        if(prefix.equals(suffix))
        {
          result += prefix;
        }
        else
        {
          break;
        }
        
      }
      
      return result;  
    }

}