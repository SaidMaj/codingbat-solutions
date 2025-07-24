//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Diff21Problem {
    public static void main(String[] args) {
        System.out.println(diff21(3));
    }

    public static int diff21(int n)
    {
        // I used the abs to handlee in case n was greater than 21
        int result = Math.abs(21 - n);

        return n > 21 ? result * 2 : result ;
    }

}