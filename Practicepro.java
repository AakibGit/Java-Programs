import java.util.Scanner;

public class Practicepro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // System.out.println("how many cities are you going to enter");
        // int num = sc.nextInt();

        String[] city = new String[5];

        city[0]="pune";
        city[1]="mumbai";
        city[2]="chennai";

        System.out.println(city[0].compareTo(city[1]));

        // for(int i=0 ; i<num ;i++)
        // {
        //     System.out.println("Enter cities "+i);
        //     city[i]=sc.next();
        // }
        
        // System.out.println();
        // System.out.println("The entered cities are");
        // for(int i=0 ; i<num ;i++)
        // {
        //     System.out.println(city[i]);
        // }

        // System.out.println();
        // System.out.println("the cities reversed");

        // for(int i=(num-1) ; i>=0 ;i--)
        // {
        //     System.out.println(city[i]);
        // }
    }
}
