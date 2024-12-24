package collections.queue;
import java.util.Queue;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(5);
        System.out.println(numbers);


        int accessedNumber = numbers.peek();
        System.out.println(accessedNumber);

        int removedNum =numbers.poll();
        System.out.println(numbers);

    }
    
}
