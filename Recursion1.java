package Javapractices;

import java.util.Scanner;

public class Recursion1 {
    
    public static int sum(int n)
    {

        if(n==0){ 
            return 0;
         }
         
         return n + sum(n-1);
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to get sum from 1 to enter number");
        int num = sc.nextInt();
        
        int total = sum(num);

        System.out.println(total); 
    }
}
