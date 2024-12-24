package collections;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("jack");
        arr.add("joy");
        arr.add("mark");

        System.out.println(arr);

        String str = arr.get(0);

        System.out.println(str);

        arr.set(0, "JOhn");

        System.out.println(arr);

        arr.remove(1);

        System.out.println(arr);

        for(String s:arr){
            System.out.println(s);
        }



        
    }
    
}
