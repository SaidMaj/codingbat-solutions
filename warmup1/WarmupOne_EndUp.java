public class WarmupOne_EndUp{
  public static void main(String args[]) {
        System.out.println(EndUp("Mike"));
  }

public static String EndUp(String str) {
  int stringLength = str.length();
  String firstSubString = "";
  String secondSubString = "";
  
  if(stringLength <= 3)
    return str.toUpperCase();
    
   firstSubString =  str.substring(0, stringLength-3);
   secondSubString =  str.substring(stringLength - 3, stringLength);
  
  return firstSubString + secondSubString.toUpperCase();

}
}
