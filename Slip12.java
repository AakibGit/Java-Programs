import java.util.*;

class student

{

	int rno;

	String name;

	float per;

	student()

	{

		System.out.println("You are in default constructor :");

	}

	student(int rno,String name,float per)

	{

		this.rno=rno;

		this.name=name;

		this.per=per;

	}

	static int cnt=0;

	static void  obj()

	{

		cnt++;

		System.out.println("Object created :"+cnt);

	}

	void display()

	{

		System.out.println("Student roll no:"+rno);

		System.out.println("Student name:"+name);

		System.out.println("Student percentage:"+per);

	}


}

class Slip12
{
    public static void main(String a[])

	{

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter How many student information do you want to store ?");

		int n=sc.nextInt();

		student s=new student();

		student s1[]=new student[n];

		for(int i=0;i<n;i++)

		{

			System.out.println("Enter Student roll no :");

			int rno=sc.nextInt();

			System.out.println("Enter Student name :");

			String name=sc.next();

			System.out.println("Enter Student percentage :");

			float per=sc.nextFloat();

			s1[i]=new student(rno,name,per);

			s1[i].obj();

			s1[i].display();

		}

		

	}
}