
import java.util.Scanner;

public class Armstrong {
 
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int arm=0,s,r;

        System.out.println("Enter Number to Check Armstrong Number");
        int num = sc.nextInt();
        s = num;

        while(num!=0)
        {
            r = num%10;
            arm+=r*r*r;
            num/=10;
        }

        if(arm==s)
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not a Armstrong number");
        }
        
    }
}
