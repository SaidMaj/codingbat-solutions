public class string1_MiddleThree{
  public static void main(String args[]) {
        System.out.println(middleThree("candy"));
  }
  
  public static String middleThree(String str) {
  int halfSizeOfString = str.length() / 2;
  return str.substring(halfSizeOfString-1, (halfSizeOfString - 1) + 3);
}



}