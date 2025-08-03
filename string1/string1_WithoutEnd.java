public class string1_WithoutEnd {
  public static void main(String args[]) {
        System.out.println(withoutEnd("2234"));
  }
  
public static String withoutEnd(String str) {
  return str.substring(1,  str.length()-1);
}

}