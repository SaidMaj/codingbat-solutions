public class string1_LastTwo{
  public static void main(String args[]) {
        System.out.println(conCat("c", "cccc"));
  }
  
public static String lastTwo(String str) {
  int stringLength = str.length();

  if(stringLength <= 1)
    return str;
  
  return str.substring(0,stringLength-2) + str.substring(stringLength-1,stringLength) + str.substring(stringLength-2,stringLength -1); 
}


}