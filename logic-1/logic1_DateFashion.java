public class Logic1_DateFashion {
  public static void main(String args[]) {
    System.out.println(dateFashion(0,0));
  }
  
  public static int dateFashion(int you, int date) {
  
  if(you <= 2 || date <= 2)
    return 0;
    
  if(you >= 8 ||date >= 8 )
    return 2;
  
    return 1;
   }

}
