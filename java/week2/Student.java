// Writing objects from classes with 'new' keyword
// Main method is inside the class
class Student
{
    int id = 10;
    String name = "Every student";

    public static void main(String args[])
    {
        // firt Student Object
        Student john = new Student();
        john.id = 6;
        john.name = "Bobby";
        System.out.println("==========");
        System.out.println("Details for John:");
        System.out.println(john.id);
        System.out.println(john.name);
        System.out.println("==========");

        // second Student object
        System.out.println("Details for sam:");
        Student sam = new Student();
        System.out.println(sam.id);
        System.out.println(sam.name);
        System.out.println("==========");
    }
}