package encapsulation;

class Person{
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
        
    }
}


public class Encaps1 {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setAge(50);
    }
    
}
