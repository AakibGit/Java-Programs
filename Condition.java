import java.util.Scanner;


public class Condition {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your marks ");
        int marks = sc.nextInt();

        if(marks==35)
        {
            System.out.println("pass");
        }
        else if(marks<35)
        {
            System.out.println("fail");
        }
        else if (marks>35) {
            System.out.println("great number ");
        }
        else
        {
            System.out.println("invalid option");
        }
        
        

    }
}
