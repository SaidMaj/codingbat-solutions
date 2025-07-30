public class string2_CountHi {
    public static void main(String args[]) {
       System.out.println(countHi("Said"));
    }
  
    public static int countHi(String str) {
      int count = 0;
      String hiSting = "hi";
  
      for(int i = 0 ; i < str.length()- 1 ; i++)
      {
         if(str.substring(i, i+2).equals(hiSting))
         {
           count++;
          }
      }
  
       return count;
  
      }
}