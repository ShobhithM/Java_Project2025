package CollectionExample;
import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(66);
        queue.add(33);
        queue.add(12);
        System.out.println(queue.poll());
    }
}
