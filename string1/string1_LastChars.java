public class string1_LastChars{
  public static void main(String args[]) {
        System.out.println(lastChars("hi",""));
  }
  
public static String lastChars(String a, String b) {
   int firstStringLength =  a.length();
   int secondStringLength = b.length();
   
   if(firstStringLength == 0 && secondStringLength == 0 )
      return "@@";
   else if(firstStringLength == 0 && secondStringLength >= 1 )
      return "@" + b.substring(secondStringLength-1);
   else if(firstStringLength >= 1 && secondStringLength == 0 )
      return a.substring(0,1) + "@";
      
    return  a.substring(0,1) + b.substring(secondStringLength-1);
}

}