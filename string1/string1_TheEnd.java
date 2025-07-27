public class string1_TheEnd{
  public static void main(String args[]) {
        System.out.println(theEnd("2234", true));
  }
  
public static String theEnd(String str, boolean front) {
  return front ? str.substring(0, 1) : str.substring(str.length()-1, str.length()); 
}

}