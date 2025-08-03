public class string1_atFirst{
  public static void main(String args[]) {
        System.out.println(atFirst("candy"));
  }
  
public static String atFirst(String str) {
  int stringLength = str.length();
 
  if(stringLength == 0)
    return "@@";
  if(stringLength == 1)
    return str + "@";
  
  return str.substring(0,2); 
}

}