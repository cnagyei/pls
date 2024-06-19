public class Variable1
{
    public static void main(String arg[])
    {
        int b = 15;
        int c = 13;
        int z = 19;

        int sum = b + c + z;

        System.out.println(sum);
    }
}

class StartJava
{
    public static void main(String arg[])
    {
        byte a = 40;
        byte x = 20;
        byte c = (byte)(a + x);
        System.out.println(c);

        //Logical AND
        if ((a >= x) && (a >= c))
        {
            System.out.println("A is less than 20");
        }

        //Bitwise AND
        if ((a >= x) & (a >= c))
        {
            System.out.println("A is less than 20");
        }

        //Logical OR
        if ((a >= x) || (a >= c))
        {
            System.out.println("A is less than 20");
        }
        
        //Bitwise
        if ((a >= x) | (a >= c))
        {
            System.out.println("A is less than 20");
        }

    }

    // Single line commenting

    /**
     * This is a multi line commenting
     */

}