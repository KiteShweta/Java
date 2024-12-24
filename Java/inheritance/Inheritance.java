package inheritance;

class Animal{
    String name;

    public void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{

    public void eat(){
        super.eat();
        System.out.println("This method is in child class");
    }
    public void display(){
        System.out.println("My name is"+name);
    }
}

public class Inheritance{

    public static void main(String[] args) {
        Dog obj =  new Dog();

        obj.name = "Jack";

        obj.display();
        obj.eat();
    }
    
}
