public class IntroToVariables {
    public static void main(String[] args)
    {
        //primitive types :

        byte byt = 127; // stores  8 bits
        /* byte storing...
        max : (0)1111111 == 2^7 - 1 == 127
        max : (1)0000000 ==   -2^8  == -128
        */

        int i = 5; // limit : -2^31 to 2^31 - 1
        float flt = 1.5F; // stores 32 bits
        double dbl = 4.56; // stores 64 bits
        char chr = 'A'; //single quote is for char, 16 bits (2 bytes; in c, it was 1 byte)
        long lng = 545754L; // 64 bits
        short srt = 231; // 16 bits
        boolean bool = true;  // 1 bit.

        //reference type :
        String s1 = "Cristiano Ronaldo";
        String s2 = new String("Cristiano Ronaldo"); //because it's reference type (not primitive)
        /*
        double quote is for char; 'S' upper-case;
        one character from String worth 16 bits.
        "Thao Nhi" = (4+1+3) * 16 ; space is a character too. [umm, Nhi is my lover]
        */
    }
}


