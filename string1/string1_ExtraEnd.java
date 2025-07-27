public class string1_ExtraEnd {
  public static void main(String args[]) {
        System.out.println(extraEnd(""));
  }
  
    public static String extraEnd(String str) {
   String subString = str.substring(str.length()-2);
    return subString + subString + subString;
  }
  
}