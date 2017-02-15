package gr.haec.shapes;

public class MainClass {
	
	public static void main (String [] args) {
		
		Square tetragono = new Square(3);				// construct instance tetragono 
		tetragono.printSquareArea();					// print tetragono area
		tetragono.printSquarePerimeter ();				// print tetragono perimeter 
		
		Triangle trigono = new Triangle(6,9);			// construct instance trigono 
		trigono.printTriangleArea();					// print trigono area
		trigono.printTrianglePerimeter();				// print trigono perimeter
		
		Circle kyklos = new Circle(5);					// construct instance kyklos
		kyklos.printCircleArea();						// print kyklos area
		kyklos.printCirclePerimeter();					// print kyklos perimeter
				
	}

}
