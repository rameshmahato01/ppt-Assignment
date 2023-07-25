package basicpgm;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Child class inheriting from Shape
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Another child class inheriting from Shape
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		  Shape shape1 = new Shape();
	        Shape circle = new Circle();
	        Shape rectangle = new Rectangle();
	        shape1.draw(); 
	        circle.draw(); 
	        rectangle.draw(); 

	}

}
