import java.io.*;
import java.lang.*;

class Slip2
{
 public static void main(String args[])
 {
   
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
 int n,i,j;
  System.out.println("How many cities?");
  n=Integer.parseInt(br.readLine());
  String city[]=new String[n];
   for(i=0;i<n;i++)
 {
  System.out.println("Enter City=");
  city[i]=br.readLine();
 }
System.out.println("Display City:");
for(i=0;i<n;i++)
System.out.println(city[i]);
 
 for(i=0;i<n;i++)
 {
  for(j=i+1;j<n;j++)
   {
              if((city[i].compareTo(city[j]))<0)
  {
  String temp=null;
  temp=city[i];
  city[i]=city[j];
  city[j]=temp;
  }
   }
       }

System.out.println("Display City in descending order:");
for(i=0;i<n;i++)
System.out.println(city[i]);
}
catch(Exception e)
 {
 }
  }
}