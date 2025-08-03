class string3_LuckySum{
    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
    }
    
    public static int luckySum(int a, int b, int c) {
         int sum = 0;
         
         if(a != 13)
         {
           sum += a;
         }
         if(a != 13 & b != 13)
         {
           sum += b;
         }
        
         if(a != 13 & b != 13 & c != 13)
         {
           sum += c;
         }
         
         return sum;
    }

}