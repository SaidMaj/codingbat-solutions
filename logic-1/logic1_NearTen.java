public class logic1_NearTen{
    public static void main(String args[]) {
        System.out.println(nearTen(25));
    }
  
     public static boolean nearTen(int num) {
      return ( num  % 10) <= 2  || (( num + 1)  % 10) <= 2 || ( (num + 2)  % 10) <= 2;
    }
}