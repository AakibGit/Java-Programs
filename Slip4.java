class Student
{
    int rollno;
    static int count;
    String name;

    Student()
    {   
        System.out.println("Default coonstructor");
    }

    Student(int rll,String n)
    {
        this.rollno = rll;
        this.name = n;
        count++;
        System.out.println("Object Created "+count);
    }

    public String toString()
    {
        return "ToString method";
    }
}

public class Slipq4 {
    public static void main(String[] args) {
        
        Student[] s = new Student[10];

         s[0] = new Student(101, "java");
         s[1] = new Student(102, "python");
         s[2] = new Student(103, "Javascript");

    }
}
