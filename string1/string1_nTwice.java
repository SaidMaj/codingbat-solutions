public class string1_nTwice{
  public static void main(String args[]) {
        System.out.println(nTwice("2234",1));
  }
  
public static String nTwice(String str, int n) {
  int stringLength = str.length();
  
    return str.substring(0,n) + str.substring(stringLength - n);
}


}