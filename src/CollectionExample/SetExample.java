package CollectionExample;
import java.util.*;
public class SetExample {
    public static void main(String[] args) {
        Set<String> str = new HashSet<>();
        str.add("Alice");
        str.add("Bob");
        str.add("Alice");
        System.out.println(str);
    }
}
