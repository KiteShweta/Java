package methodOverloading;

public class DefaultConstructor {

    int a;
    boolean b;
    String str;
    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        
        System.out.println("Default value");
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.str);

    }

    
}
