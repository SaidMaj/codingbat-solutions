public class string1_NonStart{
  public static void main(String args[]) {
        System.out.println(nonStart("2234", "1"));
  }
  
public static String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1); 
}

}