public class WarmupOne_EveryNth{
  public static void main(String args[]) {
        System.out.println(everyNth("Mike",2));
  }

public static String everyNth(String str, int n) {
  String result = "";
  
  for(int i = 0 ; i < str.length(); i +=n )
  {
    result += str.charAt(i);
  }
  
  return result;
}
}
