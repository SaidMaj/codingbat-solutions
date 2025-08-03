public class string1_StartWord {
  public static void main(String args[]) {
        System.out.println(startWord("hip", "zig"));
        
  }    
  
public static String startWord(String str, String word) {
  

  int firstStringLength = str.length();
  int secondStringLength = word.length();
  
  if(firstStringLength >= secondStringLength > )
  {
      
      
      if(str.substring(0 , secondStringLength).equals(word))
      {
            return word;
      }
     
      if(str.substring(1 , secondStringLength).equals(word.substring(1)))
      {
            return str.substring(0 , secondStringLength);
      }
      
  }
  
  
  return "";
}


}
