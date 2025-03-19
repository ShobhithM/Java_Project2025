package CollectionExample;
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(101,"Alice");
        student.put(102,"Bob");
        System.out.println(student.get(101));
    }
}
