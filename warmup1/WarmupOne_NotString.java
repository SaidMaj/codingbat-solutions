public class WarmupOne_NotString {
    public static void main(String[] args) {
        System.out.println(notString("not Ahmed"));
    }

    public static String notString(String str) {

        if(str.startsWith("not", 0))
            return  str;

        return "not" + " " + str;
    }

}