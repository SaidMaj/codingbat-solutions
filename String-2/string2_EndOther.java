public class string2_EndOther {
    public static void main(String[] args) {

        System.out.println(endOther("Said", "id"));
    }

    public static boolean endOther(String a, String b) {
        String firstStringToLower = a.toLowerCase();
        String secondStringToLower = b.toLowerCase();

        return firstStringToLower.endsWith(secondStringToLower) || secondStringToLower.endsWith(firstStringToLower);
    }
}