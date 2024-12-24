package staticKey;

class StaticTest{

    //static variable

    static int max=10;

    //non static variable

    int min=5;


    //non static method

    int multiply(int a, int b){
        return a*b;
    }
    //static method

    static int add(int a,int b){
        return a+b;

    }
}

public class StaticKeyword {

public static void main(String[] args) {
    StaticTest obj=new StaticTest();

    System.out.println(obj.multiply(10, 20));
    System.out.println(obj.min+1);

    System.out.println(StaticTest.add(20, 30));
    System.out.println(StaticTest.max-1);
}
    
}
