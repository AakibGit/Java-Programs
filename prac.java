import java.util.ArrayList;

public class prac
{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println(list.size());
        System.out.println(list);

        list.remove(3);

        System.out.println(list);

        System.out.println(list.iterator());
        System.out.println(list.iterator());
        System.out.println(list.iterator());
        System.out.println(list.iterator());

        list.clear();

        System.out.println(list);
        
    }
}