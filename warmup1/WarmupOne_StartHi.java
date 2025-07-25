public class WarmupOne_StartHi {
  public static void main(String args[]) {

    System.out.println(startHi("Mike"));

  }
  
public static boolean startHi(String str) {

  if(str.startsWith("hi"))
  {
      return true ;
  }
      
  return false;
}

}
