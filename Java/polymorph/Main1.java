package polymorph;

class ProgrammingLanguage{
    public void display(){
        System.out.println("I am Programing language");
    }
}

class Java extends ProgrammingLanguage{
    public void display(){
        System.out.println("I am object oriented programming language");
    }
}
public class Main1 {
   
    public static void main(String[] args) {
      
        ProgrammingLanguage obj ;
    obj = new ProgrammingLanguage();
        obj.display();

        obj=new Java();
        obj.display();
    }
    
}
