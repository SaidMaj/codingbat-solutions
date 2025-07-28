public class string1_WithoutX {
  public static void main(String args[]) {
        System.out.println(withoutX("xHIx"));
        
  }    
  
public static String withoutX(String str) {
  int stringLength = str.length();


  if(str.isEmpty() || (stringLength == 1 && str.charAt(0) == 'x'))
      return "";
    
  int isFirstCharX = (str.charAt(0) == 'x')  ? 1 : 0;
  int isLastCharX = (str.charAt(stringLength - 1) == 'x')  ? 1 : 0;
  
  return str.substring(isFirstCharX, stringLength - isLastCharX);
}



}