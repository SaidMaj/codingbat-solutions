//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true,3));
    }

    public static boolean  parrotTrouble(boolean talking, int hour) {
        return talking &&  (hour < 7 || hour > 20) ;
    }

}