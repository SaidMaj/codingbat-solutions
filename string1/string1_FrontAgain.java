public class string1_FrontAgain{
  public static void main(String args[]) {
        System.out.println(frontAgain("cccc"));
  }
  
public static boolean frontAgain(String str) {
  int stringLength = str.length();
  
  if(stringLength <= 1)
    return false;
  
  return str.substring(0,2).equals(str.substring(stringLength-2, stringLength));
}


}