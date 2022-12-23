package java_tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class JavaList {
    public static void main(String[] args) {
        // create new list
        List<String> lists = new ArrayList<>();

        // add item
        lists.add("Java");
        lists.add("C++");
        // Gan vi tri index cho item
        lists.add(1, "Python");
        lists.add("PHP");
        System.out.println("Phan tu co index = 2 : " + lists.get(2));
        for (String list : lists){
            System.out.println(list);
        }
        // create new array
        String[] arr = { "Java", "C++", "PHP", "Python" };
        // convert array to List
        List<String> list = Arrays.asList(arr);
        // show list
        for (String s : list) {
            System.out.println(s);
        }
        ListIterator<String> itr = list.listIterator();
        System.out.println("Duyet cac phan tu tu dau den cuoi : ");
        while (itr.hasNext()){
            System.out.println("\t" + itr.next());
        }
        System.out.println("Duyet cac phan tu tu cuoi ve dau : ");
        while (itr.hasPrevious()){
            System.out.println("\t" + itr.previous());
        }
        //foreach
        List<String> names = Arrays.asList("Larry", "Steve", "James");

        names.forEach(System.out::println);
        names.forEach(name -> System.out.println(name));
    }
}
