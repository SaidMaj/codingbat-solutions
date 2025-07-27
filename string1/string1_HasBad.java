public class string1_HasBad{
  public static void main(String args[]) {
        System.out.println(middleThree("candy"));
  }
  
public boolean hasBad(String str) {
  
  int stringLength = str.length();

  if(stringLength <= 2)
    return false;
    
  if(str.substring(0, 3).equals("bad") ||(  stringLength > 3  && str.substring(1, 4).equals("bad")))
    return true;
  
  return false;
}



}