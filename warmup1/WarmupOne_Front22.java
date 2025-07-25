
public class WarmupOne_Front22 {
  public static void main(String args[]) {

    System.out.println(front22("Mike"));
    System.out.println(front22("Mik"));
    System.out.println(front22("Mi"));
    System.out.println(front22("M"));
    System.out.println(front22(""));
  }
  
  public static String front22(String str) {
   
   int subStringLength = 2;
   
   if(str.length() <= 1)
    {
        subStringLength = str.length();
    }
   
    String subString =  str.substring(0, subStringLength);
    
    return subString + str + subString;
}

}