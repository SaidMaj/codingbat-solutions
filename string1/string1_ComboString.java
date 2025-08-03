public class string1_ComboString {
  public static void main(String args[]) {
        System.out.println(comboString("2234", "1"));
  }
  
public static String comboString(String a, String b) {
  int firstStringSize = a.length();
  int secondStringSize = b.length();
  
  if(firstStringSize > secondStringSize)
    return b + a + b;
   
    return a + b + a;
}

}