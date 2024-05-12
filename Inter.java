
interface abs
{
    void p1();
    void p2();
}

interface abs1
{
    void p3();
    void p4();
}

class inherit implements abs,abs1
{
    public void p1()
    {
        System.out.println("interface 1st method");
    }

    public void p2()
    {
        System.out.println("interface 2nd method");
    }

    public void p3()
    {
        System.out.println("interface 1st method from 2nd interface");
    }

    public void p4()
    {
        System.out.println("interface 2nd method from 2nd interface");
    }
    
}

public class Inter {
    public static void main(String[] args) {
        
        inherit i = new inherit();

        i.p1();
        i.p2();
        i.p3();
        i.p4();
    }
}
