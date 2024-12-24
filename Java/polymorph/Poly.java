package polymorph;


class Polygon{
    //method to render a shape
    public void render(){
        System.out.println("Rendering Polygon");
    }
}

class Square extends Polygon{
    //render square

    public void render(){
        System.out.println("Rendering Square");
    }
}

class Circle extends Polygon{
    //render circle

    public void render(){
        System.out.println("Rendring Circle");
    }
}
public class Poly{
public static void main(String [] args){
    Square s1 = new Square();
    Circle obj = new Circle();

    s1.render();
    obj.render();
   
}
}