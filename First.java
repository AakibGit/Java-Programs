import java.util.*;

public class First {
    public static void main(Stringgs[] args)
    {
        int i;
        // int[] arr = {1,2,3,4,5};
        int[] arr = new int[5];
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Element In The Array ");

        for(i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        
        for(i=0;i<5;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
