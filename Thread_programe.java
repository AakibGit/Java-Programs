
class First extends Thread
{
        public void run()
        {
            System.out.println("Override");
        }
}

// class First implements Runnable
// {
//     public void run()
//     {
//         System.out.println("override");
//     }
// }

public class Thread_programe {
    
    public static void main(String[] args) {
        
        First f = new First();
        f.start();
    }
}
