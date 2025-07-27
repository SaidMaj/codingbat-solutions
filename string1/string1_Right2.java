public class string1_Right2{
  public static void main(String args[]) {
        System.out.println(right2("2234"));
  }
  
public static String right2(String str) {
  int stringLength = str.length();
  
  return str.substring(stringLength-2) + str.substring(0,stringLength-2); 
}


}