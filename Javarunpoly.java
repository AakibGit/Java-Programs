

class first
{
    void func()
    {
        System.out.println("This is First class");
    }

    void func1()
    {
        System.out.println("This is second functioin in First class");
    }
}

class second extends first
{
    void func()
    {
        System.out.println("This is second class");
    }

    void secondfunc()
    {
        System.out.println("Simple function");
    }
}
public class Javarunpoly {
    public static void main(String[] args) {
        
    first s =  new second();

    s.func();
    s.func1();
   
    }
}
