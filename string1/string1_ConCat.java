public class string1_ConCat{
  public static void main(String args[]) {
        System.out.println(conCat("c", "cccc"));
  }
  
public static String conCat(String a, String b) {
  int stringLengthA = a.length();
   int stringLengthB = b.length();
   
  if((stringLengthA >= 1 && stringLengthB >=1 ) && a.charAt(stringLengthA - 1) == b.charAt(0))
  {
    return a.substring(0, stringLengthA-1) + b;
  }
  
  if(stringLengthA >= 1 && stringLengthB >= 1 )
  {
    return a + b ;
  }
  
  if(stringLengthA >= 1 && b.isEmpty() )
  {
    return a;
  }
  
  
  if(a.isEmpty()  && stringLengthB >= 1)
  {
    return b;
  }
  
  
  return "";
}


}
