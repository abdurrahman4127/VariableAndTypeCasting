/*
     String in-build functions.
     mutable : class/Object that can be changed (muted); such as class, array
     immutable : class/Object that can't be changed (muted); such as string or anything with 'final' keyword
*/

class Points {
    double x, y;

    public Points(double a, double b) {
        x = a;
        y = b;
    }

    //overriding toString() methode; it's build-in
    @Override
    public String toString() {
        return "Points (" + "x = " + x + " , y = " + y + ')';
    }
}

public class PlayingWithString {

    static int changeValue(int x) {  //pass by value
        x = 60;
        return x;
    }

    //pass by reference
    static void changeTheValueByReference(int []x) {
        x[1] = 60; //changing the 2nd element
    }

    //reversing the string...
    static void reverseTheStrings(String s) {
        for (int i=s.length() - 1; i>=0; i--) //(i=size-1; i>=0; i--)
        {
            System.out.println(s.charAt(i));
        }
    }

    //finding ASCII value...
    static void printAsciiCode(String s) {
        for (int i=0; i<s.length(); i++) {
            System.out.println("value of : " + s.charAt(i) + " is : " + s.codePointAt(i));
        }
    }

    public static void main(String[] args)
    {
        int a = 50;

        System.out.println("before calling the methode : " + a);
        a = changeValue(a);
        System.out.println("after calling the methode : " + a);

        /*          we don't need to call static function if we do this .....
        PlayingWithString change = new PlayingWithString();
        new PlayingWithString().changeValue(a); //don't need reference; creating an object and calling the methode (same, but better)
         */

        System.out.println();

        int []arr = {10, 20};
        System.out.println("before calling the function : " + arr[0] + "," + arr[1]);
        changeTheValueByReference(arr);
        System.out.println("after calling the function : " + arr[0] + "," + arr[1]);

        System.out.println();

        //toString();
        Points p1 = new Points(10,20);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println(p1); //reference address

        //String build-in functions
        String s1 = "Hello";
        String s2 = new String("World"); //class-obj possible for String & Array

        System.out.println(s1 == s2); //compares address
        System.out.println(s1.equals(s2)); //compares value
        System.out.println(s1.equalsIgnoreCase(s2)); //compares ignoring case
        System.out.println(s1.length());//finds length
        System.out.println(s1.charAt(2)); //to see the character at an index

         //to see all characters
        for (int i=0; i<s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        //reversing using a methode
        reverseTheStrings(s1);

        //to replace
        System.out.println(s1.replace("o","")); //replacing 'o' with nothing. creates a new object (doesn't change s1)
        System.out.println(s1); //changing a string doesn't affect its original copy as its immutable

        // trimming
        String s3 = new String(" Abdur Rahman   ");
        String s4 = s3.trim(); //trims the extra spaces before/after the string
        System.out.println(s4);

        // checking if it's empty
        String s5 = new String("");
        System.out.println(s5.isEmpty()); //true if empty; false otherwise

        // starts-ends with
        System.out.println(s2.startsWith("wo")); //checks if it started with "**"
        System.out.println(s2.endsWith("dd")); //checks if it ended with "**"

        //ASCII value conversion :
        printAsciiCode(s1); //calling methode
        System.out.println("AR".codePointAt(1)); //A in 0 index, B in 1

        //String to integer...
        String m = "5"; //this is in String form; not in integer
        String n = "2";

        int x = Integer.parseInt(m);
        int y = Integer.parseInt(n);
        System.out.println(x + y);

        System.out.println(Integer.parseInt(m) + Integer.parseInt(n));
    }
}
