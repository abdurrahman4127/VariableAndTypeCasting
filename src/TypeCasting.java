public class TypeCasting {
    public static void main(String[] args)
    {
        //manual casting...
        int integer = 128;
        byte byt = (byte) integer;
        /*
        binary representation of 128 is :
        24 0s + 1000000
        when we try to fit it in byte (stores 127 max), it'll change
        its first (sign) bit, and make it (-ve) by discording first 24 0s
         */
        System.out.println("value stored in byt is : " + byt);


        double dbl = 7.77;
        int inT = (int) dbl;
        System.out.println("value stored in inT is : " + inT);


        //using left-shift <<
        byte lShift = 2;
        lShift = (byte) (lShift << 1);
        /*
         binary representation of 2 is : 00000010
         after shifting to left by 1 digit, it'll be 00000100; and 10(binary) == 2 (decimal)
         therefore, it'll print 2, a decimal number.
         /*
         again,
         a = (byte) (a << 2); will give us :
         2 digit shifting from real position.
           00000010 == 2 (val of a, primarily)
           00001000 == 8 (val of a, currently)
         */
        System.out.println("after left shifting : " + lShift);


        //using right-shift.
        byte rShift = 2;
        rShift = (byte) (rShift >> 1); //1 is the number of digit i want to shift right to.
        /*
         binary representation of 2 is : 00000010
         after shifting to right by 1 digit, it'll be 00000001; and 1 (binary) == 1 (decimal)
         therefore, it'll print 1, a decimal number.
         /*
         again,
         a = (byte) (a >> 2); will give us :
         2 digit shifting from real position.
           00000010 == 2 (val of a, primarily)
           00000000 == 0 (val of a, currently)
         */
        System.out.println("after right shifting : " + rShift);


        //condition checking; returns either true or false
        int x = 5;
        int y = 7;
        System.out.println(x>y);

        // while(0) & while(1)
        System.out.println("true");



        short srt = 128;
        byte bt = (byte) srt;
        System.out.println("128 in byte is : " + bt); // prints -128
        /*
        binary representation of short s = 0000000010000000 since short has 16 bits.
        when we cast it to 'byte', it discards its first 8 bits (because 'byte' can hold only 8 bits),
        and it lefts out '10000000'. First bit is sign bit, so we'll have a negative value.
        so, decimal of it will be :
        -1*2^7 + 0*2^6 + 0*2^5 + .... + 0*2^0 = -128 (OUTPUT)
         */

        short a = 255;
        byte b = (byte) a;
        System.out.println("225 in byte is : " + b); // prints -1
        /*
        binary representation of short b = 0000000011111111 since short has 16 bits.
        when we cast it to 'byte', it discards its first 8 bits (because 'byte' can hold only 8 bits),
        and it lefts out '11111111'. First bit is sign bit, so we'll have a negative value.
        so, decimal of it will be :
        -1*2^7 + 1*2^6 + 1*2^5 + 1*2^4 + .... + 1*2^0 = -1 (OUTPUT)
         */


        byte f = 5;
        byte g = (byte) (f + 5);
        System.out.println(g);
    }
}
