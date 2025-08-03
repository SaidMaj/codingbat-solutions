public class warmup2_Countxx{
  public static void main(String args[]) {
        System.out.println(frontTimes("Mike"));
  }

int static countXX(String str) {
  int count = 0 ;
  
  for(int i = 0 ; i < str.length(); i++)
  {
    if(str.charAt(i) =='x')
      count++;
    
    if(count > 1 && str.charAt(i) ==' ')
      count--;
    
  }
  
  return count > 1 ? count - 1 : count;
}

}
