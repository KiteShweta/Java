import java.util.HashSet;
import java.util.Iterator;

class Main{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(8,75);

        hs.add(5);
        hs.add(8);
        hs.add(9);
        hs.add(10);
        hs.add(11);

        System.out.println(hs);

        HashSet<Integer> evenNums = new HashSet<>();

        evenNums.addAll(hs);
        evenNums.add(120);
        evenNums.add(85);
        evenNums.add(70);

        System.out.println(evenNums);

        Iterator<Integer> iterate = evenNums.iterator();

        System.out.println("Iterator");

        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        boolean val1 = evenNums.remove(100);

        System.out.println(val1);

        boolean val2 = evenNums.removeAll(hs);
        System.out.println(val2);
        System.out.println(evenNums);

        HashSet<Integer> primeNums= new HashSet<>();

        primeNums.add(1);
        primeNums.add(20);
        primeNums.add(3);
        primeNums.add(10);
        primeNums.add(5);
        primeNums.add(7);


        System.out.println(primeNums);

        HashSet<Integer> nums= new HashSet<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(3);
        nums.add(10000);
        System.out.println(nums);

        primeNums.addAll(nums);

        System.out.println(primeNums);

        primeNums.retainAll(nums);

        System.out.println(primeNums);

      //  primeNums.removeAll(nums);

        //System.out.println(primeNums);

        System.out.println(primeNums);
        System.out.println(nums);
        nums.add(150);

        boolean result= primeNums.contains(nums);
        System.out.println(result);






    }
}