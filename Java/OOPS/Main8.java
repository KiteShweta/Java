 //Static Keyword example

class StaticTest{

    //non-static variable
    int min = 1;

    //static variable
    static int max = 10;


    //non-static method
    int multiply(int a,int b){
        return a*b;
    }

    //static method
    static int add(int a,int b){
        return a+b;
    }
}

public class Main8 {
    public static void main(String[] args) {
        StaticTest s = new StaticTest();

        //call nonstatic method
        System.out.println("a*b: "+ s.multiply(10,20));

        //call static method
        System.out.println("a+b: "+ StaticTest.add(100, 200) );

        //non-static variable
        System.out.println("min+1: "+ (s.min+1));

        //static variable
        System.out.println("max+1: "+ (StaticTest.max+1));

    }
}
