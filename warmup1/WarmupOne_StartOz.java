
public class WarmupOne_StartOz {
  public static void main(String args[]) {
        System.out.println(startOz("ooman"));
  }



public static String startOz(String str) {
  String result = "";
  int stringLength = str.length();
  
  if(stringLength > 0  && str.charAt(0) == 'o')
  {
    result += str.charAt(0);
  }
  if(stringLength > 1 && str.charAt(1) == 'z' )
  {
    result += str.charAt(1);
  }
  
  return result;
}



}