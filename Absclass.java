// import java.util.Random;

abstract class abs
{
    abstract void abbss();

    static void show()
    {
        System.out.println("Abstract class");
    }
}

class derived extends abs
{
    void abbss()
    {
        System.out.println("Overiding the Abstract class to access");
    }
    static void print()
    {
        System.out.println("Derived class");
    }
}

public class Absclass {
    
    public static void main(String[] args) {
    
        derived d = new derived();

        d.print();

        // Random r = new Random();

        // System.out.println(Math.ceil(r.nextInt()));        
    }
}
