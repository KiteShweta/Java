package methodOverloading;

public class methodOver {


    private static String display( String name){
        return name;
    }

    private static void display(int a){
        System.out.println("Arguments: "+a);
    }

    private static void display(int a, int b){
        System.out.println("Arguments: "+a+"and "+b);
    }
    public static void main(String[] args) {
       // methodOver mo = new methodOver();

       methodOver.display(20);
       methodOver.display(10,85);
       methodOver.display("Shweta");
    }
    
}
