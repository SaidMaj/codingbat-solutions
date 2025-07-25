public class warmup2_FrontTimes{
  public static void main(String args[]) {
        System.out.println(frontTimes("Mike",2));
  }

public static String frontTimes(String str, int n) {
  String subString = "";
  String result = "";
  int stringLength = str.length();
  
  if(stringLength <= 2)
  {
      subString = str;
  }
  
  else 
  {
      subString = str.substring(0,3);
  }
  
  for(int i = 0 ; i < n ; i++)
  {
    result += subString;
  }
  
  
  return result;
  
}

}
