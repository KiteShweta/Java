import java.util.TreeMap;
public class TreeMaps {

    public static void main(String[] args) {
        TreeMap<String,Integer> Tm = new TreeMap<>();

        Tm.put("Two", 2);
        Tm.put("One", 10);

        Tm.putIfAbsent("Six", 50);

        System.out.println(Tm);

        TreeMap<String, Integer> num = new TreeMap<>();

        num.put("three", 3);
        num.putAll(Tm);

        System.out.println(num);

        System.out.println(Tm.entrySet());
        System.out.println(num.keySet());
        System.out.println(num.values());

        num.replace("Four", 44);
        num.remove("One");

        System.out.println(num);

        String firstKey = num.firstKey();
        System.out.println(firstKey);

        String lastkey = num.lastKey();
        System.out.println(lastkey);

        System.out.println(num.lastEntry());
        System.out.println(num.firstEntry());

        System.out.println(lastkey);

        System.out.println(num.pollFirstEntry());
        System.out.println(num.pollLastEntry());

        System.out.println(num);

        num.put("Two", 2);
        num.put("One", 10);
        num.put("Three", 23);

        num.put("four", 12);

        num.put("five", 1);

        num.put("Six", 3);

        System.out.println(num);

        System.out.println(num.headMap("four"));

        System.out.println(num.tailMap("five",true));

        System.out.println(num.subMap("five", false,"six"));





    }
    
}
