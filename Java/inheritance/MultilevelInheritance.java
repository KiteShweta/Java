package inheritance;

class Car{

    void display(String name){
        System.out.println("I am Car! " + name);
    }

}

class Car1 extends Car{
//derived class
    void start(){
        System.out.println("I have Sarted");
    }
}

class Car2 extends Car1{

    void stop(){

        System.out.println("Stopped");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {
        Car2 obj = new Car2();

        obj.display("Ford");
        obj.start();
        obj.stop();
    }
    
}
