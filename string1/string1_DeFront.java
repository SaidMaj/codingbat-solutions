public class string1_DeFront {
  public static void main(String args[]) {
        System.out.println(deFront("2234"));
  }
  
public static String deFront(String str)
{    
  
  if(str.charAt(0) != 'a' && str.charAt(1) != 'b')
      return str.substring(2); 

   if(str.charAt(0) == 'a' && str.charAt(1) == 'b' || str.length() <= 1)
       return str;
    
   if(str.charAt(0) == 'a')
    return str.charAt(0) + str.substring(2);
    
   return str.substring(1); 
}

}
