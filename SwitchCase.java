import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int btn = sc.nextInt();

        switch(btn)
        {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3: System.out.println("banjor");
            break;
            default: System.out.println("Hello");
            break;
        }
    }
}
