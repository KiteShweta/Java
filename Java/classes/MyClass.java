package classes;


public class MyClass {
    int gear=5;

    String name="myBicycle";

    public void breaking(){
        System.out.println("Braking");
    }
    
    public static void main(String[] args) {
        
        MyClass mc = new MyClass();

        mc.breaking();
        int num=mc.gear;
        String name=mc.name;

        System.out.println(num +" "+ name);

    }
}
