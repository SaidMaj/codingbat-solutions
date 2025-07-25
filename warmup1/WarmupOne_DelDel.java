public class WarmupOne_DelDel {
  public static void main(String args[]) {
        System.out.println(delDel("Free"));
  }



public static String delDel(String str) 
{
  if(str.startsWith("del",1))
  {
    String modifiedString = str.charAt(0) +  str.substring(4, str.length());
    return modifiedString ;
  }
    
  return str; 
}


}