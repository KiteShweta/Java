package collections.vector;
import java.util.Vector;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>();

        System.out.println(mammals);

        mammals.add("Dog");
        mammals.add("tiger");
        mammals.add("lion");
        mammals.add("cat");
        mammals.add(4, "elephant");
        System.out.println(mammals);

        Vector<String> animals =  new Vector<>();

        animals.add("Crocodile");

        animals.add("horse");

        System.out.println(animals);

        animals.addAll(mammals);

        System.out.println(animals);

      String str =  animals.get(3);

        System.out.println(str);

        animals.set(3, "zero");

        System.out.println(animals);

        //using iterator method

        Iterator<String> iterate = animals.iterator();

        while(iterate.hasNext()){
        System.out.println(iterate.next());
    }

    animals.remove(3);
    System.out.println(animals);

    //removeAll(less efficient)

    animals.clear();
    System.out.println(animals);

    
    System.out.println(animals.size());
    }
    
}
