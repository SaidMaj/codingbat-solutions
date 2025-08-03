class logic2_Blackjack{
    public static void main(String[] args) {
        System.out.println(blackjack(1, 3));
    }
    
    public int blackjack(int a, int b) {
      
    
      if(a <= 21 && b<= 21)
      {
        return Math.max(a, b);
      }
        
      if((a > 21 && b <= 21) || a <= 21 && b > 21 )
      {
        return Math.min(a, b);
      }
        
      return 0;
    }


}