public class Main4 {
    // Method Overloading

    //method with no parameter
    private static String display(String a){
        System.out.println("This is without parameter"+a);
        return a;

    }

    //Method with single parameter
    private static int display(int a){
    System.out.println("Arguments: "+a);
    return a;
    }

    //Method with 2 parameters
    private static void display(int a,int b){
        System.out.println("Arguments: "+a +"and "+ b);
    }

    public static void main(String[] args) {
        Main4 obj = new Main4();

        obj.display(100);

        obj.display(10, 20);
    }
}
