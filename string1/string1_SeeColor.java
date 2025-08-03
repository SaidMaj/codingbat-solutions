public class string1_SeeColor{
  public static void main(String args[]) {
        System.out.println(seeColor("cccc"));
  }
  
public static String seeColor(String str)
{
  int stringLength = str.length();
  
  if(stringLength > 2 && str.substring(0, 3).equals("red"))
    return "red";
  else if(stringLength > 3 &&str.substring(0, 4).equals("blue"))
    return "blue";
   
   return "";
}


}