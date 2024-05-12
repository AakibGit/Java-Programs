import java.util.ArrayList;

import java.util.*;

public class Arraynestedlist {
    public static void main(String[] args) {
        
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("list1");
        arr.add("list2");

        ArrayList<String> arr1 =  new ArrayList<String>();
        arr1.add("1");
        arr1.add("2");

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("Python");
        arr2.add("Java");

        ArrayList<ArrayList<String>> nestarr = new ArrayList<>();
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(arr2);

        nestarr.add(arr);
        nestarr.add(arr1);
        nestarr.add(arr2);
        System.out.println(nestarr);
        System.out.println(nestarr.get(2).get(1));
    }
}
