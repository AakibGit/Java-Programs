import java.util.*;

class Main
{
    public static void main(Stringgs[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Age\n");
        
        int age = sc.nextInt();

        // System.out.println("You Entered your age ");
        System.out.println("You Entered your age "+age);

        if(age>18)
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Not Adult");
        }

    }
}