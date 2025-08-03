public class string1_WithoutX2 {
  public static void main(String args[]) {
        System.out.println(withoutX("xHIx"));
        
  }    
  
  /*
        the way the program works first it checks if the string empty or  string length is one and it equals to one
        in this case an empty string will be returned
       
       then I have declared two strings first one is isFirstCharX  and the second one is isSecondCharX
       the value maybe 1 or 0
	
	Let's suppose the input is "xaxb"

       in case the char is 'x' so isFirstCharX = 1 so ''
       but in case the char was 'r' so isFirstCharX = 0 so 'a' 

     " " + "a" + "xb"
  */
public static String withoutX2(String str) {
  int stringLength = str.length();


  if(str.isEmpty() || (stringLength == 1 && str.charAt(0) == 'x'))
      return "";
    
  int isFirstCharX = (str.charAt(0) == 'x')  ? 1 : 0;
  int isSecondCharX = (str.charAt(1) == 'x')  ? 1 : 0;
  
  return str.substring(isFirstCharX , 1) + str.substring(isSecondCharX + 1 , 2) +  str.substring(2);
}

}
