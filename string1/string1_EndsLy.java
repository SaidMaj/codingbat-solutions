public class string1_EndsLy{
  public static void main(String args[]) {
        System.out.println(endsLy("2234"));
  }
  
public static boolean endsLy(String str) {
  int stringLength = str.length();
  
  if(stringLength < 2)
    return false;
    
    return str.substring(stringLength-2).equals("ly");
  
}

}