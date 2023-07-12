package Test;
/*Create a superclass called Shape with an abstract method calculateArea() 
that returns the area of the shape. Implement subclasses Rectangle, Circle, 
and Triangle that inherit from the Shape class. 
Implement the calculateArea() method in each subclass to calculate and 
return the area of a rectangle, circle, and triangle, respectively. 
Then, create a class called ShapeCalculator with a method printArea(Shape shape) 
that accepts an object of type Shape and prints its area. 
Demonstrate polymorphism by passing instances of different subclasses to the printArea() method.*/
public class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;      
    }

    public void printArea() {
        System.out.println("Area of rectangle is: "+ calculateArea());
    }

}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void printArea() {
        System.out.println("Area of circle is: " + calculateArea());
    }
    
}

class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public void printArea() {
        System.out.println("Area of triangle is: " + calculateArea());
    }
    
}

class ShapeCalculator {
       public  double printArea(Shape shape){
              return 0;
       }
           
       public static void main(String[] args) {
            Shape shape = new Shape();
              shape.calculateArea();
              Rectangle rect = new Rectangle(20.0,10.0);
               rect.printArea();
              Circle cir = new Circle(5.0);
               cir.printArea();
              Triangle tri = new Triangle(15.0,10.0);
                tri.printArea(); 
              
       }
}

