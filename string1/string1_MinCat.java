public class string1_MinCat{
  public static void main(String args[]) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
        System.out.println(minCat("java", ""));
  }
  
public static String minCat(String a, String b) {
  int firstStringLength = a.length();
  int secondStringLength = b.length();

  if(firstStringLength > secondStringLength)
      return a.substring(firstStringLength-secondStringLength,  firstStringLength) + b;
  
    return a + b.substring(secondStringLength - firstStringLength,secondStringLength);
}



}