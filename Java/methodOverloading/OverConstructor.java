package methodOverloading;

public class OverConstructor {

    String language;

    OverConstructor(){
        System.out.println("This is no-args constructor");

    }

    OverConstructor(String lang){
        language=lang;
        System.out.println(language+" Programming language");
    }
   
    OverConstructor(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        OverConstructor obj1 = new OverConstructor();
        OverConstructor obj2 = new OverConstructor("shweta");
        OverConstructor obj3= new OverConstructor(10);



    }
    
}
