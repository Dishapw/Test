package Test;
/*Create an interface called Drawable with a method draw() that has no implementation. 
Implement this interface in classes Circle and Rectangle. 
Write a program that creates objects of Circle and Rectangle and calls the draw() method on each object.*/

interface Drawable{
    void draw();
}

class Circle implements Drawable{

   // @Override
    public void draw() {
       System.out.println("Drawing circle...");
    }
    
}

class Rectangle implements Drawable{

   // @Override
    public void draw() {
       System.out.println("Drawing rectangle...");
    }
}

class DrawableMain {
    public static void main(String[] args) {
       Drawable d = new Circle();
       d.draw();
 
       Drawable d1 = new Rectangle();
       d1.draw();
        
    }
}







