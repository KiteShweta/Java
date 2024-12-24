import java.util.LinkedHashMap;
public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> Lm = new LinkedHashMap<>();

        Lm.put(1, "Java");
        Lm.put(2, "C");
        Lm.put(3, "Python");
        Lm.put(10, "Javascript");

        System.out.println(Lm);

        Lm.putIfAbsent(5, "C++");
        System.out.println(Lm);

        


    }
    
}
