public class string2_BobThere {
    public static void main(String[] args) {

        System.out.println(bobThere("Syizxyzd"));
        System.out.println(bobThere("Sybzbyzd"));
    }

    public static boolean bobThere(String str) {
        String subString = "";

        for(int i = 0 ; i < str.length() - 2 ; i++)
        {
            subString = str.substring(i, i+3);

            if(subString.startsWith("b") && subString.endsWith("b"))
                return true;
        }
        return false;
    }
}