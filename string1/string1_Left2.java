public class string1_Left2{
  public static void main(String args[]) {
        System.out.println(left2("2234"));
  }
  
public static String left2(String str) {
  int stringLength = str.length();
  return str.substring(2,stringLength) + str.substring(0,2) ;
}

}