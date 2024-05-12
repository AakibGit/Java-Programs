
class parent
{
    parent()
    {
        System.out.println("Parent class");
    }
    parent(int a)
    {
        System.out.println(a);
    }
}

class child extends parent
{
    child(int b)
    {
        super(b);
        System.out.println("child class");
    }
}

public class Superkeyword {
    
    public static void main(String[] args) {
        
        child c = new child(10);

    }
}
