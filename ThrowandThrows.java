public class ThrowandThrows {
    
    public static void div(int a ,int b) throws ArithmeticException {
        
        int c;

        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            c = a/b;
            System.out.println("The value is "+c);
        }
    }
    public static void main(String[] args) {


        try
        {
            
            div(10,0);
        }
        catch(Exception e)
        {
            System.out.println("Error occured");
        }
    }
}
