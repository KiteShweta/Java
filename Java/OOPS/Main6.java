public class Main6 {
    
    String language;

    //No-arg contructor
    Main6(){
        System.out.println("This is no-args constructor");

    }

    Main6(int a){
        System.out.println(a);
    }

    //Parameterised constructor
    Main6(String lang){
        language = lang;
        System.out.println(language+ " Programming language");

    }

    public static void main(String[] args) {
        Main6 obj1 = new Main6(100);
        Main6 obj2 = new Main6("Java");
    }
}
