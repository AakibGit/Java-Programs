class Teacher
{
    String tname;
    int tid;

    void show()
    {
        System.out.println("The Teacher name is "+ this.tname);
        System.out.println("The Teacher id is "+ this.tid);

    }

    void parent()
    {
        System.out.println("This is method of parent class ");
    }
}

class student extends Teacher
{
    int rollno;
    String name;

    void show()
    {
        System.out.println("The roll no is "+ this.rollno);
        System.out.println("The Name is "+ this.name);

    }

    void childclass()
    {
        System.out.println("this is a method ");
    }
}


public class Objects {
    public static void main(String[] args) {
    
    Teacher t1 = new student();

    t1.show();
    // t1.parent();
    
    }
}
