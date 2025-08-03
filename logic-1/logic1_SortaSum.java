public class logic1_SortaSum {
    public static void main(String args[]) {
        System.out.println(sortaSum(70,28));
    }
  
    public static int sortaSum(int a, int b) {
      int sum = a + b;
      return sum >= 10 && sum <= 19 ? 20 : sum;
    }

}