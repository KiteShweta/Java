package methodOverloading;

public class Constructors {

    private String name;

    //constructor

    Constructors(){
        System.out.println("Constructor called");
        name ="John";
    }
    
    public static void main(String[] args) {
        Constructors obj = new Constructors();

        System.out.println(obj.name);
    }
}
