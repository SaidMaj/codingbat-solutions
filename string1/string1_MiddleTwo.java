public class string1_MiddleTwo{
  public static void main(String args[]) {
        System.out.println(middleTwo("2234"));
  }
  
public static String middleTwo(String str) {
  int halfOfStringLength = str.length()/2;
  return str.substring(halfOfStringLength-1, halfOfStringLength+1);
}

}