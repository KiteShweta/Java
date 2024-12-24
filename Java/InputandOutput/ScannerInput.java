import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        

        System.out.println("Enter a num:");
        int number = sc.nextInt();
        System.out.println("Entered a num:" + number);
  
       System.out.println("Enter a name:");
       String name = sc.next();

        int a,b,c,res;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        res=a+b+c;

        //getting float input
        System.out.println("result="+res);
        float myFloat = sc.nextFloat();
        System.out.println("Float Entered:"+myFloat);

        //Getting string input
        System.out.println("Enter String ");
        String myStr = sc.next();
        System.out.println("String Entered:"+myStr);

        sc.hasNext();

         //close scanner object
         sc.close();
    }
}
