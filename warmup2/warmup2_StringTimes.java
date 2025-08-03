public class warmup2_StringTimes{
  public static void main(String args[]) {
        System.out.println(everyNth("Mike",2));
  }

public String stringTimes(String str, int n) {
  
  String result = "";
  
  for(int i = 0 ; i < n ; i++)
  {
     result += str;
  }
  
  return result;
}

}
