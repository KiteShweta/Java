package collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;


public class Main3 {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(5);
        numbers.add(8);
        numbers.add(5);
        numbers.add(2);

        System.out.println(numbers);

        class CustomComparator implements Comparator<Integer>{
            public int compare(Integer num1, Integer num2){
                int value = num1.compareTo(num2);

                if(value>0){
                    return -1;
                }
                else if(value<0){
                    return 1;
                }else{
                    return 0;
                }
            }
        }
    }
}
