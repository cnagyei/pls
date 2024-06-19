public class RightShiftTypes
{
    public static void main(String arg[])
    {
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println((a < b) && (a < c)); /* false */
        System.out.println((a < b) & (a < c)); /* checks both */
    }
}