public class Main5 {
    public String name;

    //constructor
    Main5(){
        System.out.println("Constructor called!");
        name = "John";
    }
    

    public static void main(String[] args) {
        Main5 obj = new Main5();
        System.out.println("The name is: "+ obj.name);
    }

}
