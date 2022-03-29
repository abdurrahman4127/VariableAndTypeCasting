public class wordCount {
    public static void main(String[] args)
    {
        String a = "Abdur Rahman";
        String b = "L Lawliet";
        String c = "Spike Spiegel";

        System.out.println(c.length());

        int space = 0;

        for (int i=0; i<b.length(); i++) 
        {
            //add 1 to count if any space is found at any index
            if(b.charAt(i) ==' ') {
                space++;
            }
        }
        
        System.out.println(space + 1); // space comes between two words; (n) space = (n + 1) words
    }
}
