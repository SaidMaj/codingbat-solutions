public class logic1_FizzString{
  public static void main(String args[]) {
    System.out.println(fizzString("jjjj"));
  }
  
  public static String fizzString(String str) {
     // if the string starts with "f" return "Fizz"
  // If the string ends with "b" return "Buzz"
  // If both the "f" and "b" conditions are true, return "FizzBuzz"
    
     int stringLength = str.length();
      
     if(str.charAt(0) == 'f' && str.charAt(stringLength - 1) == 'b')
       return "FizzBuzz";
    
     if(str.charAt(0) == 'f')
        return "Fizz";
    
     if(str.charAt(stringLength - 1) == 'b')  
        return "Buzz";
        
      return str;
  }
}