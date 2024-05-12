public class Trycatch {
    
    public  static void main(String args[])
    {
        int a = 10 ;
        int b = 2;  
        try
        {
            
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error "+e);
        }

        finally
        {
            System.out.println("This Statement will execute in evry situation");
        }
    }
}
