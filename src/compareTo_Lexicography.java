public class compareTo_Lexicography {
    public static void main(String[] args)
    {
        String a = "Abdur Rahman 11";
        String b = "Abdur Rahman 111";
        String c = "Thao Nhi";

        System.out.println(a.compareTo(b));

        //compareTo method returns integer, so if wanna store, use integer variable
//        int result = a.compareTo(b);
//        System.out.println(result);

        // seeing the bigger text
        checkLexicographically(a,c);
    }

    static void checkLexicographically(String x, String y) {
        // if x < y, then x.compareTo(y) will return (-ve) integer
        // if x > y, then x.compareTo(y) will return (-ve) integer
        // if x == y, then x.compareTo(y) will return 0

        int result2 = x.compareTo(y);

        if(result2 == 0)
            System.out.println("both " + x + " & " + y + " are same");
        else if(result2 > 0)
            System.out.println(x + " is bigger than " + y);
        else if (result2 < 0)
            System.out.println(x + " is smaller than " + y);
    }
}
