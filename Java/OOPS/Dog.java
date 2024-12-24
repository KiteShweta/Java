class Animal{
    //Parent
    //protected method
    protected void display(){
        System.out.println("This is Parent class");
    }
}


class Dog extends Animal{

    //child class
    public static void main(String[] args) {
        Dog d = new Dog();

        //accessing protected  method
        d.display();
    }
}
