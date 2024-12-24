package collections;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        animals.add("Dog");
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");

        System.out.println(animals);

        animals.add(1,"Horse");

        System.out.println(animals);

        String str = animals.get(3);

        System.out.println(str);

        animals.set(4,"mamal");

        System.out.println(animals);

        animals.remove(2);

        System.out.println(animals);

        animals.clear();

        System.out.println(animals);

        animals.size();
        System.out.println(animals);

        
    }
    
}
