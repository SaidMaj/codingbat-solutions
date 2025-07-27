public class string1_WithouEnd2{
  public static void main(String args[]) {
        System.out.println(withouEnd2("2234"));
  }
  
public static String withouEnd2(String str) {
  int stringLength = str.length();
  return stringLength <= 1 ? "" : str.substring(1, stringLength-1);
}


}