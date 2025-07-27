public class string1_Without2{
  public static void main(String args[]) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hii"));
        // System.out.println(without2("java"));
  }
  
public static String without2(String str) {
 int stringLength = str.length();
  
  if(stringLength <= 1)
  {
    return  str;
  }
  
  if(str.substring(0,2).equals(str.substring(stringLength-2,stringLength)))
  {
    return str.substring(2);
  }
  
 return str;
}




}