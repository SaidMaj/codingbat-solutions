public class string1_MakeTags
{
    public static void main(String[] args)
    {
      System.out.println(makeTags("i", "item"));
    }


 public static String makeTags(String tag, String word) {
        return ( "<" + tag + ">") + word + ( "</" + tag + ">");
}

}


