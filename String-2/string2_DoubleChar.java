public class string2_DoubleChar {
    public static void main(String args[]) {
   
      System.out.println(doubleChar("Said"));
    } 
  
    public static String doubleChar(String str) {
      String result = "";
  
      for(int i = 0 ; i < str.length(); i++)
      {
          result += (str.substring(i,i+1) + str.substring(i,i+1));
      }
  
      return result;
    }

}