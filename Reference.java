
class student
{
    int rollno;
    String name;

    void show()
    {
        System.out.println("The roll no is "+ this.rollno);
        System.out.println("The Name is "+ this.name);

    }
}

public class Reference {
    public static void main(String[] args) {
    
        student stu  = new student();
        student stu1;


        stu.rollno = 110;
        stu.name = "programmer";

        stu.show();

        stu1 = stu;
        stu1.show();

        stu1.rollno = 120;
        stu1.name = " java programmer";

        stu.show();
    }
}
