public class string1_FirstTwo {
  public static void main(String args[]) {
        System.out.println(firstTwo("2234"));
  }
  
    public static String firstTwo(String str) {
  int stringLength = str.length();

  if(stringLength <= 1) 
      return str;
      
  return str.substring(0,2);
        
 }

}