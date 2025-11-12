//Interface
interface Shape {
    double area();
    double perimeter();
    double volume();
}

//Abstract class
abstract class AbstractShape implements Shape {
    double radius;
    AbstractShape(double r){
        radius = r;
    }
}

//Circle (2D Shape)
class Circle extends AbstractShape {
    Circle(double r){
        super(r);
    }
    public double area(){
        return 3.14 * radius * radius;
    }
    public double perimeter(){
        return 2 * 3.14 * radius;
    }
    public double volume(){
        return 0;
    }
}

//Sphere (3D Shape)
class Sphere extends AbstractShape {
    Sphere(double r){
        super(r);
    }
    public double area(){
        return 4 * 3.14 * radius * radius;
    }
    public double perimeter(){
        return 0;
    }
    public double volume(){
        return (4.0/3) * 3.14 * radius * radius * radius;
    }
}

//Final utility class
final class ShowResult {
    static void display(Shape s, String name) {
        System.out.println(name + " Area: " + s.area());
        System.out.println(name + " Perimeter: " + s.perimeter());
        System.out.println(name +" Volume: " + s.volume());
        System.out.println("-----------------------------");
    }
}

//Main Class
public class ShapeCalcuratorEasy {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape s = new Sphere(3);
        ShowResult.display(c, "Circle");
        ShowResult.display(s, "Sphere");
    }
}