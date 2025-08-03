public class logic1_FizzString2{
  public static void main(String args[]) {
    System.out.println(fizzString2(2));
  }
  
  public static String fizzString2(int n) {
  // return the string form of the number followed by "!"
  // Except if the number is divisible by 3 use "Fizz"
  // number is divisible by 5 use "Buzz
  //if divisible by both 3 and 5, use "FizzBuzz"
  
      if(n % 3 == 0 && n % 5 == 0)
        return "FizzBuzz!";
      
      if(n % 3 == 0)
        return "Fizz!";
      
      if(n % 5 == 0)
        return "Buzz!";
      
      return String.valueOf(n)+ "!";
 }
}