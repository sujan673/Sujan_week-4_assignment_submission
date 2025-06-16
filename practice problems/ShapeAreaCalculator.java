abstract class ShapeArea {
    abstract double AreaCalculation();

}
// forming rectangle from shapearea
class Rectangle extends ShapeArea {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double AreaCalculation() {
        return length*breadth;  
    }
}
// forming circle from shapearea
class Circle extends ShapeArea {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double AreaCalculation() {
        return 3.14*radius*radius;
    }
}
// forming triangle from shapearea
class Triangle extends ShapeArea {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;    
    }
    @Override
    double AreaCalculation(){
        return 1/2*base*height;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        ShapeArea[] shapes = {new Rectangle(2, 4), new Circle(2), new Triangle(3, 6)};
    
    double totalArea = 0;
    
    for (ShapeArea s: shapes) {
        double area = s.AreaCalculation();
        System.out.println("Area: " + area);
        totalArea += area;
    }
    System.out.println("Total area: " +totalArea);
    }
}