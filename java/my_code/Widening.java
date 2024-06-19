public class Widening
{
    public static void main(String args[])
    {
        float f = 10.5f;
        
        /* Typecast float to int */
        int a = (int)f;

        System.out.println(f);
        System.out.println(a);

        /* Overflow */
        System.out.println("Overflow");
        System.out.println("=========");

        int x = 130;
        byte b = (byte)x;
        
        System.out.println(x);
        System.out.println(b);

        /* Adding a lower type */
        System.out.println("Adding a lower type");
        System.out.println("=========");
        
        byte p = 10;
        byte q = 10;
        /* byte c=a+b;//Compile Time Error: because a+b=20 will be in */
        byte r = (byte)(p + q);
        System.out.println(r);
    }
}