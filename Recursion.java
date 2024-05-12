public class Recursion
{

    
    static void loop(int n)
    {
        if(n>=0)
        {
            System.out.println(n);
            loop(n-1);
        }
    }
    public static void main(String[] args) {
        
        int n = 10;

        Recursion r = new Recursion();
        r.loop(n);
    }
}