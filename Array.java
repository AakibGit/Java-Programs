import java.util.*;

public class Array {
    
    public static void main(Stringgs[] args)
    {
        int[][] arr = new int[2][3];
        int i,j;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter The Elements In Array");

        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
