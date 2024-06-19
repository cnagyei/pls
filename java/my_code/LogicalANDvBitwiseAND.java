public class LogicalANDvBitwiseAND
{
    public static void main(String arg[])
    {
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println((a < b) && (a++ < c)); /* false */
        System.out.println(a); /* 10 because second condition is not checked */

        System.out.println((a < b) & (a++ < c)); /* false && true = false */
        System.out.println(a); /* 11 because second condition is checked */
    }
}