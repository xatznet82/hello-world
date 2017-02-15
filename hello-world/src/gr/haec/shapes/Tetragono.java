package gr.haec.shapes;

public class Tetragono extends Shape {
	
	double side;

	public Tetragono(String colour , double side) {
		super(colour);
		this.side=side;
		System.out.println("Κατασκευάζω ένα " + colour + " τετράγωνο...");
		
	}
	
	void setArea() { 
		area = side * side;
		}
	
	void setPerimeter() {
		perimeter = side * 4;
		}
	
	public String toString () {
		return "Ειμαι ενα " + colour + " τετραγωνο με πλευρα " + side;
	}
	

	public static void main(String[] args) {
		
		Tetragono square1 = new Tetragono ("blue",4);
	
		System.out.println(square1);
		square1.toString();

	}

}
