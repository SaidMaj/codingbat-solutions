public class warmup2_StringBits{
  public static void main(String args[]) {
        System.out.println(stringBits("Mike"));
  }

public static String stringBits(String str) {
  String result = "";
  
  for(int i = 0; i < str.length(); i+= 2)
  {
        result += str.charAt(i);
  }
  
  return result;
}

}
