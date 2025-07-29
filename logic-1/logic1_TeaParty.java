public class logic1_TeaParty{
  public static void main(String args[]) {
    System.out.println(teaParty(2, 2));
  }
  
  public static int teaParty(int tea, int candy) {
      // 0=bad, 1=good, or 2=great.
      // A party is good (1) if both tea and candy are at least 5.
      // if either tea or candy is at least double the amount of the other one, the party is great (2).
      
      if(tea < 5 || candy < 5)
        return 0;
        
      if(tea >= (candy * 2) || candy >= (tea * 2) )
        return 2;
      
        return 1;
    }
}