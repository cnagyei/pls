// Writing objects from classes with 'new' keyword
// Main method is outside of the class
public class Bird
{
    int id = 10;
    String name = "Every bird";
}

class BirdBehavior
{
    public static void main(String args[])
    {
        // firt Student Object
        Bird finch = new Bird();
        finch.id = 2222;
        finch.name = "Love";
        System.out.println(finch.id);
        System.out.println(finch.name);
    }
}