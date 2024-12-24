package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
     public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6};

        int[] positiveNumbers = numbers;

        for(int i=0; i<positiveNumbers.length;i++){
            System.out.println(positiveNumbers[i]);
        }

        int [] source = {10,20,30,40};
        int[] destination = new int [5];

        for(int i=0;i<source.length;i++){
            destination[i]=source[i];
        }

        for(int i:destination){
            System.out.println(i);
        }

        int[] n1 = {11,22,44,66,7,7};
        int[] n2 = new int[5];
        int [] n3 = new int[n1.length];

        System.arraycopy(n1, 0, n3, 0,n1.length);
        System.out.println("n3= "+Arrays.toString(n3));

        System.arraycopy(n1, 2, n2, 1, 2);
        System.out.println(Arrays.toString(n2));


        int[] a={1,2,2,0,5};

        int[] b= Arrays.copyOfRange(a, 0, a.length);

        System.out.println(Arrays.toString(b));

        int[] c=Arrays.copyOfRange(a, 2, 5);
        System.out.println(Arrays.toString(c));

     }
}
