public class string1_FirstHalf {
  public static void main(String args[]) {
        System.out.println(firstHalf("2234"));
  }
  
public static String firstHalf(String str) 
{
  int stringSize = str.length();
  
  if(stringSize < 2)
    return str;
    
  return str.substring(0, stringSize/2);
}


}