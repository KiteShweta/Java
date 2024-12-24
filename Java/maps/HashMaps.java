import java.util.HashMap;
public class HashMaps{
    public static void main(String[] args) {
        HashMap<String,Integer> Hm = new HashMap<>();

        System.out.println(Hm);

        Hm.put("Apple", 1);
        Hm.put("banana", 5);
        Hm.put("Orange", 1);
        System.out.println(Hm);

       int num= Hm.get("Apple");

        System.out.println(num);

        System.out.println("Keys from the map: "+Hm.keySet());
        System.out.println("Values of map "+ Hm.values());
        System.out.println("Entries in Map "+Hm.entrySet());

        Hm.replace("Apple", 100);
Hm.replaceAll((key,value)->value= value+1);
        System.out.println(Hm);


        Hm.remove("Apple");

        System.out.println(Hm);

        Hm.
    }
}