class Buildings
{
    public static void main(String args[])
    {
        System.out.println("Hello, Java Class!");
    }
}

class Human
{
    public static void main(String args[])
    {
        int x = 1;
        int y = 5;
        int z = x + y;

        System.out.println("I'm a human");
        System.out.println(z);
    }

    double addition(int x, int y)
    {
        // Binary Numeric Promotion
        byte a = 4;
        byte b = 6;
        byte c = (int)(a + b);

        float x = 5.6;
        double y = 5.696;
        double answer =  (double)(x + y);
        return (x + y);
    }
}