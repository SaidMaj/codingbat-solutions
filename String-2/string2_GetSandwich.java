public class string2_GetSandwich{

    public static void main(String[] args) {
        System.out.println(getSandwich("breadxbread"));
    }

    public static String getSandwich(String str) {

        // here will be stored the first apperances of word "bread"
        int firstIndex = str.indexOf("bread") + 5;
        // here will be stored the last apperances of word "bread"
        int secondIndex = str.indexOf("bread", str.length()/2 + 1);

        if(firstIndex == -1 || secondIndex == -1)
            return "";

        return str.substring(firstIndex , secondIndex);
    }
}