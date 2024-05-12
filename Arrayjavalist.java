import java.util.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Arrayjavalist
{
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();
        LinkedList<String> list = new LinkedList<String>();

        array.add("list1");
        array.add("list2");
        array.add("list3");
        array.add("list4");

        list.add("java");
        list.add("python");
        list.add("c/c++");

        System.out.println(array);
        System.out.println(list);
    }
}