package collections.queue;

import java.util.PriorityQueue;

public class Main2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);

        numbers.offer(5);
        System.out.println(numbers);

        int num = numbers.peek();
        System.out.println(num);

        boolean result = numbers.remove(2);
        System.out.println(numbers + " "+result);

       int num1= numbers.poll();
       System.out.println(numbers);

    }
    
}
