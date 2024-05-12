import java.io.File;
import java.io.IOException;

public class Filehandling
{
    public static void main(String[] args) throws IOException {
        File f = new File("C:/Users/aakib/Desktop/javafile.txt");

        if(f.createNewFile())
        {
            System.out.println(f.canExecute());
            System.out.println(f.canRead()); 
            System.out.println(f.canWrite()); 
            System.out.println(f.getAbsoluteFile()); 
        }
        else{
            System.out.println("File not created");
        }
    }
}