import java.util.Scanner;

class employee
{
    public int id;
    public Stringgs name;

        employee(int id , Stringgs name)
        {
            this.id = id;
            this.name = name;
        }

        employee(){}

        public void print()
        {
            System.out.println("The id is "+this.id);
            System.out.println("The Name is "+this.name);
        }     
}

class programme extends employee
{
    public Stringgs pro_name;

    programme(Stringgs lang)
    {
        this.pro_name = lang;
    }

    public void  dis()
    {
        System.out.println("The language of programmer is "+this.pro_name);
    }
}

public class Oops {
    public static void main(Stringgs[] args) {
        Scanner sc = new Scanner(System.in);

        employee e = new employee(11,"programmer");
        programme p = new programme("java");

        e.print();
        p.dis();

    }
}



