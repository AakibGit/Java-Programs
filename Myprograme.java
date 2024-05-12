import java.util.Random;
import java.util.Scanner;

class Window
{
    public String choice;
    public int player;
    Scanner sc = new Scanner(System.in);

    public void Game()
    {
        System.out.println("     Guss Game in Java    ");
        System.out.println("To Start Game Press Y Or To Exit Press N");
        choice = sc.next();

        if(choice=="y" || choice=="Y")
        {           
            System.out.println("Enter number to guess correct one ");

        }
    }

    Window()
    {   
        Game();
    }
}
public class Myprograme {
    
    public static void main(String[] args) {

        new Window();
    
    }
}
