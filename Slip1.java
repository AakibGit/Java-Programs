import java.io.*;

class Slip1
{

public static void main(String args[])
{

  FileInputStream f1;
   try
 {
   f1=new FileInputStream(args[0]);
  int ch,c;
    while((ch=f1.read())!=-1)
    {
   
    // System.out.println("CHARACTER==="+(char)ch);
    if(Character.isSpaceChar(ch))
     {
        System.out.println("Entered Character Is Space");
     }
     if(Character.isDigit(ch))
     {
         System.out.println("Entered Character is Digit");
     }
     if(Character.isLetter(ch))
     {
         System.out.println("Entered Character is Alphabet");
        if(Character.isLowerCase(ch))
         {
             c=Character.toUpperCase(ch);
             System.out.println("After Changing the Case "+(char)c);
         }
         else
         {
            c=Character.toLowerCase(ch);
            System.out.println("After Changing the Case " +(char)c);  
         }
      }
     }

    }
catch(Exception e)
 {
System.out.println(e);
}
}
}