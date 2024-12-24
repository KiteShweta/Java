package Array;

public class NewArray {
    public static void main(String[] args) {
        
    
    String [] names = new String[4];

    int [] ages = new int[100];

    names[0] = "Joey";
    names[1] = "Hari";
    names[2] = "Soni";
    names[3] = "Mark";

    int[] numbers = {10,20,30,40,50};

    System.out.println(numbers[2]);


    for (int i=0;i<numbers.length;i++){
        System.out.println(numbers[i]);
    }

    for(int a : numbers){

        System.out.println(a);

    }
    }
}
