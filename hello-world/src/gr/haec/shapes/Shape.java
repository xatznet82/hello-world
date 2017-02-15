package gr.haec.shapes;

	public class Shape {
	
	double area;
	double perimeter;
	String colour;
	
	public Shape(String colour) {
		this.colour=colour;
		System.out.println("Κατασκευάζω ένα σχήμα...");
	}

	double getArea() {
		return area;
	}
	
	double getPerimeter() {
		return perimeter;
	}
	
	String getColour() {
		return colour;
	}
	
	void setArea () { 
		System.out.println(" Υπολογιζω το εμβαδον για το σχήμα : ");
	}
	
	void setPerimeter () { 
		System.out.println(" Υπολογιζω τη περιμετρο για το σχήμα : ");
	}
	
	void setColour () { 
		System.out.println(" Υπολογιζω το χρώμα για το σχήμα : ");
	}

}
