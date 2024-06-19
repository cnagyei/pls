public class LogicalANDvBitwiseAND
{
    public static void main(String arg[])
    {
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println((a > b) || (a < c)); /* true */
        System.out.println((a > b) | (a < c)); /* true */

        /* || vs | */
        System.out.println((a > b) || (a++ < c)); /* true */
        System.out.println(a); /* 10 because 2nd condition not checked */

        System.out.println((a > b) | (a++ < c)); /* true */
        System.out.println(a) ;/* 11 because 2nd condition is checked */
    }
}