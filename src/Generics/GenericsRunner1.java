//import src.Generics.MyCustomList111;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner1 {
    static <X> X doSomething(X value) {
        return value;
    }
    static <X extends List> void duplicate(X list) {
        list.add(list);
    }
    public static void main(String[] args) {
        String text = doSomething("Hello");
        Integer value = doSomething(Integer.valueOf(7));
        ArrayList<String> list = doSomething(new ArrayList<String>(List.of("A", "B", "C")));
                duplicate(list);
        System.out.println(list);
        LinkedList<Integer> list2 = doSomething(new LinkedList<Integer>(List.of(1, 2, 3)));
        duplicate(list2);
        System.out.println(list2);
    }
}