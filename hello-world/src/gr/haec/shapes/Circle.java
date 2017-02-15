package gr.haec.shapes;

public class Circle {
	
	double side3;			// side 3 double
	
	public Circle (double side3) {			// Constructor Circle(double)
		this.side3=side3;
	}

	double CircleArea () {			// method that returns circle  area
		double circleArea = 3.14 * side3 * side3;
		return circleArea;
		}
	
	double CirclePerimeter () {			// method that returns circle perimeter
		double circlePerimeter = 2 * 3.14 * side3; 
		return circlePerimeter;
	    }
	
	void printCircleArea() {			// method that prints circle area
		System.out.println("Circle area is : " + CircleArea());
	}
	
	void printCirclePerimeter () {			// method that prints circle perimeter
		System.out.println ("Circle perimeter is : " + CirclePerimeter());
	}
	
}
