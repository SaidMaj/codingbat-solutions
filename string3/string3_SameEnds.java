class string3_SameEnds{
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
    }
    
    public static String sameEnds(String string) {
       int endIndex = 0;
     int stringLength = string.length();
     String firstSub = "";
     String secondSub = "";
     String result = "";
     
      for(int i = 0 ; i < stringLength / 2 ; i++)
      {
          endIndex = stringLength -1 - i;
          firstSub = string.substring(0, i + 1);
          secondSub = string.substring(endIndex , stringLength);
        
    
          if(endIndex != i && firstSub.equals(secondSub))
          {
              result = firstSub;
          }
          
      }
      
      return result;
    }

}
  